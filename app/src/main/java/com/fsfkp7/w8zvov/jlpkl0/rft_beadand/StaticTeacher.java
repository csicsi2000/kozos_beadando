package com.fsfkp7.w8zvov.jlpkl0.rft_beadand;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Teacher;

/**
 *
 */
public final class StaticTeacher {
    private StaticTeacher() {

    }

    private static ITeacher myTeacher;

    public static void setMyTeacher(ITeacher teacher) {
        myTeacher = teacher;
    }

    public static ITeacher getMyTeacher() {
        return myTeacher;
    }
}
