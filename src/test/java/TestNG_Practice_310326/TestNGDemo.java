package TestNG_Practice_310326;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGDemo {
    WebDriver driver;

    @Test
    public void f(){
        String baseurl = "https://www.toolsqa.com/";

        System.out.println("Launching google chrome browser");
        driver = new ChromeDriver();
        driver.get(baseurl);
        String testTitle = "Free Qa tool";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, testTitle);
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("starting test on chromebrowser");
    }


}


