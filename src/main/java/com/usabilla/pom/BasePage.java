package com.usabilla.pom;

import com.usabilla.utilities.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    @FindBy(xpath = "//div[@class='usabilla_live_button_container']")
    public static WebElement FEEDBACK_OPTION;


    @FindBy(xpath = "//h1[@class='heading-1--homepage']")
    public static WebElement HOMEPAGE_HEADER;


    @FindBy(xpath = "//a[@class='navigation__logo']")
    public static WebElement HOMEPAGE_LOGO;

    @FindBy(id = "hubspot-messages-iframe-container")
    public static WebElement CHAT_IFRAME;

    public static final String URL = "https://usabilla.com/";

    public BasePage() {
        PageFactory.initElements(Helper.getDriver(), this);
    }

    public static boolean validatePage(String pageName) {
        switch (pageName) {
            case "home page":
                return Helper.isDisplayed(BasePage.HOMEPAGE_HEADER);
            case "feedback form":
                return Helper.isDisplayed(MainFeedbackForm.FEEDBACK_FORM);
            case "generic feedback form":
                return Helper.isDisplayed(GenericFeedbackForm.GENERIC_FEEDBACK_FORM);
            case "feedback success screen":
                Helper.getDriver().switchTo().defaultContent();
                return Helper.isDisplayed(FeedbackSuccessScreen.FEEDBACK_SUCCESS_SCREEN);
        }
        return false;
    }

    public static Class getPageName(String pageName) {

        Class page = null;
        switch (pageName) {
            case "home page":
                page = BasePage.class;
                break;
            case "generic feedback option":
            case "specific feedback option":
            case "feedback form":
                page = MainFeedbackForm.class;
                break;
            case "generic feedback form":
                page = GenericFeedbackForm.class;
                break;
            case "feedback success screen":
                page = FeedbackSuccessScreen.class;
                break;
        }
        return page;
    }

    public static WebElement getItem(String option) {
        WebElement element = null;
        switch (option) {
            case "feedback option":
                element = FEEDBACK_OPTION;
                break;
        }
        return element;
    }


}
