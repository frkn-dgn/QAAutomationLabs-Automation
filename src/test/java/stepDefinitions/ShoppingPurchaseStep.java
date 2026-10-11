package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.Hooks;

import static org.junit.Assert.assertTrue;


public class ShoppingPurchaseStep {
    private WebDriver driver;
    private LoginPage loginPage;
    private ProductsPage productsPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    @Given("user is on the electronics page for purchase")
    public void userIsOnTheElectronicsPageForPurchase() {

        driver = Hooks.driver;
        driver.get("https://shop.qaautomationlabs.com/index.php");

        loginPage = new LoginPage(driver);
        loginPage.login("demo@demo.com", "demo");
        loginPage.clickLoginButton();
        productsPage = new ProductsPage(driver);
        productsPage.clickElectronicsButton();

    }

    @When("user adds Samsung Mobile to cart")
    public void userAddsSamsungMobileToCart() {
        productsPage.clickAddToCartButton();
    }

    @And("user proceeds to checkout")
    public void userProceedsToCheckout() {
        cartPage = new CartPage(driver);
        cartPage.openCart();
        cartPage.checkout();
        checkoutPage = new CheckoutPage(driver);
    }

    @And("user fills in billing details")
    public void userFillsInBillingDetails() {
        checkoutPage.fillFirstName("John");
        checkoutPage.fillLastName("Smith");
        checkoutPage.fillEmail("john@gmail.com");
        checkoutPage.fillPhone("1234567890");
        checkoutPage.fillAddress("123 Main Street");
        checkoutPage.fillState("California");
        checkoutPage.fillCity("Los Angeles");
        checkoutPage.fillPincode("90001");

    }

    @And("user continues with the order")
    public void userContinuesWithTheOrder() {
        checkoutPage.clickContinueButton();

    }

    @Then("purchase should be completed successfully")
    public void purchaseShouldBeCompletedSuccessfully() {
        checkoutPage.clickPlaceOrderButton();
        assertTrue("Purchase was not completed successfully.",checkoutPage.isOrderSuccessful()
        );
    }
}
