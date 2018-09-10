Feature: Refund of item

Scenario: Jeff returns the faulty microwave
Given Jeff has brought microwave for $100 
And Jeff has a receipt
When Jeff returns the microwave
Then Jeff should receive refund of $100

