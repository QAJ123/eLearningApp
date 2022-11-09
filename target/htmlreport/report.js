$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/ELearning.feature");
formatter.feature({
  "name": "Elearning module functionlaities",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Eleraning application",
  "keyword": "Given "
});
formatter.match({
  "location": "ELearningStepDefs.user_navigates_to_Eleraning_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Sign up into Elearning portal",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@SignUp"
    }
  ]
});
formatter.step({
  "name": "User clicks on Sign up button",
  "keyword": "When "
});
formatter.match({
  "location": "ELearningStepDefs.user_clicks_on_Sign_up_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user provide manadtory field on user registration form",
  "keyword": "And "
});
formatter.match({
  "location": "ELearningStepDefs.user_provide_manadtory_field_on_user_registration_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify user logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ELearningStepDefs.verify_user_loggedin_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Eleraning application",
  "keyword": "Given "
});
formatter.match({
  "location": "ELearningStepDefs.user_navigates_to_Eleraning_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Sign in with valid credentials and send a mail",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@LoginAndSendMail"
    }
  ]
});
formatter.step({
  "name": "user login with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "ELearningStepDefs.user_login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Inbox",
  "keyword": "And "
});
formatter.match({
  "location": "ELearningStepDefs.user_clicks_on_Inbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Compose a message and sent to receipients",
  "keyword": "And "
});
formatter.match({
  "location": "ELearningStepDefs.compose_a_message_and_sent_to_receipients()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify sent successfull toast message",
  "keyword": "Then "
});
formatter.match({
  "location": "ELearningStepDefs.verify_sent_successfull_toast_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});