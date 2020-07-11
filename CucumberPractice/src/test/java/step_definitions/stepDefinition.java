package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import WebDriverFactory.base;
//Given steps are used to describe the initial context of the system.
//When steps are used to describe an event, or an action.
//Then steps are used to describe an expected outcome, or result.
//And This can be helpful when you have some steps that are effectively a list of things,
//      so you can express it more like bullet points where otherwise the natural language of And

@RunWith(Cucumber.class)
public class stepDefinition extends base {

    // Use Tidy Gherkin Chrome plugin to create this page automatically.
    // Basically copy and paste login.feature page into plugin
    // https://chrome.google.com/webstore/detail/tidy-gherkin/nobemmencanophcnicjhfhnjiimegjeo?hl=en-GB

    @Given("^Initialize the browser$")
    public void initializeTheBrowser()  {
        driver = base.getDriver("chrome");
    }

    @When("^Navigate to \"([^\"]*)\"$")
    public void navigateToSomething(String url)  {
        driver.get(url);
       // driver.get("https://qa2.vytrack.com/user/login");
    }

    @When("^Login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void loginWithSomethingAndSomething(String username, String password) throws Throwable {
        driver.findElement(By.id("prependedInput")).sendKeys(username);
        driver.findElement(By.id("prependedInput2")).sendKeys(password);

    }

    @And("^Click on login button$")
    public void clickOnLoginButton()  {
        driver.findElement(By.id("_submit")).click();
    }
    @Then("^Successfully validate page title$")
    public void successfullyValidatePageTitle() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(),"Dashboard");
    }

    @And("^Closes the browser$")
    public void closesTheBrowser()  {
        driver.quit();
    }


    @When("^Login with (.+) and (.+)$")
    public void loginWithAnd(String username, String password)  {
        driver.findElement(By.id("prependedInput")).sendKeys(username);
        driver.findElement(By.id("prependedInput2")).sendKeys(password);
    }





































//    @Given("^Initialize the browser$")
//    public void initialize_the_browser() throws Throwable {
//        driver = base.getDriver("chrome");
//        base.Manage(driver);
//    }
//
//
//    @When("^Navigate to \"([^\"]*)\"$")
//    public void navigate_to_something(String strArg1) throws Throwable {
//        driver.get(strArg1);
//    }
//
//    @Then("^User enters \"([^\"]*)\" and \"([^\"]*)\" and click login button$")
//    public void user_enters_something_and_something_and_click_login_button(String strArg1, String strArg2) throws Throwable {
//        driver.findElement(By.id("prependedInput")).sendKeys(strArg1);
//        driver.findElement(By.id("prependedInput2")).sendKeys(strArg2);
//        driver.findElement(By.id("_submit")).click();
//    }
//
//
//
//    @And("^Closes the browser$")
//    public void closes_the_browser() throws Throwable {
//        driver.quit();
//    }

}








































    // VyTrack Login with Multiple Credentials
/*
    @Given("^Initialize the browser with default browser$")
    public void initalize_the_browser_with_default_browser() throws Throwable {
        driver= base.getDriver("chrome");
        base.Manage(driver);

    }

    @Given("^Navigate to \"([^\"]*)\"$")
    public void navigate_to_something(String mainPageUrl) throws Throwable {
        driver.get(mainPageUrl);
    }

    @Given("^Click on login button and navigate login page$")
    public void click_on_login_button_and_navigate_login_page() throws Throwable {
        driver.navigate().to("https://qa2.vytrack.com/");
    }


    @When("^User enters (.+) and (.+) and click login button$")
    public void user_enters_and_and_click_login_button(String username, String password) throws Throwable {
        driver.findElement(By.id("prependedInput")).sendKeys(username);
        driver.findElement(By.id("prependedInput2")).sendKeys(password);
        driver.findElement(By.id("_submit")).click();


    }

    @Then("^Verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
        Thread.sleep(3000);
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.equalsIgnoreCase("Dashboard"));

    }


    @And("^Closes the browser$")
    public void closesTheBrowser() {
        driver.quit();
    }



 */