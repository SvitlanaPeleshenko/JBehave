
Narrative:
As a user I want to check My Account feature

Scenario:01 User can log in to his account
Given I am on Login page.
When Entering credential VALID_USER
Then I get My Account Dashboard page with logged in status.

Scenario:02 Fake user can not log in to account
Given I am on Login page.
When Entering credential FAKE_USER
Then Authentication failed

Scenario:03 All required asterisks should be present
Meta:
@pending
Given I am on Login page.
When click on login button
Then observe all asterisks