$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/file/file.feature");
formatter.feature({
  "name": "To validate the Login funtionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to verify login wiht the valid credential",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is in Fb  Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.user_is_in_Fb_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "when has to enter the valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.when_has_to_enter_the_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to nvigatet to the Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_has_to_nvigatet_to_the_Home_page()"
});
formatter.result({
  "status": "passed"
});
});