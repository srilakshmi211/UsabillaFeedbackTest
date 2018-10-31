package com.usabilla.stepdefinitions;

import com.usabilla.pom.BasePage;
import com.usabilla.pom.FeedbackSuccessScreen;
import com.usabilla.pom.GenericFeedbackForm;
import com.usabilla.pom.MainFeedbackForm;
import com.usabilla.utilities.Helper;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.lang.reflect.Method;

import static org.testng.AssertJUnit.assertTrue;


public class FeedbackSteps {

    @After
    public void afterScenario(Scenario testResult) throws IOException {
        if (testResult.isFailed()) {
            Helper.snapScreenShot("FAIL", testResult.getName(), Helper.getDriver());
        }
    }

    @Given("^I am on the (.*)$")
    public void verifyPage(String name) {
        assertTrue(BasePage.validatePage(name));
        if (name.equals("feedback form")) {
            MainFeedbackForm.switchToFeedbackForm();
        } else if (name.equals("generic feedback form")) {
            GenericFeedbackForm.switchToGenericFeedbackForm();
        } else if (name.equals("feedback success screen")) {
            FeedbackSuccessScreen.switchToFeedbackSuccessScreen();
        }
    }

    @Then("^(.*) is displayed on (.*)$")
    public void verifyOption(String option, String pageName) throws Exception {
        Class page = BasePage.getPageName(pageName);
        Method methodName = page.getMethod("getItem", String.class);
        Object pageInstance = page.newInstance();
        WebElement element = (WebElement) methodName.invoke(pageInstance, option);
        assertTrue(Helper.isDisplayed(element));
    }

    @And("^text (.*) should be displayed on (.*)$")
    public void verifyText(String text, String pageName) {
        Class page = BasePage.getPageName(pageName);
        WebElement element = null;
        if (page == MainFeedbackForm.class) {
            element = MainFeedbackForm.getText(pageName);
        } else if (page == GenericFeedbackForm.class) {
            element = GenericFeedbackForm.getText(text);
        } else if (page == FeedbackSuccessScreen.class) {
            element = FeedbackSuccessScreen.getText(text);
        }
        assertTrue("Expected: " + text + " Actual: " + element.getText(), Helper.validateText(element, text));
    }

    @Then("^I click on (.*) on (.*)$")
    public void clickOnElement(String buttonName, String pageName) throws Exception {
        Class page = BasePage.getPageName(pageName);
        Method methodName = page.getMethod("getItem", String.class);
        Object pageInstance = page.newInstance();
        WebElement element = (WebElement) methodName.invoke(pageInstance, buttonName);
        Helper.click(element);
    }

    @Then("^(.*) link is visible on (.*)$")
    public void verifyLinkText(String text, String pageName) {
        Class page = BasePage.getPageName(pageName);
        WebElement element = null;
        if (page == MainFeedbackForm.class) {
            element = MainFeedbackForm.getText(text);
        } else if (page == GenericFeedbackForm.class) {
            element = GenericFeedbackForm.getText(text);
        } else if (page == FeedbackSuccessScreen.class) {
            element = FeedbackSuccessScreen.getText(text);
        }
        assertTrue(Helper.isDisplayed(element));
        assertTrue("Expected: " + text + " Actual: " + element.getText(), Helper.validateText(element, text));
    }

    @And("^I select option (.*) from (.*) on (.*)$")
    public void selectOptionFromDropdown(String value, String dropdown, String pageName) throws Exception {
        Class page = BasePage.getPageName(pageName);
        Method methodName = page.getMethod("getItem", String.class);
        Object pageInstance = page.newInstance();
        WebElement element = (WebElement) methodName.invoke(pageInstance, dropdown);
        Helper.selectDropdownValue(element, value);
    }

    @Then("^I enter (.*) under (.*) on (.*)$")
    public void enterText(String text, String fieldName, String pageName) throws Exception {
        if (text.equals("text")) {
            text = "Nice idea. Keep up the good work.";
        } else if (text.equals("email")) {
            text = "test@test.com";
        }
        Class page = BasePage.getPageName(pageName);
        Method methodName = page.getMethod("getItem", String.class);
        Object pageInstance = page.newInstance();
        WebElement element = (WebElement) methodName.invoke(pageInstance, fieldName);
        Helper.enterText(element, text);
    }
}
