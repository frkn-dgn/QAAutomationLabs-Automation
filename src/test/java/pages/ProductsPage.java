package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    @FindBy(css = "[data-testid='shop-now-electronics']")
    private WebElement electronicsButton;

    @FindBy(css = "[data-testid='add-to-cart-61']")
    private WebElement addToCartButton;

    @FindBy(id = "search-input")
    private WebElement searchInput;

    @FindBy(css = "[data-testid='product-name-61']")
    private WebElement samsungMobile;

    public ProductsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickElectronicsButton() {
        electronicsButton.click();
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void setSearchInput(String searchText) {
        searchInput.clear();
        searchInput.sendKeys(searchText);
    }

    public boolean isProductDisplayed() {
        return samsungMobile.isDisplayed();
    }
}
