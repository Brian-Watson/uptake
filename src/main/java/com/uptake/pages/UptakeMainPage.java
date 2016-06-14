package com.uptake.pages;

import org.openqa.selenium.support.PageFactory;

public class UptakeMainPage extends UptakeBasePage {

    public UptakeMainPage() {
        PageFactory.initElements(driver, this);
    }

    public void navigateHere() {
        driver.get("http://uptake.com");
    }
}
