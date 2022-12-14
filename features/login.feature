Feature: Test cases

Background: Navigate to SwagLabs
And user launch site URL


  @Regression   @smoke
 Scenario: Checkout tests - verify order confirmation email
    When use login with valid details
    And  user clicks on PersonIcon and Navigate to the Login Page
    And user login with credentials registered via api
    And Glo user clicks on Buy Link and add the product to mini cart
    And Payment page details confirmed
    And user select Card Payment option
    And user select debit card as payment option
    And user select the Visa card as type
    And enter visa card details
    Then select place order from Card
    And grab and output Order number
    And Glo assert on Order Confirmation page 'thankYouMessageHeading.key' is displayed
    And user should receive a order confirmation email with order number
    
    
    
 @Regression 
Scenario: Linking Facebook/Google Account to Existing Customer
Given I am a customer on mobile, desktop, or tablet, NOT logged in.
When I am on the customer log-in page
Then I can select Sign in With Facebook/Google and authorize Facebook and Google to let  use my details. 
And I am able to log in with/ Facebook and Google sign-in options.

 @Regression
Scenario: verify cardpayment with invalid details
 When create a new account via api
 Given  user launch URl
 And user search a prodcut and add into cart
 And user click on checkout button
    