package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

    public WebDriver driver;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.id("user_email");

    public WebElement getUserName(){
        return driver.findElement(username);
    }

    By password = By.id("user_password");

    public WebElement getPassword(){
        return driver.findElement(password);
    }

    By LogInButton = By.name("commit");

    public WebElement LogInButton(){
        return driver.findElement(LogInButton);
    }
}
