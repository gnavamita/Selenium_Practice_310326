package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/a[2]")).click();
        WebElement ddown = driver.findElement(By.name("input_8"));
        Select select = new Select(ddown);
        select.selectByValue("level1");
        select.selectByIndex(5);
        select.selectByVisibleText("501 - 1,000 employees");
    }
}
