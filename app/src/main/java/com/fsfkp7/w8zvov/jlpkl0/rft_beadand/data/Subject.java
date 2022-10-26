package com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ISubject;

public class Subject implements ISubject {
    /**
     * name of the subject
     */
    String name;
    /**
     * price per hour
     */
    int price;

    public Subject(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
