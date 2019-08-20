Feature: my demo on tags
@Smoke @Sanity
Scenario: login validation on flipkart
Given application is up and running
Then User able to login

@Regression
Scenario: user access to items in the portal
Given user searching the prod with code
Then user able to add it to cart



@Smoke
Scenario: user access to remove from cart
Given user able to see the items count on cart
Then user decides to remove an item



@Sanity
Scenario: user wanted to track the order
Given user has active order 
Then user verifies the status of the order

