@Regression
Feature: Elearning module functionlaities

  Background: 
    Given User navigates to Eleraning application

  @SignUp
  Scenario: Sign up into Elearning portal
    When User clicks on Sign up button
    And user provide manadtory field on user registration form
    Then Verify user logged in successfully
    

  @LoginAndSendMail
  Scenario: Sign in with valid credentials and send a mail
    When user login with valid credentials
    And user clicks on Inbox
    And Compose a message and sent to receipients
    Then Verify sent successfull toast message
