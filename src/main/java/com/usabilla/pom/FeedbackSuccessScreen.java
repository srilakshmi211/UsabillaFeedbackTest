package com.usabilla.pom;

import com.usabilla.utilities.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeedbackSuccessScreen extends BasePage{

    public static final String THANKS_MSG = "Thanks for leaving feedback!";
    public static final String REQUEST_CALL_MSG = "Want to see what Usabilla can do for you? Request a call.";
    public static final String REQUEST_CALL_MSG_LINK = "Request a call";

    @FindBy(css = ".usabilla_scroller_area > div:nth-child(1)")
    public static WebElement FEEDBACK_SUCCESS_SCREEN;

    @FindBy(css = ".usabilla_scroller_area > div:nth-child(1) > iframe:nth-child(1)")
    public static WebElement FEEDBACK_SUCCESS_SCREEN_IFRAME;

    @FindBy(id = "logo")
    public static WebElement USABILLA_LOGO;

    @FindBy(className = "close")
    public static WebElement CLOSE_BUTTON;

    @FindBy(xpath = "//*[@id=\"usabilla-metadata-container\"]/div/div/h2")
    public static WebElement THANKS_MESSAGE;

    @FindBy(xpath = "//*[@id=\"usabilla-metadata-container\"]/div/div/p")
    public static WebElement REQUEST_CALL_TEXT;

    @FindBy(xpath = "//*[@id=\"usabilla-metadata-container\"]/div/div/p/a")
    public static WebElement REQUEST_CALL_LINK;

    @FindBy(className = "continue")
    public static WebElement CONTINUE_BROWSING_BUTTON;

    public static void switchToFeedbackSuccessScreen() {
        Helper.getDriver().switchTo().frame(FEEDBACK_SUCCESS_SCREEN_IFRAME);
    }

    public static WebElement getItem(String option) {
        if(option.equals(REQUEST_CALL_MSG_LINK)){
            option = REQUEST_CALL_MSG_LINK;
        }
        WebElement element = null;
        switch (option) {
            case REQUEST_CALL_MSG_LINK:
                element = REQUEST_CALL_LINK;
                break;
            case "continue browsing button":
                element = CONTINUE_BROWSING_BUTTON;
                break;
        }
        return element;
    }

    public static WebElement getText(String option) {
        if(option.equals(THANKS_MSG)){
            option = THANKS_MSG;
        }else if(option.equals(REQUEST_CALL_MSG)){
            option = REQUEST_CALL_MSG;
        }
        WebElement element = null;
        switch (option) {
            case THANKS_MSG:
                element = THANKS_MESSAGE;
                break;
            case REQUEST_CALL_MSG:
                element = REQUEST_CALL_TEXT;
                break;

        }
        return element;
    }
}
