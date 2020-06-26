package HomePage;


import PageObjects.LandingPage;
import PageObjects.LogInPage;
import Utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePage {



    @Test(dataProvider = "getData")
    public void homePageLogin(String username, String password) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverFactory.Manage(driver);
        driver.get("https://www.rahulshettyacademy.com/#/index");
        Thread.sleep(2000);

        LandingPage landingPage= new LandingPage(driver);
        landingPage.getLogIn().click();


        LogInPage logInPage = new LogInPage(driver);
        logInPage.getUserName().sendKeys(username);
        logInPage.getPassword().sendKeys(password);

        logInPage.LogInButton().click();

        driver.quit();


    }

    @DataProvider
    public Object[][] getData(){
        Faker faker = new Faker();

    return new Object[][]{
            {faker.name().username(), faker.number().digits(8)},
            {"testemail@gmail.com", "test12345"}
    };
    }



}
