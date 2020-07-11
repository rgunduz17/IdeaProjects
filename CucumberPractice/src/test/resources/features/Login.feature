#Feature:
#  Scenario:
#//Given steps are used to describe the initial context of the system.
#//When steps are used to describe an event, or an action.
#//Then steps are used to describe an expected outcome, or result.
#//And This can be helpful when you have some steps that are effectively a list of things,
#//      so you can express it more like bullet points where otherwise the natural language of And


Feature: Web Page Login
#  Scenario: Positive Login to VyTrack Page
#    Given Initialize the browser
#    When Navigate to "https://qa2.vytrack.com/user/login"
#    When Login with "user22" and "UserUser123"
#    And Click on login button
#    Then Successfully validate page title
#    And Closes the browser



  Scenario Outline: Positive Login to VyTrack Page
    Given Initialize the browser
    When Navigate to "https://qa2.vytrack.com/user/login"
    When Login with <username> and <password>
    And Click on login button
    Then Successfully validate page title
    And Closes the browser
Examples:
|username   |  password  |
|user22     | UserUser123|
|user23     | UserUser123|





















#Feature: Login

#Scenario: Positive Login to VyTrack Page
#  Given Initialize the browser
#  When Navigate to "https://qa2.vytrack.com/user/login"
#  Then User enters "user22" and "UserUser123" and click login button
#  And Closes the browser


#  Scenario Outline: Positive Test validating VyTrack login
#    Given Initialize the browser with default browser
#    Given Navigate to "https://vytrack.com/"
#    Given Click on login button and navigate login page
#    When User enters <username> and <password> and click login button
#    Then Verify that user is successfully logged in
#    And Closes the browser
#
# Examples:
#|username     |password     |
#|user22       |UserUser123  |
#|user23       |UserUser123  |
