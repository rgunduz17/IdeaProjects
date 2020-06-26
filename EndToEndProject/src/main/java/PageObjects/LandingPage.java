package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    By signIn = By.linkText("LOGIN");

    public WebElement getLogIn(){
        return driver.findElement(signIn);
    }






}
