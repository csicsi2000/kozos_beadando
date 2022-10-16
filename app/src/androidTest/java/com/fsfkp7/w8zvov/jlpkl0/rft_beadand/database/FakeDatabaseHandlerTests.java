package com.fsfkp7.w8zvov.jlpkl0.rft_beadand.database;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.database.IDatabaseHandler;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(AndroidJUnit4.class)
public class FakeDatabaseHandlerTests {
    Context instrumentationContext;

    @Before
    public void setup() {
        instrumentationContext = InstrumentationRegistry.getInstrumentation().getContext();
    }

    @Test
    public void TC01_GetAllData_AllDataReturned(){
        // arrange
        IDatabaseHandler dHandler = new FakeDatabaseHandler(instrumentationContext);
        // act
        List<ITeacher> teacherList = dHandler.getAllTeachers();
        // assert
        Assert.assertEquals(5, teacherList.size());
    }
}
