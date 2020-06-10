package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        driver.get("http://google.com");
        System.out.println(driver.getTitle());

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        if (actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

//        driver.navigate().to("https://www.facebook.com/");
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();

      //  driver.close();
      //  driver.quit();




//        WebDriverManager.firefoxdriver().setup();
//        FirefoxDriver driver1= new FirefoxDriver();
//        driver1.get("http://google.com");
//
//        WebDriverManager.edgedriver().setup();
//        EdgeDriver driver2 = new EdgeDriver();
//        driver2.get("http://google.com");


    }

}
