package com.uptake.pages;

import com.uptake.Functions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UptakeBasePage {
    protected static WebDriver driver;
    protected static WebDriverWait wait;


    @FindBy(id="menu-item-4164")
    protected WebElement headerApproachLink;

    @FindBy(id="menu-item-4163")
    protected WebElement headerPlatformLink;


    public static void initDriver(WebDriver webDriver) {
        driver = webDriver;
        wait = new WebDriverWait(driver, 15);

    }

    public void pickApproach() {
        headerApproachLink.click();
    }
    public void pickPlatform() {
        headerPlatformLink.click();
    }






    public void scrollIntoView(WebElement webElement) {
        // Handle scrolling to avoid the main navigation menu at the top
        executeJavaScriptInBrowser("window.scrollTo(" + webElement.getLocation().getX() + "," + (webElement.getLocation().getY()- 100) + ");");
    }

    protected void executeJavaScriptInBrowser(final String javascriptCommand) {
        try{
            ExpectedCondition<Boolean> javascriptComplete = new
                    ExpectedCondition<Boolean>() {
                        public Boolean apply(WebDriver driver) {
                            return ((JavascriptExecutor)driver).executeScript(javascriptCommand).equals("complete");
                        }
                    };

            wait.until(javascriptComplete);
        } catch (Exception e)
        {
            Functions.sleep(.5);
        }
    }


}
