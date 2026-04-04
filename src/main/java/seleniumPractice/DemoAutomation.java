package seleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {
    public static void main(String[] args) {


        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }
}
