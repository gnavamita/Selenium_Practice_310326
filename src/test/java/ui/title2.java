package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class title2 {
    @Test
    public void TitleTest() {
        SoftAssert softassert = new SoftAssert();
        String ExpectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        String expectedText = "Search";
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        String actualTitle = driver.getTitle();
        System.out.println("verifying title");
        softassert.assertEquals(actualTitle, ExpectedTitle, "Title verification failed");
        String actualText = driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]")).getAttribute("value");
        System.out.println("verifying text");
        softassert.assertEquals(actualText, expectedText, "Text verification failed");
        System.out.println("closing browser");
        driver.close();

    }
}
