Feature: Validate giftcard

  @tag3
  Scenario Outline: Validate giftcard
    Given open a browser
    And Navigate to Web shop page
    And click on Login link
    When user enter the following details "<Email>","<Password>"
    Then Click on Login button
    Then Verify Login Title
    When user navigates to Gift cards
    Then user clicks on any one physical gift card
    And user enters Recepients name "ABS" and Message "Diwali gifts"
    Then user clicks on Email a friend button
    And user enters Friend's email "ABS@gmail.com"
    Then user clicks on send email button
    Then user verifys message obtain
    
    Examples:
      
   |Email               | Password     |
   |priyabkaz1@gmail.com| Password@123 | 
