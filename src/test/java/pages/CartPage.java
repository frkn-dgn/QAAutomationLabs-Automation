package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    @FindBy(css = "[data-testid='header-cart-link']")
    private WebElement cartButton;

    @FindBy(css = "[data-testid='cart-item-name-61']")
    private WebElement cartItemName;

    @FindBy(id = "checkoutBtn")
    private WebElement checkoutButton;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void openCart() {
        cartButton.click();
    }

    public boolean isProductDisplayed() {
        return cartItemName.isDisplayed();
    }

    public void checkout() {
        checkoutButton.click();
    }
}
