$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("JoinTeam.feature");
formatter.feature({
  "line": 1,
  "name": "User completes Form to Join SovTech Team",
  "description": "",
  "id": "user-completes-form-to-join-sovtech-team",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User fills in all the required information on the form to Join SevTech team",
  "description": "",
  "id": "user-completes-form-to-join-sovtech-team;user-fills-in-all-the-required-information-on-the-form-to-join-sevtech-team",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User navigates to sovtech website \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User needs to be on sovtech home_page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks About Us",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User User scrolls down to Join out team",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks Join our team button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User validates Join our team page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks Apply Below button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User selcts Qaulity Assurance Tester option",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User scroll down to Apply for this position button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User clicks button Apply for this position",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "user-completes-form-to-join-sovtech-team;user-fills-in-all-the-required-information-on-the-form-to-join-sevtech-team;",
  "rows": [
    {
      "cells": [
        "url"
      ],
      "line": 16,
      "id": "user-completes-form-to-join-sovtech-team;user-fills-in-all-the-required-information-on-the-form-to-join-sevtech-team;;1"
    },
    {
      "cells": [
        "https://www.sovtech.co.za"
      ],
      "line": 17,
      "id": "user-completes-form-to-join-sovtech-team;user-fills-in-all-the-required-information-on-the-form-to-join-sevtech-team;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8706183100,
  "status": "passed"
});
formatter.before({
  "duration": 146433900,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User fills in all the required information on the form to Join SevTech team",
  "description": "",
  "id": "user-completes-form-to-join-sovtech-team;user-fills-in-all-the-required-information-on-the-form-to-join-sevtech-team;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User navigates to sovtech website \"https://www.sovtech.co.za\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User needs to be on sovtech home_page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks About Us",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User User scrolls down to Join out team",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks Join our team button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User validates Join our team page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks Apply Below button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User selcts Qaulity Assurance Tester option",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User scroll down to Apply for this position button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User clicks button Apply for this position",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.sovtech.co.za",
      "offset": 35
    }
  ],
  "location": "StartProjectStepDef.userNavigatesToSovtechWebsite(String)"
});
formatter.result({
  "duration": 6103190200,
  "status": "passed"
});
formatter.match({
  "location": "StartProjectStepDef.userNeedsToBeOnSovtechHome_page()"
});
formatter.result({
  "duration": 165266400,
  "status": "passed"
});
formatter.match({
  "location": "JoinOurTeam.userClicksAboutUs()"
});
formatter.result({
  "duration": 4999742900,
  "status": "passed"
});
formatter.match({
  "location": "JoinOurTeam.userUserScrollsDownToJoinOutTeam()"
});
formatter.result({
  "duration": 70094500,
  "error_message": "org.openqa.selenium.JavascriptException: javascript error: Cannot read properties of null (reading \u0027scrollIntoView\u0027)\n  (Session info: chrome\u003d101.0.4951.67)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027KINETICSKUNK-AF\u0027, ip: \u0027192.168.18.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_321\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 101.0.4951.67, chrome: {chromedriverVersion: 101.0.4951.41 (93c720db8323..., userDataDir: C:\\Users\\Hp\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:63551}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 504e2e020bb20bf417a7a1049c6ad069\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:489)\r\n\tat sovtech.co.za.factorypageobjects.JoinOurTeam.scrollDowntoJointOurTeamBtn(JoinOurTeam.java:53)\r\n\tat sovtech.co.za.StepDefinition.JoinOurTeam.userUserScrollsDownToJoinOutTeam(JoinOurTeam.java:17)\r\n\tat ✽.And User User scrolls down to Join out team(JoinTeam.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "JoinOurTeam.userClicksJoinOurTeamButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JoinOurTeam.userValidatesJoinOurTeamPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JoinOurTeam.userClicksApplyBelowButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JoinOurTeam.userSelctsQaulityAssuranceTesterOption()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JoinOurTeam.userScrollDownToApplyForThisPositionButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JoinOurTeam.userClicksButtonApplyForThisPosition()"
});
formatter.result({
  "status": "skipped"
});
});