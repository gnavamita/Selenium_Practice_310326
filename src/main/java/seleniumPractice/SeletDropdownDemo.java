package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeletDropdownDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='From']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("sydney");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);



    }

}
