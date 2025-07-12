package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobileResultPage extends BasePage {
    public MobileResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Apple']")
    private WebElement chkApple;

    public void clickOnAppleCheckBox(){
        chkApple.click();
    }
}
