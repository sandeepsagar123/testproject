@one
Feature: User Successful Registration
   
   Scenario Outline: Successful Login
    Given I am on the Sauce Home Page
    When  I enter "	<username>" "<password>"
    And   I click the login Button
    Then  I am redirected to the Sauce Main Page
    And  I verify the App Logo exists
    
    Examples:
    |username				|password			|
    |standard_user	|secret_sauce | 
   
   Scenario Outline: UnSuccessful Login
    Given I am on the Sauce Home Page
    When  I enter "	<username>" "<password>" for account LockedOutUser.
    And   I click the login Button
    Then  I verify the Error Message contains the text "<Sorry, this user has been banned.>"
   
    
    Examples:  
    |username				  |password			|Error Message                    |
    |locked_out_user	|secret_sauce |Sorry, this user has been banned.|	