package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.Hooks;

public class ShoppingSearchStep {
   private WebDriver driver;
   private LoginPage loginPage;
   private ProductsPage productsPage;

    @Given("user is on the electronics page")
    public void userIsOnTheElectronicsPage() {
        driver = Hooks.driver;
        driver.get("https://shop.qaautomationlabs.com/index.php");

        loginPage = new LoginPage(driver);
        loginPage.login("demo@demo.com", "demo");
        loginPage.clickLoginButton();
        productsPage = new ProductsPage(driver);
        productsPage.clickElectronicsButton();
    }

    @When("user searches for {string}")
    public void userSearchesFor(String searchText) {
        productsPage.setSearchInput(searchText);
    }

    @Then("Samsung Mobile should be displayed")
    public void samsungMobileShouldBeDisplayed() {
        Assert.assertTrue(productsPage.isProductDisplayed());
    }
}
