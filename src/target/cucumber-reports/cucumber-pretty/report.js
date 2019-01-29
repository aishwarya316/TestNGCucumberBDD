$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("gmail.feature");
formatter.feature({
  "line": 2,
  "name": "Gmail  Login Feature",
  "description": "",
  "id": "gmail--login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Gmail Login Test Scenario",
  "description": "",
  "id": "gmail--login-feature;gmail-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the user click on last mail",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "gmail--login-feature;gmail-login-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "gmail--login-feature;gmail-login-test-scenario;;1"
    },
    {
      "cells": [
        "aishwaryapk2009@gmail.com",
        "ashisthebest"
      ],
      "line": 13,
      "id": "gmail--login-feature;gmail-login-test-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Gmail Login Test Scenario",
  "description": "",
  "id": "gmail--login-feature;gmail-login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters \"aishwaryapk2009@gmail.com\" and \"ashisthebest\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the user click on last mail",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_already_on_login_page()"
});
formatter.result({
  "duration": 8326331780,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aishwaryapk2009@gmail.com",
      "offset": 13
    },
    {
      "val": "ashisthebest",
      "offset": 45
    }
  ],
  "location": "StepDef.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 5878014641,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 4146615673,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.the_user_click_on_last_mail()"
});
formatter.result({
  "duration": 11372204104,
  "status": "passed"
});
});