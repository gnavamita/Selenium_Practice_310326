package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebElements {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/a[2]")).click();
        driver.findElement(By.name("input_3.3")).sendKeys("tester");
        driver.findElement(By.name("input_3.3")).clear();
        System.out.println(driver.findElement(By.name("input_3.3")).getAttribute("placeholder"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getCssValue("text-transform"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getSize());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getLocation());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).getTagName());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"gform_submit_button_1\"]")).isSelected());


    }
}
