$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Application Verification",
  "description": "",
  "id": "application-verification",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "verify the product",
  "description": "",
  "id": "application-verification;verify-the-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user hover on more products",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click on kids brushes",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "text Kids displayed in second brush in list",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the driver",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageStepdefination.user_is_on_home_page()"
});
formatter.result({
  "duration": 11085858500,
  "status": "passed"
});
formatter.match({
  "location": "HomepageStepdefination.user_hover_on_more_products()"
});
formatter.result({
  "duration": 279594100,
  "status": "passed"
});
formatter.match({
  "location": "HomepageStepdefination.click_on_kids_brushes()"
});
formatter.result({
  "duration": 3191111700,
  "status": "passed"
});
formatter.match({
  "location": "HomepageStepdefination.text_kids_displayed_in_second_brush_in_list()"
});
formatter.result({
  "duration": 38847100300,
  "status": "passed"
});
formatter.match({
  "location": "HomepageStepdefination.close_the_driver()"
});
formatter.result({
  "duration": 1573068600,
  "status": "passed"
});
formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Application search",
  "description": "",
  "id": "application-search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "search for product",
  "description": "",
  "id": "application-search;search-for-product",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on search",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter the \"\u003csheetname\u003e\" and \"\u003crownumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on search icon",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on resultant product",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "product \"\u003cname\u003e\" displayed on product details page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the driver",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "application-search;search-for-product;",
  "rows": [
    {
      "cells": [
        "sheetname",
        "rownumber",
        "name"
      ],
      "line": 13,
      "id": "application-search;search-for-product;;1"
    },
    {
      "cells": [
        "excel1",
        "1",
        "3D White Battery Toothbrush"
      ],
      "line": 14,
      "id": "application-search;search-for-product;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "search for product",
  "description": "",
  "id": "application-search;search-for-product;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on search",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter the \"excel1\" and \"1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on search icon",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on resultant product",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "product \"3D White Battery Toothbrush\" displayed on product details page",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the driver",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageStepdefination.user_is_on_home_page()"
});
formatter.result({
  "duration": 13541876000,
  "status": "passed"
});
formatter.match({
  "location": "SearchpageStepDefination.user_click_on_search()"
});
formatter.result({
  "duration": 122152100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "excel1",
      "offset": 11
    },
    {
      "val": "1",
      "offset": 24
    }
  ],
  "location": "SearchpageStepDefination.enter_the(String,int)"
});
formatter.result({
  "duration": 364225800,
  "status": "passed"
});
formatter.match({
  "location": "SearchpageStepDefination.click_on_search_icon()"
});
formatter.result({
  "duration": 2684079400,
  "status": "passed"
});
formatter.match({
  "location": "SearchpageStepDefination.click_on_resultant_product()"
});
formatter.result({
  "duration": 10972346100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3D White Battery Toothbrush",
      "offset": 9
    }
  ],
  "location": "SearchpageStepDefination.product_displayed_on_product_details_page(String)"
});
formatter.result({
  "duration": 5834958500,
  "status": "passed"
});
formatter.match({
  "location": "HomepageStepdefination.close_the_driver()"
});
formatter.result({
  "duration": 4801145200,
  "error_message": "org.openqa.selenium.NoSuchSessionException: invalid session id\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MINDFEB757\u0027, ip: \u0027172.18.45.207\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 100.0.4896.127, chrome: {chromedriverVersion: 100.0.4896.60 (6a5d10861ce8..., userDataDir: C:\\Users\\MINDTR~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:58859}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 8436dad19cc2090d1fecb5542010a5c8\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat bddFrameUtility.Snapshot.takeSnapshot(Snapshot.java:25)\r\n\tat bddFrameUtility.BaseClass.close(BaseClass.java:44)\r\n\tat stepdefination.HomepageStepdefination.close_the_driver(HomepageStepdefination.java:71)\r\n\tat ✽.And close the driver(Search.feature:10)\r\n",
  "status": "failed"
});
formatter.uri("footer.feature");
formatter.feature({
  "line": 1,
  "name": "Application verification",
  "description": "",
  "id": "application-verification",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "verify text",
  "description": "",
  "id": "application-verification;verify-text",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on Floss in footer",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "next page populated",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "text FLOSS PICKS verified",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "close driver",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageStepdefination.user_is_on_home_page()"
});
formatter.result({
  "duration": 6605465900,
  "status": "passed"
});
formatter.match({
  "location": "FooterPageStepDefination.user_click_on_floss_in_footer()"
});
formatter.result({
  "duration": 5679380100,
  "error_message": "java.lang.NullPointerException\r\n\tat bddFrameUtility.Snapshot.takeSnapshot(Snapshot.java:25)\r\n\tat stepdefination.FooterPageStepDefination.user_click_on_floss_in_footer(FooterPageStepDefination.java:36)\r\n\tat ✽.When user click on Floss in footer(footer.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "FooterPageStepDefination.next_page_populated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FooterPageStepDefination.text_floss_picks_verified()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FooterPageStepDefination.close_driver()"
});
formatter.result({
  "status": "skipped"
});
});