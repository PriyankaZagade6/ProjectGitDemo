

Feature: Web Shop page feature
 

  @WebShopTest1
  Scenario Outline: Web Shop page feature scenario
    Given open a browser
    And Navigate to Web shop page
    And click on Login link
    When user enter the following details "<Email>","<Password>"
    Then Click on Login button
    Then Verify Login Title
    And Click on Electronice section link
    Then Click on Cell phone link
    And verify mobile is add to cart
   # Then Click on Shopping cart
   # And Verify product is added or not
   
   
   Examples:
   |Email               | Password     |
   |priyabkaz1@gmail.com| Password@123 | 
