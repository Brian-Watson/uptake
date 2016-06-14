package com.uptake.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApproachPage extends UptakeBasePage {
    //*********************************
    //          CONTROLS
    //*********************************
    @FindBy(partialLinkText = "Learn more about Uptake")
    private WebElement learnMoreLink;

    @FindBy(xpath = "//a[@title='Close']")
    private WebElement closeFancyBox;


    //*********************************
    //         CONSTRUCTOR
    //*********************************
    public ApproachPage() {
        PageFactory.initElements(driver, this);
    }

    //*********************************
    //        PAGE ACTIONS
    //*********************************
    public void learnMoreAboutUptake() {
        scrollIntoView(learnMoreLink);
        learnMoreLink.click();
    }

    public void closeMoreAboutUptakeFancyBox() {
        closeFancyBox.click();
    }

}
