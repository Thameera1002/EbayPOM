package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.BrowserFactory;

import java.nio.file.WatchEvent;

public class BaseTest {
    protected WebDriver driver;

    protected BrowserFactory browserFactory = BrowserFactory.getBrowserFactory();

    @BeforeMethod
    public void init(){
        driver = browserFactory.getWebDriver();
    }

    @AfterMethod
    public void tearDown(){
        browserFactory.quitDriver();
    }
}
