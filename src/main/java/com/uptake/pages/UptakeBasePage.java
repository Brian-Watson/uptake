package com.uptake.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UptakeBasePage {
    protected static WebDriver driver;

    @FindBy(id="menu-item-4164")
    protected WebElement headerApproachLink;

    @FindBy(id="menu-item-4163")
    protected WebElement headerPlatformLink;


    public static void initDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    public void pickApproach() {
        headerApproachLink.click();
    }
}
