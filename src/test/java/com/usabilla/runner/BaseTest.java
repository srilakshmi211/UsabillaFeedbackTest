package com.usabilla.runner;

import com.usabilla.pom.BasePage;
import com.usabilla.pom.FeedbackSuccessScreen;
import com.usabilla.pom.GenericFeedbackForm;
import com.usabilla.pom.MainFeedbackForm;
import com.usabilla.utilities.Helper;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

@CucumberOptions(
        features = {"src/test/features/"},
        glue = {"com/usabilla/stepdefinitions"},
        plugin = {"pretty", "html:target/cucumber"}
)

public class BaseTest extends AbstractTestNGCucumberTests {

    private static WebDriver driver;

    @BeforeSuite
    public void setUp() {
        Helper.initialiseDriver();
        driver = Helper.getDriver();
        new MainFeedbackForm();
        new GenericFeedbackForm();
        new FeedbackSuccessScreen();
        driver.get(BasePage.URL);
        driver.manage().window().fullscreen();

        String screenshotFolder = System.getProperties().get("user.dir") + "/screenshots";
        Helper.deleteFolderIfExists(screenshotFolder);
    }

    @AfterMethod
    public void afterMethod(ITestResult testResult) throws IOException {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            Helper.snapScreenShot("FAIL", testResult.getName(), driver);
        }
        Helper.getDriver().navigate().refresh();
    }

    @AfterSuite
    public void tearDown() {
        driver.close();
    }
}