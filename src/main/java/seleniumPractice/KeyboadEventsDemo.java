package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboadEventsDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://extendsclass.com/");
        driver.manage().window().maximize();
        WebElement sourceText = driver.findElement(By.xpath(".."));
        Actions actions = new Actions(driver);
        actions.keyDown(sourceText, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
        WebElement destinationarea = driver.findElement(By.xpath(".."));
        actions.keyDown(destinationarea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();

    }
}
