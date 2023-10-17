

Feature: Web Shop page feature
 

  @WebShopTest1
  Scenario Outline: Web Shop page feature scenario
    Given open a browser
    And Navigate to Web shop page
    And click on Login link
    When user enter the following details "<Email>","<Password>"
    Then Click on Login button
    Then Verify Login Title
   
   
   Examples:
   |Email               | Password     |
   |priyabkaz1@gmail.com| Password@123 | 
