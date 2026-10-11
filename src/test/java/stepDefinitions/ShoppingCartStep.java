package stepDefinitions;

import static org.junit.Assert.assertTrue;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.Hooks;

public class ShoppingCartStep {
    private WebDriver driver;
    private LoginPage loginPage;
    private ProductsPage productsPage;
    private CartPage cartPage;

    @Given("user is logged in")
    public void userIsLoggedIn() {

        driver = Hooks.driver;
        driver.get("https://shop.qaautomationlabs.com/index.php");

        loginPage = new LoginPage(driver);
        loginPage.login("demo@demo.com", "demo");
        loginPage.clickLoginButton();

    }

    @When("user adds a product to the cart")
    public void userAddsAProductToTheCart() {
        productsPage = new ProductsPage(driver);
        productsPage.clickElectronicsButton();
        productsPage.clickAddToCartButton();
    }

    @And("user opens the cart")
    public void userOpensTheCart() {
        cartPage = new CartPage(driver);
        cartPage.openCart();

    }

    @Then("the product should be displayed in the cart")
    public void theProductShouldBeDisplayedInTheCart() {
        assertTrue(cartPage.isProductDisplayed());
    }


}
