import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

    public static String chromeDriver = "webdriver.chrome.driver";
    public static String DriverPath = "//Users//ridvangunduz//Desktop//selenium//chromedriver";
    public static void main(String[] args) {

     System.setProperty(chromeDriver, DriverPath);

     WebDriver driver = new ChromeDriver();

     driver.get("https://www.google.com/");



    }
}
