Feature: Application verification

Scenario: verify text
Given user is on home page
When user click on Floss in footer
Then next page populated
And text FLOSS PICKS verified
And close driver