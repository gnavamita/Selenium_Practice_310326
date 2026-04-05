package ui;

import org.testng.annotations.*;

@Test(groups = "User-registration")
public class GroupDemoTest {

    @Test(priority = 1, groups = "regression")
    public void aTest1() {
        System.out.println("test1");
    }

    @Test(priority = 0, groups = "regression")
    public void bTest2() {
        System.out.println("test2");
    }

    @Test(groups = {"regression","bvt"})
    public void bTest3() {
        System.out.println("test3");
    }

    @Test(groups = "bvt")
    public void bTest4() {
        System.out.println("test4");
    }

}

