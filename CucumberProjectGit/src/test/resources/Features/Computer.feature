Feature: Validate Computer

  @WebShopTest4
  Scenario Outline: Validate Computer
    Given open a browser
    And Navigate to Web shop page
    And click on Login link
    When user enter the following details "<Email>","<Password>"
    Then Click on Login button
    Then Verify Login Title
    When user mouse over on computers
    And user clicks on Desktop
    And User sorts the desktop by name A to Z
    And User clicks on expensive computer
    And User clicks on add to compare list
    Then User clicks on logout button

    Examples: 
      | Email                | Password     |
      | priyabkaz1@gmail.com | Password@123 |
