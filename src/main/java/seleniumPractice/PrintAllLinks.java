package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintAllLinks {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/?utm_medium=organic&utm_source=search.yahoo.com");
        driver.manage().window().maximize();
        List<WebElement> allTages = driver.findElements(By.tagName("a"));
        System.out.println("Total tags are : " + allTages.size());
        for (int i = 0; i < allTages.size(); i++){
            System.out.println("liks on page are : "+ allTages.get(i).getAttribute("href"));
            System.out.println("liks on page are : "+ allTages.get(i).getText());
        }


    }
    }
