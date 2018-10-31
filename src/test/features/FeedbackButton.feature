Feature: Feedback feature

  @Implemented @smoke
  Scenario: To check feedback option is present on app launch
    Given I am on the home page
    Then feedback option is displayed on home page


  @Implemented @smoke
  Scenario: To check click on feedback option on home page
    Given I am on the home page
    Then feedback option is displayed on home page
    Then I click on feedback option on home page
    Then I am on the feedback form

  @Implemented @smoke
  Scenario: To check UI of the feedback form
    Given I am on the home page
    Then I click on feedback option on home page
    Then I am on the feedback form
    Then usabilla logo is displayed on feedback form
    And close button is displayed on feedback form
    And specific feedback option is displayed on feedback form
    And text I’d like to give feedback on a specific part of this page. should be displayed on specific feedback option
    And generic feedback option is displayed on feedback form
    And text I’d like to give general feedback on the entire website. should be displayed on generic feedback option
    And Powered by Usabilla link is visible on feedback form

  @Implemented @smoke @genericFeedback
  Scenario: To check functionality of clicking on Generic feedback option
    Given I am on the home page
    Then I click on feedback option on home page
    Then I am on the feedback form
    Then I click on generic feedback option on feedback form
    Then I am on the generic feedback form
    Then smiley group is displayed on generic feedback form
    And close button is displayed on generic feedback form
    And Powered by Usabilla link is visible on generic feedback form

  @Implemented @smoke @genericFeedback
  Scenario: To check click of each smiley in Generic feedback
    Given I am on the home page
    Then I click on feedback option on home page
    Then I am on the feedback form
    Then I click on generic feedback option on feedback form
    Then I am on the generic feedback form
    When I click on smiley 1 on generic feedback form
    Then text Hate should be displayed on generic feedback form
    And text Please select a subject should be displayed on generic feedback form
    When I click on smiley 2 on generic feedback form
    Then text Dislike should be displayed on generic feedback form
    And text Please select a subject should be displayed on generic feedback form
    When I click on smiley 3 on generic feedback form
    Then text Neutral should be displayed on generic feedback form
    And text Please select a subject should be displayed on generic feedback form
    When I click on smiley 4 on generic feedback form
    Then text Like should be displayed on generic feedback form
    And text Please select a subject should be displayed on generic feedback form
    When I click on smiley 5 on generic feedback form
    Then text Love should be displayed on generic feedback form
    And text Please select a subject should be displayed on generic feedback form


  @Implemented @smoke @genericFeedback
  Scenario: To check Suggestion option under Please select a subject
    Given I am on the home page
    Then I click on feedback option on home page
    Then I am on the feedback form
    Then I click on generic feedback option on feedback form
    Then I am on the generic feedback form
    When I click on smiley 5 on generic feedback form
    And text Please select a subject should be displayed on generic feedback form
    Then I click on choose subject dropdown on generic feedback form
    And I select option Suggestion from choose subject dropdown on generic feedback form
    Then text That's great! What would you like to share with us? should be displayed on generic feedback form
    And feedback text box is displayed on generic feedback form
    Then text Email (might be used once for follow up) should be displayed on generic feedback form
    And email field is displayed on generic feedback form
    Then text How likely are you to recommend Usabilla to your friends and colleagues? should be displayed on generic feedback form
    And rating field is displayed on generic feedback form

  @implemented @smoke @genericFeedback
  Scenario: To check end to end flow of Generic feedback with suggestion option
    Given I am on the home page
    Then I click on feedback option on home page
    Then I am on the feedback form
    Then I click on generic feedback option on feedback form
    Then I am on the generic feedback form
    When I click on smiley 5 on generic feedback form
    Then I click on choose subject dropdown on generic feedback form
    And I select option Suggestion from choose subject dropdown on generic feedback form
    Then I enter text under feedback text box on generic feedback form
    Then I enter email under email field on generic feedback form
    Then I click on rating 10 on generic feedback form
    And I click on submit button on generic feedback form
    Then I am on the feedback success screen
    Then text Thanks for leaving feedback! should be displayed on feedback success screen
    Then text Want to see what Usabilla can do for you? Request a call. should be displayed on feedback success screen
    And  Request a call link is displayed on feedback success screen
    And continue browsing button is displayed on feedback success screen
    Then I click on continue browsing button on feedback success screen
    Then I am on the home page
