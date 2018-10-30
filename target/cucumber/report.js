$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/AppLaunch.feature");
formatter.feature({
  "name": "Feedback feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To check feedback option is present on app launch",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Implemented"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "feedback option is displayed on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyOption(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check click on feedback option on home page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Implemented"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "feedback option is displayed on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyOption(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on feedback option on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check UI of the feedback form",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Implemented"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on feedback option on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usabilla logo is displayed on feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyOption(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close button is displayed on feedback form",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyOption(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "specific feedback option is displayed on feedback form",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyOption(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text I’d like to give feedback on a specific part of this page. should be displayed on specific feedback option",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "generic feedback option is displayed on feedback form",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyOption(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text I’d like to give general feedback on the entire website. should be displayed on generic feedback option",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Powered by Usabilla link is visible on feedback form",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyLinkText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check functionality of clicking on Generic feedback option",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Implemented"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@genericFeedback"
    }
  ]
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on feedback option on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on generic feedback option on feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the generic feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "smiley group is displayed on generic feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyOption(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close button is displayed on generic feedback form",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyOption(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Powered by Usabilla link is visible on generic feedback form",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyLinkText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check click of each smiley in Generic feedback",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Implemented"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@genericFeedback"
    }
  ]
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on feedback option on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on generic feedback option on feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the generic feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on smiley 1 on generic feedback form",
  "keyword": "When "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text Hate should be displayed on generic feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text Please select a subject should be displayed on generic feedback form",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on smiley 2 on generic feedback form",
  "keyword": "When "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text Dislike should be displayed on generic feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text Please select a subject should be displayed on generic feedback form",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on smiley 3 on generic feedback form",
  "keyword": "When "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text Neutral should be displayed on generic feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text Please select a subject should be displayed on generic feedback form",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on smiley 4 on generic feedback form",
  "keyword": "When "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text Like should be displayed on generic feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text Please select a subject should be displayed on generic feedback form",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on smiley 5 on generic feedback form",
  "keyword": "When "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text Love should be displayed on generic feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text Please select a subject should be displayed on generic feedback form",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check Suggestion option under Please select a subject",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Implemented"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@genericFeedback"
    }
  ]
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on feedback option on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on generic feedback option on feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the generic feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on smiley 5 on generic feedback form",
  "keyword": "When "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text Please select a subject should be displayed on generic feedback form",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on choose subject dropdown on generic feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select option Suggestion from choose subject dropdown on generic feedback form",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.selectOptionFromDropdown(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text That\u0027s great! What would you like to share with us? should be displayed on generic feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "feedback text box is displayed on generic feedback form",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyOption(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text Email (might be used once for follow up) should be displayed on generic feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "email field is displayed on generic feedback form",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyOption(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text How likely are you to recommend Usabilla to your friends and colleagues? should be displayed on generic feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyText(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "rating field is displayed on generic feedback form",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyOption(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check end to end flow of Generic feedback with suggestion option",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@implemented"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@genericFeedback"
    }
  ]
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on feedback option on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on generic feedback option on feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the generic feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on smiley 5 on generic feedback form",
  "keyword": "When "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on choose subject dropdown on generic feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select option Suggestion from choose subject dropdown on generic feedback form",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.selectOptionFromDropdown(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter text under feedback text box on generic feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.enterText(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email under email field on generic feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.enterText(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on rating 10 on generic feedback form",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on submit button on generic feedback form",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on the feedback success screen",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: \n\tat org.testng.AssertJUnit.fail(AssertJUnit.java:59)\n\tat org.testng.AssertJUnit.assertTrue(AssertJUnit.java:24)\n\tat org.testng.AssertJUnit.assertTrue(AssertJUnit.java:33)\n\tat com.usabilla.stepdefinitions.FeedbackSteps.verifyPage(FeedbackSteps.java:22)\n\tat ✽.I am on the feedback success screen(src/test/features/AppLaunch.feature:97)\n",
  "status": "failed"
});
formatter.step({
  "name": "text Thanks for leaving feedback! should be displayed on feedback success screen",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyText(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "text Want to see what Usabilla can do for you? Request a call. should be displayed on feedback success screen",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyText(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Request a call link is displayed on feedback success screen",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyOption(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "continue browsing button is displayed on feedback success screen",
  "keyword": "And "
});
formatter.match({
  "location": "FeedbackSteps.verifyOption(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on continue browsing button on feedback success screen",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.clickOnElement(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I am on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FeedbackSteps.verifyPage(String)"
});
formatter.result({
  "status": "skipped"
});
});