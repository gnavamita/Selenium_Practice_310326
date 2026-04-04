package ui;

import org.testng.annotations.*;

public class LoginTest {

    @BeforeTest
    public void loginToApp() {
        System.out.println("login to app");
    }

    @AfterTest
    public void logoutToApp() {
        System.out.println("logout from app");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("connect to DB");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("disconnect to DB");
    }

    @Test(priority = 1, description = "This is a login test")
    public void aTest1() {
        System.out.println("test1");
    }

    @Test(priority = 0, description = "This is a logout test")
    public void aTest2() {
        System.out.println("test2");
    }
}
