Feature: Application search

Scenario Outline: search for product
Given user is on home page
When user click on search
Then enter the "<sheetname>" and "<rownumber>"
And click on search icon
And click on resultant product
Then product "<name>" displayed on product details page
And close the driver

Examples:
| sheetname | rownumber | name |
| excel1 | 1 | 3D White Battery Toothbrush |