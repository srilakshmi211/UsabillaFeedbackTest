package com.usabilla.pom;

import com.usabilla.utilities.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFeedbackForm extends BasePage {

    private static final String SPECIFIC_FEEDBACK_MSG = "I’d like to give feedback on a specific part of this page.";
    private static final String GENERIC_FEEDBACK_MSG = "I’d like to give general feedback on the entire website.";

    @FindBy(css = ".usabilla_scroller_area")
    public static WebElement FEEDBACK_FORM;

    @FindBy(css = ".usabilla_scroller_area > iframe:nth-child(1)")
    public static WebElement FEEDBACK_FORM_IFRAME;

    @FindBy(xpath = "//*[@id=\"contents\"]/div[2]")
    public static WebElement SPECIFIC_FEEDBACK_BUTTON;

    @FindBy(xpath = "//*[@id=\"contents\"]/div[2]/span")
    public static WebElement SPECIFIC_FEEDBACK_MESSAGE;

    @FindBy(xpath = "//*[@id=\"contents\"]/div[3]")
    public static WebElement GENERIC_FEEDBACK_BUTTON;

    @FindBy(xpath = "//*[@id=\"contents\"]/div[3]/span")
    public static WebElement GENERIC_FEEDBACK_MESSAGE;

    @FindBy(id = "logo")
    public static WebElement USABILLA_LOGO;

    @FindBy(className = "close")
    public static WebElement CLOSE_BUTTON;

    @FindBy(className = "powered-by")
    public static WebElement POWERED_BY_USABILLA_LINK;

    public static void switchToFeedbackForm() {
        Helper.getDriver().switchTo().frame(FEEDBACK_FORM_IFRAME);
    }

    public static WebElement getItem(String option) {
        WebElement element = null;
        switch (option) {
            case "feedback form":
                element = FEEDBACK_FORM;
                break;
            case "usabilla logo":
                element = USABILLA_LOGO;
                break;
            case "close button":
                element = CLOSE_BUTTON;
                break;
            case "specific feedback option":
                element = SPECIFIC_FEEDBACK_BUTTON;
                break;
            case "generic feedback option":
                element = GENERIC_FEEDBACK_BUTTON;
                break;
        }
        return element;
    }

    public static WebElement getText(String option) {
        if (option.equals(SPECIFIC_FEEDBACK_MSG)) {
            option = SPECIFIC_FEEDBACK_MSG;
        } else if (option.equals(GENERIC_FEEDBACK_MSG)) {
            option = GENERIC_FEEDBACK_MSG;
        }
        WebElement element = null;
        switch (option) {
            case SPECIFIC_FEEDBACK_MSG:
                element = SPECIFIC_FEEDBACK_MESSAGE;
                break;
            case GENERIC_FEEDBACK_MSG:
                element = GENERIC_FEEDBACK_MESSAGE;
                break;
            case "Powered by Usabilla":
                element = POWERED_BY_USABILLA_LINK;
                break;
        }
        return element;
    }

}
