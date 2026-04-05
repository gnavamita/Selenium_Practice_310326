package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultSelectDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
        driver.manage().window().maximize();

        WebElement ddown = driver.findElement(By.id("select-input-373456"));
        ddown.click();
        Select select = new Select(ddown);
        select.selectByValue("option-174591");

    }
}
