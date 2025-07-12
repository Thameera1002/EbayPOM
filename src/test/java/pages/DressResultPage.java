package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressResultPage extends BasePage{
    public DressResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='India']")
    private WebElement chkIndia;

    public void clickOnIndiaCheckBox(){
        chkIndia.click();
    }
}
