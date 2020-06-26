package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){

        if(browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        }else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if(browserType.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }else{
            System.out.println("Given browser type does not exist. (Driver = null!)" +
                               "Chrome Browser will be used as default browser");
            return new ChromeDriver();
        }

    }

    public static void Manage(WebDriver driver){

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().deleteAllCookies();
    }

    public static void getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
    {
        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        File source =takesScreenshot.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir")+"//reports//"+testCaseName+".png";
        FileUtils.copyFile(source,new File(destinationFile));



    }


//    public static String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
//
//    {
//
//        Calendar calendar = Calendar.getInstance();
//
//        SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyy_hh_mm_ss");
//
//        //String png= System.currentTimeMillis()+ ".png";
//
//        TakesScreenshot ts=(TakesScreenshot) driver;
//
//        File source =ts.getScreenshotAs(OutputType.FILE);
//
//    //    String destinationFile = System.getProperty("user.dir")+"//reports//"+testCaseName+formater.format(calendar.getTime())+".png";
//
//        String destinationFile = System.getProperty("//Users//ridvangunduz//IdeaProjects//EndToEndProject//reports"+testCaseName+formater.format(calendar.getTime())+".png");
//
//        FileUtils.copyFile(source,new File(destinationFile));
//
//        return destinationFile;
//
//    }

}
