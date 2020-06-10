import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class ChromeBrowser {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","//Users/ridvangunduz//Documents//Selenium//Webdrivers//chromedriver");

        //Creating Driver object for Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Goes to given url
        driver.get("http://google.com");

        driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();


    }
}
