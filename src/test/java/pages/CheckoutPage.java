package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    @FindBy(id = "firstname")
    private WebElement firstNameInput;

    @FindBy(id = "lastname")
    private WebElement lastNameInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "phone")
    private WebElement phoneInput;

    @FindBy(id = "address")
    private WebElement addressInput;

    @FindBy(id = "states")
    private WebElement stateInput;

    @FindBy(id = "city")
    private WebElement cityInput;

    @FindBy(id = "pincode")
    private WebElement pincodeInput;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(css = "[data-testid='place-order-btn']")
    private WebElement placeOrderButton;

    @FindBy(css = "[data-testid='order-success-message']")
    private WebElement orderSuccessMessage;

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void fillFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void fillLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    public void fillEmail(String email) {
        emailInput.sendKeys(email);

    }

    public void fillPhone(String phone) {
        phoneInput.sendKeys(phone);
    }

    public void fillAddress(String address) {
        addressInput.sendKeys(address);
    }

    public void fillState(String state) {
        stateInput.sendKeys(state);
    }

    public void fillCity(String city) {
        cityInput.sendKeys(city);
    }

    public void fillPincode(String pincode) {
        pincodeInput.sendKeys(pincode);
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public void clickPlaceOrderButton() {
        placeOrderButton.click();
    }

    public boolean isOrderSuccessful() {
        return orderSuccessMessage.isDisplayed()
                && orderSuccessMessage.getText()
                .contains("Your order has been placed successfully.");
    }
}

