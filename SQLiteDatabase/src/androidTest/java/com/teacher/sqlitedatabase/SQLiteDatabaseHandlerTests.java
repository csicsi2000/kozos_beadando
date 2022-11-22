package com.teacher.sqlitedatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ISubject;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.data.ITeacher;
import com.fsfkp7.w8zvov.jlpkl0.interfaces.database.IDatabaseHandler;
import com.teacher.sqlitedatabase.data.SQLSubject;
import com.teacher.sqlitedatabase.data.SQLTeacher;
import com.teacher.sqlitedatabase.databasehelpers.SubjectReaderDBHelper;
import com.teacher.sqlitedatabase.databasehelpers.TeacherReaderDBHelper;

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

        SubjectReaderDBHelper sHelper = new SubjectReaderDBHelper(testContext);
        SQLiteDatabase sdb = sHelper.getWritableDatabase();
        sHelper.deleteDB(sdb);
        sHelper.onCreate(sdb);

        TeacherReaderDBHelper tHelper = new TeacherReaderDBHelper(testContext);
        SQLiteDatabase tdb = tHelper.getWritableDatabase();
        tHelper.deleteDB(tdb);
        tHelper.onCreate(tdb);
    }

    @After
    public void finish() {

    }

    @Test
    public void TC01_GetAllData_CorrectCall_AllDataReturned(){
        // arrange
        IDatabaseHandler dbHandler = new SQLiteDatabaseHandler(testContext);
        dbHandler.addOrEditTeacher(
                new SQLTeacher(
                        -1,
                        "test tamás",
                        null,
                        new ArrayList<ISubject>(),
                        "test@gmg.com",
                        "+36278321"));
        // act
        List<ITeacher> teacherList = dbHandler.getAllTeachers();
        // assert
        Assert.assertEquals(1, teacherList.size());
    }

    @Test
    public void TC02_addTeacher_dataAdded_newDataFoundOnRead(){
        // arrange
        IDatabaseHandler dbHandler = new SQLiteDatabaseHandler(testContext);
        ClassLoader loader = testContext.getClassLoader();
        ITeacher teacher = new SQLTeacher(
                -1,
                "test tamás",
                null,
                //BitmapFactory.decodeResource(testContext.getResources(),loader.getResource("missing.jpg")),
                new ArrayList<ISubject>(),
                "test@gmg.com",
                "+36278321");
        // act
        boolean success = dbHandler.addOrEditTeacher(teacher);
        // assert
        Assert.assertEquals(true,success);

        List<ITeacher> teacherList = dbHandler.getAllTeachers();
        ITeacher firstTeacher = teacherList.get(0);
        Assert.assertEquals(1,firstTeacher.id);
        Assert.assertEquals("test tamás",firstTeacher.name);
        Assert.assertEquals("test@gmg.com",firstTeacher.email);
        Assert.assertEquals("+36278321",firstTeacher.phoneNumber);
    }

    @Test
    public void TC03_editTeacher_dataEdited_newDataCorrect(){
        // arrange
        IDatabaseHandler dbHandler = new SQLiteDatabaseHandler(testContext);
        ITeacher teacher = new SQLTeacher(
                -1,
                "test tamás",
                null,
                new ArrayList<ISubject>(),
                "test@gmg.com",
                "+36278321");
        // act
        boolean success = dbHandler.addOrEditTeacher(teacher);
        // assert
        Assert.assertEquals(true,success);

        List<ITeacher> teacherList = dbHandler.getAllTeachers();
        ITeacher firstTeacher = teacherList.get(0);
        Assert.assertEquals(1,firstTeacher.id);
        Assert.assertEquals("test tamás",firstTeacher.name);
        Assert.assertEquals("test@gmg.com",firstTeacher.email);
        Assert.assertEquals("+36278321",firstTeacher.phoneNumber);

        // second phase
        // arrange
        firstTeacher.name = "más lett a nevem";

        // act
        boolean replaceSuccess = dbHandler.addOrEditTeacher(teacher);
        List<ITeacher> replacedTeacherList = dbHandler.getAllTeachers();

        // assert
        ITeacher replacedFirstTeacher = replacedTeacherList.get(0);
        Assert.assertEquals(1,firstTeacher.id);
        Assert.assertEquals("más lett a nevem",firstTeacher.name);
        Assert.assertEquals("test@gmg.com",firstTeacher.email);
        Assert.assertEquals("+36278321",firstTeacher.phoneNumber);
    }

    @Test
    public void TC04_addTeacherAndEditSubject_subjectEdited_NewContentCorrect(){
        // arrange
        IDatabaseHandler dbHandler = new SQLiteDatabaseHandler(testContext);
        ArrayList<ISubject> subjectsArray = new ArrayList<ISubject>();
        subjectsArray.add(new SQLSubject(-1,-1,"Matek",3000));
        subjectsArray.add(new SQLSubject(-1,-1,"Történelem",2000));
        ITeacher teacher = new SQLTeacher(
                -1,
                "test tamás",
                null,
                subjectsArray,
                "test@gmg.com",
                "+36278321");
        // act
        boolean success = dbHandler.addOrEditTeacher(teacher);
        // assert
        Assert.assertEquals(true,success);

        List<ITeacher> teacherList = dbHandler.getAllTeachers();
        ITeacher firstTeacher = teacherList.get(0);
        Assert.assertEquals(1,firstTeacher.id);
        Assert.assertEquals(2,firstTeacher.subjects.size());

        // second step
        // arrange
        subjectsArray.clear();
        subjectsArray.add(new SQLSubject(-1,-1,"Informatika",3000));
        teacher.subjects = subjectsArray;
        teacher.id = firstTeacher.id;

        // act
        boolean replaceSuccess = dbHandler.addOrEditTeacher(teacher);
        List<ITeacher> replacedTeacherList = dbHandler.getAllTeachers();

        // assert
        ITeacher replacedFirstTeacher = replacedTeacherList.get(0);
        Assert.assertEquals(1,replacedFirstTeacher.id);
        Assert.assertEquals(1,replacedFirstTeacher.subjects.size());
        SQLSubject replaceFirstSubject = (SQLSubject)replacedFirstTeacher.subjects.get(0);
        Assert.assertEquals(1,replaceFirstSubject.id);
        Assert.assertEquals(1,replaceFirstSubject.teacherId);
        Assert.assertEquals("Informatika",replaceFirstSubject.name);
        Assert.assertEquals(3000,replaceFirstSubject.price);
    }
    @Test
    public void TC05_getTeacherFromPasswordAndEmail_CorrectLoginInfo_TeacherReturned(){
        // arrange
        IDatabaseHandler dbHandler = new SQLiteDatabaseHandler(testContext);
        ArrayList<ISubject> subjectsArray = new ArrayList<ISubject>();
        subjectsArray.add(new SQLSubject(-1,-1,"Matek",3000));
        subjectsArray.add(new SQLSubject(-1,-1,"Történelem",2000));
        ITeacher teacher = new SQLTeacher(
                -1,
                "test tamás",
                null,
                subjectsArray,
                "test@gmg.com",
                "+36278321");
        teacher.password = "abcde";
        // act
        boolean success = dbHandler.addOrEditTeacher(teacher);
        ITeacher foundTeacher = dbHandler.getPasswordFromEmail("test@gmg.com","abcde");

        // assert
        Assert.assertEquals(1,foundTeacher.id);
        Assert.assertEquals("test tamás",foundTeacher.name);
        Assert.assertEquals("test@gmg.com",foundTeacher.email);
        Assert.assertEquals("+36278321",foundTeacher.phoneNumber);
    }

    @Test
    public void TC06_getTeacherFromPasswordAndEmail_InvalidLoginInfo_NoTeacherReturned(){
        // arrange
        IDatabaseHandler dbHandler = new SQLiteDatabaseHandler(testContext);
        ArrayList<ISubject> subjectsArray = new ArrayList<ISubject>();
        subjectsArray.add(new SQLSubject(-1,-1,"Matek",3000));
        subjectsArray.add(new SQLSubject(-1,-1,"Történelem",2000));
        ITeacher teacher = new SQLTeacher(
                -1,
                "test tamás",
                null,
                subjectsArray,
                "test@gmg.com",
                "+36278321");
        teacher.password = "abcde";
        // act
        boolean success = dbHandler.addOrEditTeacher(teacher);
        ITeacher foundTeacher = dbHandler.getPasswordFromEmail("test@gmg.com","abc4de");

        // assert
        Assert.assertNull(foundTeacher);
    }

    @Test
    public void TC07_getIfTeacherExist_InvalidLoginInfo_NoTeacherReturned(){
        // arrange
        IDatabaseHandler dbHandler = new SQLiteDatabaseHandler(testContext);
        ArrayList<ISubject> subjectsArray = new ArrayList<ISubject>();
        subjectsArray.add(new SQLSubject(-1,-1,"Matek",3000));
        subjectsArray.add(new SQLSubject(-1,-1,"Történelem",2000));
        ITeacher teacher = new SQLTeacher(
                -1,
                "test tamás",
                null,
                subjectsArray,
                "test@gmg.com",
                "+36278321");
        teacher.password = "abcde";
        // act
        Assert.assertTrue(dbHandler.addOrEditTeacher(teacher));
        Assert.assertFalse(dbHandler.addOrEditTeacher(teacher));
    }
}
