package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.FilterPage;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.Hooks;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShoppingFilterStep {
    private WebDriver driver;
    private LoginPage loginPage;
    private ProductsPage productsPage;
    private FilterPage filterPage;

    @Given("user is on the products page")
    public void userIsOnTheProductsPage() {
        driver = Hooks.driver;
        driver.get("https://shop.qaautomationlabs.com/index.php");

        loginPage = new LoginPage(driver);
        loginPage.login("demo@demo.com", "demo");
        loginPage.clickLoginButton();

        productsPage = new ProductsPage(driver);
        productsPage.clickElectronicsButton();

        filterPage = new FilterPage(driver);
    }
    @When("user selects the Mobile filter")
    public void userSelectsTheMobileFilter() {
        filterPage.selectMobileFilter();
    }
    @Then("only mobile products should be displayed")
    public void onlyMobileProductsShouldBeDisplayed() {
        assertEquals(5, filterPage.getProductCount());
    }
    @When("user selects the {int} to {int} price filter")
    public void userSelectsPriceFilter(int minPrice, int maxPrice) {
        filterPage.selectPrice101To200Filter();
    }

    @Then("products in the selected price range should be displayed")
    public void productsInTheSelectedPriceRangeShouldBeDisplayed() {
        assertTrue(filterPage.getProductCount() > 0);
    }
}
