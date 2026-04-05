package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

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

      //  driver.navigate().to("http://google.com");

      List<WebElement> webElements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
        System.out.println("webElements :"+webElements);

        driver.navigate().to("https://www.sugarcrm.com/");
       String windowhandle = driver.getWindowHandle();
        System.out.println("windowhandle :"+windowhandle);
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/a[2]")).click();
        Set<String> windowHandles=driver.getWindowHandles();
        System.out.println("windowhandles :"+ windowHandles);


        driver.close();
    }
    }
