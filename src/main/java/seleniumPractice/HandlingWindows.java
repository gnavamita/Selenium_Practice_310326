package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandlingWindows {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("signup_link")).click();
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);
        Iterator<String> iterator = windows.iterator();
        String parentwindow = iterator.next();
        System.out.println("parentwindow :" +parentwindow);

        String childwindow = iterator.next();
        System.out.println("childwindow :" +childwindow);

        driver.switchTo().window(childwindow);

        driver.findElement(By.name("UserFirstName")).sendKeys("RVUserLastName");
        driver.findElement(By.name("UserLastName")).sendKeys("Acedemy");
        driver.switchTo().window(parentwindow);
    }
}
