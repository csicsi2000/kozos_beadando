package com.fsfkp7.w8zvov.jlpkl0.rft_beadand.data;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ISubject;

public class Subject extends ISubject {
    /**
     * name of the subject
     */
    public String getName(){
        return name;
    }
    /**
     * price per hour
     */
    public int getPrice(){return price;}

    public Subject(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
