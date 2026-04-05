package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class checkboxDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        WebElement scroll = driver.findElement(By.id("gform_submit_button_1"));
        Actions actions = new Actions(driver);
        actions.moveToElement(scroll).perform();
        driver.findElement(By.xpath("//label[text()='I would like to receive information, tips, and offers on solutions for businesses, as well as other SugarCRM products and services. ']")).click();
        System.out.println(driver.findElements(By.xpath("...")).size());


    }
}