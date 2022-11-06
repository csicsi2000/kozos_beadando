package com.fsfkp7.w8zvov.jlpkl0.rft_beadand;

import com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data.Teacher;

/**
 *
 */
public final class StaticTeacher {
    private StaticTeacher() {

    }

    private static Teacher myTeacher;

    public static void setMyTeacher(Teacher teacher) {
        myTeacher = teacher;
    }

    public static Teacher getMyTeacher() {
        return myTeacher;
    }
}
