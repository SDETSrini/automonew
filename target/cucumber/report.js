$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "HomePage Sanity",
  "description": "",
  "id": "homepage-sanity",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify Homepage title",
  "description": "",
  "id": "homepage-sanity;verify-homepage-title",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify title of the HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefn.user_is_on_HomePage()"
});
formatter.result({
  "duration": 8894505800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefn.verify_title_of_the_HomePage()"
});
formatter.result({
  "duration": 25370800,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Sanity",
  "description": "",
  "id": "login-sanity",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify Login title",
  "description": "",
  "id": "login-sanity;verify-login-title",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify title of the Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefn.user_is_on_Page()"
});
formatter.result({
  "duration": 90800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefn.verify_title_of_the_Page()"
});
formatter.result({
  "duration": 107000,
  "status": "passed"
});
});