package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;


import pages.LoginPage;
import utilities.Hooks;

public class LoginStep {
    WebDriver driver;
    LoginPage loginPage;


    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        driver = Hooks.driver;
        driver.get("https://shop.qaautomationlabs.com/index.php");
        loginPage = new LoginPage(driver);
    }

    @When("user enters valid credentials")
    public void userEntersValidCredentials() {

        loginPage.login("demo@demo.com", "demo");
    }

    @And("user clicks the login button")
    public void userClicksTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user should be logged in successfully")
    public void userShouldBeLoggedInSuccessfully() {
        assertTrue(loginPage.isLogoutButtonDisplayed());
    }
}
