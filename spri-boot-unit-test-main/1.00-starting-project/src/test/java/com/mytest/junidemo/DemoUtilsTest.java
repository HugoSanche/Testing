package com.mytest.junidemo;

import com.luv2code.junitdemo.DemoUtils;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
public class DemoUtilsTest {
    DemoUtils demoUtils;

    //se ejectua antes de todos los metodos
    @BeforeEach
    void setupBeforeEach(){
        demoUtils=new DemoUtils();
        //System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @DisplayName("Equals and not Equals")
    @Test
    void testEqualsAndNotEquals(){

        System.out.println("Running test: testEqualsAndNotEquals");

        assertEquals(6,demoUtils.add(2,4),"2+4 must be 6");
        assertNotEquals(7,demoUtils.add(1,9),"1+9 must be 6");
    }

    @DisplayName("Null and not Null")
    @Test
    void testNullAndNotNull(){
        System.out.println("Running test: testNullAndNotNull");

        String str=null;
        String str2="Hugo";

        assertNull(demoUtils.checkNull(str),"Object should be null");
        assertNotNull(demoUtils.checkNull(str2),"Object should be not null");
    }

    @DisplayName("Same and not same")
    @Test
    void testSameAndNotSame(){
        String str="Luv2Code";
        assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate(),"Objects should refer to same object");
        assertNotSame(str,demoUtils.getAcademy(),"Object should not refer to same object");
    }

    @DisplayName("True and False")
    @Test
    void testTrueFalse(){
        int gradeOne=10;
        int gradeTwo=5;

        assertTrue(demoUtils.isGreater(gradeOne,gradeTwo),"This should return true");
        assertFalse(demoUtils.isGreater(gradeTwo,gradeOne),"This should return false");
    }


//    //se ejecuta despues de todos los metodos
//    @AfterEach
//    void tearDownAfterEach(){
//        System.out.println("Running @AfterEach");
//        System.out.println();
//    }
//
//    //Se ejecuta antes de todos los metodos
//    @BeforeAll
//    static void setupBeforeEachClass(){
//        System.out.println("@BeforesAll executes only once Before all test methods executions in the class");
//    }
//    //Se ejecuta despues de todos los metodos
//    @AfterAll
//    static void setupAfterEachClass(){
//        System.out.println("@AfterAll executes only once after all test methods executions in the class");
//    }
}
