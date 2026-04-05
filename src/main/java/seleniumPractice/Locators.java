package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
    public static String browser = "chrome";
    public static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.get("https://www.saucedemo.com/");
       // driver.findElement(By.id("user-name")).sendKeys("standard_user");
       //driver.findElement(By.className("input_error form_input")).sendKeys("standard_user");
      // driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
       //river.findElement(By.tagName("input")).sendKeys("standard_user");
       driver.findElement(By.tagName("input")).sendKeys("standard_user");


    }
}
