Feature: Managing customer home page and profile
@tag1
Scenario: the user has loaded the application in the browser
Given User on customers home page
When click on view profile

@tag2
Scenario: User able to see ordered history
Given User on customers home page
When User click on view ordered history
           