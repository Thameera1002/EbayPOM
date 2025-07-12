package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EbayHomePage extends BasePage{
    public EbayHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "gh-ac")
    private WebElement searchField;

    @FindBy(id="gh-cat")
    private WebElement selectCategory;

    @FindBy(xpath = "//span[text()='Search']")
    private  WebElement clickOnSearch;

    String categoryName;

    public void fillSearchField(String searchText){
        searchField.sendKeys(searchText);
    }

    public void selectCategoryFromDD(String category){
        categoryName = category;
        new Select(selectCategory).selectByVisibleText(category);
    }

    public <T> T clickOnSearchButton(){
        clickOnSearch.click();
        if(categoryName.equalsIgnoreCase(" Cell Phones & Accessories")){
            return (T) PageFactory.initElements(driver, MobileResultPage.class);
        } else if (categoryName.equalsIgnoreCase(" Clothing, Shoes & Accessories")) {
            return (T) PageFactory.initElements(driver, DressResultPage.class);
        }
        return null;
    }

}
