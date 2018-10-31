package com.usabilla.pom;

import com.usabilla.utilities.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GenericFeedbackForm extends BasePage {

    public static final String SUBJECT_HEADER_MSG = "Please select a subject";
    public static final String SHARE_TEXT_HEADER_MSG = "That's great! What would you like to share with us?";
    public static final String EMAIL_HEADER_MSG = "Email (might be used once for follow up)";
    public static final String RATING_HEADER_MSG = "How likely are you to recommend Usabilla to your friends and colleagues?";

    @FindBy(css = ".usabilla_scroller_area > div:nth-child(1)")
    public static WebElement GENERIC_FEEDBACK_FORM;

    @FindBy(css = ".usabilla_scroller_area > div:nth-child(1) > iframe:nth-child(1)")
    public static WebElement GENERIC_FEEDBACK_FORM_IFRAME;

    @FindBy(id = "star-input")
    public static WebElement FEEDBACK_QUESTION;

    @FindBy(className = "rating")
    public static WebElement SMILEY_GROUP;

    @FindBy(xpath = "//*[@id=\"usabilla-metadata-container\"]/div/form/div[2]/fieldset/ul/li[1]/label")
    public static WebElement SMILEY1;

    @FindBy(id = "Hate-label")
    public static WebElement SMILEY1_LABEL;

    @FindBy(xpath = "//*[@id=\"usabilla-metadata-container\"]/div/form/div[2]/fieldset/ul/li[2]/label")
    public static WebElement SMILEY2;

    @FindBy(id = "Dislike-label")
    public static WebElement SMILEY2_LABEL;

    @FindBy(xpath = "//*[@id=\"usabilla-metadata-container\"]/div/form/div[2]/fieldset/ul/li[3]/label")
    public static WebElement SMILEY3;

    @FindBy(id = "Neutral-label")
    public static WebElement SMILEY3_LABEL;

    @FindBy(xpath = "//*[@id=\"usabilla-metadata-container\"]/div/form/div[2]/fieldset/ul/li[4]/label")
    public static WebElement SMILEY4;

    @FindBy(id = "Like-label")
    public static WebElement SMILEY4_LABEL;

    @FindBy(xpath = "//*[@id=\"usabilla-metadata-container\"]/div/form/div[2]/fieldset/ul/li[5]/label")
    public static WebElement SMILEY5;

    @FindBy(id = "Love-label")
    public static WebElement SMILEY5_LABEL;

    @FindBy(id = "conditional-input")
    public static WebElement SELECT_SUBJECT_HEADER;

    @FindBy(name = "subject")
    public static WebElement CHOOSE_SUBJECT_DROPDOWN;

    @FindBy(id = "comment-input-suggestion")
    public static WebElement DESCRIPTION_HEADER;

    @FindBy(name = "feedback")
    public static WebElement FEEDBACK_DESCRIPTION;

    @FindBy(id = "email-input-suggestion")
    public static WebElement EMAIL_HEADER;

    @FindBy(name = "email")
    public static WebElement EMAIL_TEXT_BOX;

    @FindBy(id = "nps-input-suggestion")
    public static WebElement RATING_HEADER;

    @FindBy(className = "nps-score")
    public static WebElement RATING;

    @FindBy(xpath = "//*[@id=\"usabilla-metadata-container\"]/div/form/span/span[1]/div[3]/fieldset/div/label")
    public static List<WebElement> RATINGS;

    @FindBy(className = "submit")
    public static WebElement SUBMIT_BUTTON;

    @FindBy(className = "close")
    public static WebElement CLOSE_BUTTON;

    @FindBy(className = "powered-by")
    public static WebElement POWERED_BY_USABILLA_LINK;

    public static WebElement getItem(String option) {
        WebElement element = null;
        switch (option) {
            case "smiley group":
                element = SMILEY_GROUP;
                break;
            case "close button":
                element = CLOSE_BUTTON;
                break;
            case "Powered by Usabilla":
                element = POWERED_BY_USABILLA_LINK;
                break;
            case "smiley 1":
                element = SMILEY1;
                break;
            case "smiley 2":
                element = SMILEY2;
                break;
            case "smiley 3":
                element = SMILEY3;
                break;
            case "smiley 4":
                element = SMILEY4;
                break;
            case "smiley 5":
                element = SMILEY5;
                break;
            case "choose subject dropdown":
                element = CHOOSE_SUBJECT_DROPDOWN;
                break;
            case "feedback text box":
                element = FEEDBACK_DESCRIPTION;
                break;
            case "email field":
                element = EMAIL_TEXT_BOX;
                break;
            case "rating field":
                element = RATING;
                break;
            case "rating 10":
                element = RATINGS.get(10);
                break;
            case "submit button":
                element = SUBMIT_BUTTON;
                break;
        }
        return element;
    }

    public static WebElement getText(String option) {
        if(option.equals(SHARE_TEXT_HEADER_MSG)){
            option = SHARE_TEXT_HEADER_MSG;
        }else if(option.equals(SUBJECT_HEADER_MSG)){
            option = SUBJECT_HEADER_MSG;
        }else if(option.equals(EMAIL_HEADER_MSG)){
            option = EMAIL_HEADER_MSG;
        }else if(option.equals(RATING_HEADER_MSG)){
            option = RATING_HEADER_MSG;
        }
        WebElement element = null;
        switch (option) {
            case "generic feedback form":
                element = GENERIC_FEEDBACK_FORM;
                break;
            case "smiley group":
                element = SMILEY_GROUP;
                break;
            case "close button":
                element = CLOSE_BUTTON;
                break;
            case "Powered by Usabilla":
                element = POWERED_BY_USABILLA_LINK;
                break;
            case "Hate":
                element = SMILEY1_LABEL;
                break;
            case "Dislike":
                element = SMILEY2_LABEL;
                break;
            case "Neutral":
                element = SMILEY3_LABEL;
                break;
            case "Like":
                element = SMILEY4_LABEL;
                break;
            case "Love":
                element = SMILEY5_LABEL;
                break;
            case SUBJECT_HEADER_MSG:
                element = SELECT_SUBJECT_HEADER;
                break;
            case SHARE_TEXT_HEADER_MSG:
                element = DESCRIPTION_HEADER;
                break;
            case EMAIL_HEADER_MSG:
                element = EMAIL_HEADER;
                break;
            case RATING_HEADER_MSG:
                element = RATING_HEADER;
                break;

        }
        return element;
    }

    public static void switchToGenericFeedbackForm() {
        Helper.getDriver().switchTo().frame(GENERIC_FEEDBACK_FORM_IFRAME);
    }
}
