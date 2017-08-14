Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Go to blibli site and login
Given open home page
When I login to blibli
Then I can see my name in the site

Given already logged in
When I search item
And I add to cart
Then Item already in cart

Given Item already in cart
When I checkout
And I choose payment options
And I confirm payment method
Then I can see thankyou page