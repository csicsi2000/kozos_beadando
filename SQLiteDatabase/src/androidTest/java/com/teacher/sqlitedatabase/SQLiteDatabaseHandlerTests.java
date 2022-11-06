package com.teacher.sqlitedatabase;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ISubject;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.database.IDatabaseHandler;
import com.teacher.sqlitedatabase.data.SQLTeacher;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

@RunWith(AndroidJUnit4.class)
public class SQLiteDatabaseHandlerTests {
    Context testContext;

    @Before
    public void setup() {
        testContext = InstrumentationRegistry.getInstrumentation().getContext();
    }

    @After
    public void finish() {
        // databaseHandler.close();
    }

    @Test
    public void TC01_GetAllData_AllDataReturned(){
        // arrange
        IDatabaseHandler dbHandler = new SQLiteDatabaseHandler(testContext);
        // act
        List<ITeacher> teacherList = dbHandler.getAllTeachers();
        // assert
        Assert.assertEquals(5, teacherList.size());
    }

    @Test
    public void TC02_addOrEditTeacher_dataAdded(){
        // arrange
        IDatabaseHandler dbHandler = new SQLiteDatabaseHandler(testContext);
        ITeacher teacher = new SQLTeacher(
                1,
                "test tamás",
                null,
                new ArrayList<ISubject>(),
                "test@gmg.com",
                "+36278321");
        // act
        boolean success = dbHandler.addOrEditTeacher(teacher);
        // assert


    }
}
