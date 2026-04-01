package TestNG_Practice_310326;

import org.testng.annotations.*;

public class Annotation_practice {

    @Test
    public void testCase1(){
        System.out.println("this is a nomal test case");
    }

    @BeforeMethod
    public void beforeMtehod(){
        System.out.println("This will execute before every method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("this will execute after every method");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This will execute before every test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This will execute after every test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This will execute before test suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("This will execute after test suite");
    }



}
