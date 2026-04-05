package ui;

import org.testng.annotations.*;

@Test
public class GroupDemo2 {

    @Test(groups = "User-registration")
    public class GroupDemoTest {

        @BeforeClass
        public void beforeClass() {
            System.out.println("run this before class");
        }

        @BeforeGroups(value = "regression")
        public void beforeGroup() {
            System.out.println("run this method before regression");
        }

        @AfterGroups(value = "regression")
        public void afterGroup() {
            System.out.println("run this method after regression");
        }


        @Test(priority = 1, groups = "regression")
        public void aTest1() {
            System.out.println("test1");
        }

        @Test(priority = 0, groups = "regression")
        public void bTest2() {
            System.out.println("test2");
        }

        @Test(groups = {"regression", "bvt"})
        public void bTest3() {
            System.out.println("test3");
        }

        @Test(groups = "bvt")
        public void bTest4() {
            System.out.println("test4");
        }

        @AfterClass
        public void afterClass() {
            System.out.println("run this after class");
        }
    }
}
