package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com");

//        driver.findElement(By.className("gb_g")).click();
        driver.findElement(By.name("q")).sendKeys("Hello World" + Keys.ENTER);

//        WebElement element = driver.findElement(By.name("q"));
//
//        element.sendKeys("Hello World" + Keys.ENTER);



    }
}
