package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.google.co.in/");

        // Storing Title name in the String variable
        String title = driver.getTitle();

        // Storing Title length in the Int variable
        int titleLength = driver.getTitle().length();

        // Printing Title & Title length in the Console window
        System.out.println("Title of the page is : " + title);
        System.out.println("Length of the title is : "+ titleLength);

        // Storing URL in String variable
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals("https://www.google.co.in")) {
            System.out.println("Verification Successful - The correct Url is opened.");
        }else { // url does not end with / ==> failed
            System.out.println("Verification Failed - An incorrect Url is opened.");
        }

        System.out.println("Actual Url is: "+ actualUrl);


        // Storing Page Source in String variable
        String pageSource = driver.getPageSource();

        // Storing Page Source length in Int variable
        int pageSourceLength = pageSource.length();

        // Printing length of the Page Source on console
        System.out.println("Total length of the Page Source is : " + pageSourceLength);
        // System.out.println(pageSource);


        driver.close();
    }
}
