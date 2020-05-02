package com.gunduz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {

        // Every object may NOT have ID, className, name, Xpath and Css preferred

        // Alpha numeric id may vary on every refresh of the browser

        // ClassName should not have spaces- Compound classes cannot be accepted

        // For the same values, Selenium starts scanning from TOP LEFT and find the given value

        System.setProperty("webdriver.chrome.driver", "//Users//ridvangunduz//Desktop//selenium//chromedriver");

        WebDriver driver = new ChromeDriver();

        /*

        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("This is my first code");
        driver.findElement(By.name("pass")).sendKeys("Enter your password");
        driver.findElement(By.linkText("Forgot account?")).click();
        driver.close();



        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("Hello");
        driver.findElement(By.name("pw")).sendKeys("12345");
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.id("username")).sendKeys("SecondTry");
        driver.findElement(By.name("pw")).sendKeys("54321");
        driver.findElement(By.linkText("Forgot Your Password?")).click();
        driver.findElement(By.id("un")).sendKeys("Forget my username");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.linkText("Cancel")).click();
        driver.close();

*/

        // HOW TO GET XPATH:
        // 1. Right click on element and choose inspect
        // 2. Go to source code and right click on it and choose copy XPath
        //  Example XPath:   //*[@id="Login"]

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("Hello");
        driver.findElement(By.name("pw")).sendKeys("12345");
        // XPath: //*[@id="Login"]
        driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
        // Be careful while pasting  double quote inside double quote
        // Either change it to single quote or provide \" pathName \"

        // Username XPath:   //*[@id="username"]
        // Password XPath:   //*[@id="password"]
        // Forget Password XPath: //*[@id="forgot_password_link"]



        // HOW TO GET CSS Path:
        // 1. Right click on element and choose inspect
        // 2. Go to source code and right click on it and choose copy Css Selector
        //  Example Css Path:   #username

        driver.get("https://login.salesforce.com/");
        //driver.findElement(By.cssSelector("#username")).sendKeys("Username entered");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Username entered");
        driver.findElement(By.cssSelector("#password")).sendKeys("Password entered");
        driver.findElement(By.cssSelector("#Login")).click();
        // driver.findElement(By.xpath("//a[@id='signup_link']")).click();
        // driver.findElement(By.cssSelector("#signup_link")).click();

        //  to get the text or (error message) from web browser: getText()
     //   System.out.println(driver.findElement(By.cssSelector("#error")).getText());

        //     VALIDATING XPath And CSS Path

        //    For XPath:
        //   1. Get the Xpath as usual(Right click,choose inspect and choose copy XPath)
                //  Ex: //*[@id="username"]

        //   2. Go to browser console and type : $x("") inside quote copy the XPath
                //  Ex: $x("//*[@id='username']")  ==>   do not forget to change double quote to single quote

/*
          CREATE CUSTOM XPATH:

           tagName    attribute      value       attribute     value
          <input      name=        "username"    id=           "username"    >

                    //tagName[@attribute="value"]
              Ex:   //input[@id="username"]

           <a class="button secondary" id="signup_link" href="https://www.salesforce.com/form/trial/freetrial.jsp?d=70130000000Enus">Try for Free</a>

                Ex2:  //a[@id="signup_link"]
 */
        //     For Css Path:
        //    1. Get the selector as usual(Right click,choose inspect and choose copy selector)
                // Ex:  #username

        //   2. Go to browser console and type : $("")  inside quote copy Css Selector
                // Ex: $("#username")


        /*
            CREATE CUSTOM CSS PATH
                             attribute  value
     <a class="button secondary" id="signup_link" href="https://www.salesforce.com/form/trial/freetrial.jsp?d=70130000000Enus">Try for Free</a>

                #Value
            Ex:  #signup_link

         */

    }
}