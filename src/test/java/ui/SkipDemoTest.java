package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {

    Boolean dataSetup = false;

    @Test(enabled = false)
    public void skipTest1(){
        System.out.println("skipping the test as its not complete");
    }

    @Test
    public void skipTest2(){
        System.out.println("skipping the test as its not complete");
        throw new SkipException("skipping the test");
    }

    @Test
    public void skipTest3(){
        System.out.println("skipping the test as its not complete");
        if (dataSetup == true){
            System.out.println("execute the test");
        }
        else {
            System.out.println("Do not execute");
            throw new SkipException("Do not execute Exception statement");
        }
    }
}
