package com.uptake;

import com.uptake.pages.ApproachPage;
import com.uptake.pages.UptakeBasePage;
import com.uptake.pages.UptakeMainPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SimpleTest {
    private WebDriver driver;


    @Before
    public void initStuff() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        UptakeBasePage.initDriver(driver);
    }


    @Test
    public void sampleTest() {
        UptakeMainPage mainPage = new UptakeMainPage();
        ApproachPage approachPage = new ApproachPage();

        mainPage.navigateHere();
        mainPage.pickApproach();
        approachPage.learnMoreAboutUptake();

        Functions.sleep(5);     // Do something to verify video plays

        approachPage.closeMoreAboutUptakeFancyBox();

        driver.close();
    }
}
