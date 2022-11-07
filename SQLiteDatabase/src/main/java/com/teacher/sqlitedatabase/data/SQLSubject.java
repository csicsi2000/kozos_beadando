package com.teacher.sqlitedatabase.data;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ISubject;

public class SQLSubject extends ISubject {
    public int teacherId;
    public SQLSubject(int id, int teacherId,String name, int pricePerHour){
        this.id =id;
        this.teacherId = teacherId;
        this.name = name;
        this.price = pricePerHour;
    }
}
