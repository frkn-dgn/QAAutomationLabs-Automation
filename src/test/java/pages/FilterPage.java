package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterPage {


    @FindBy(css = "label[for='gender-1']")
    private WebElement mobileCheckbox;

    @FindBy(css = "[data-testid='results-count']")
    private WebElement resultsCount;

    @FindBy(css = "label[for='price-2']")
    private WebElement price101To200Checkbox;

    public FilterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectMobileFilter() {
        mobileCheckbox.click();
    }

    public int getProductCount() {
        String text = resultsCount.getText();
        return Integer.parseInt(text.split(" ")[0]);
    }
    public void selectPrice101To200Filter() {
        price101To200Checkbox.click();
    }
}
