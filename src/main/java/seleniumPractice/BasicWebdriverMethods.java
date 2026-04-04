package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicWebdriverMethods {
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
        driver.manage().window().maximize();
       String currenturl = driver.getCurrentUrl();
        System.out.println("currenturl :"+currenturl);

        String title = driver.getTitle();
        System.out.println("title :"+title);

       String pageSource = driver.getPageSource();
        System.out.println("pageSource :"+pageSource);

        driver.navigate().to("http://google.com");
        driver.close();
    }
    }
