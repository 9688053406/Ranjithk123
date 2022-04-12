Feature: Hotel Booking In Adactin Application

Scenario: Login Page
Given user Launch The Application
When user Enter The UserName In UserName Field
And user Enter The Password In Password Field
Then user Click On The Login Button And Navigate To The Search Hotel

Scenario: Search Hotel Page
When user Enter The Hotel Location
And user Select The Hotel
And user Select Room Type
And user Enter The Number Of Rooms
And user Enter The Check In Date
And user Enter The Check Out Date
And user Enter The Adults Per Room
And user Enter The Children Per Room
Then user Click On The Search Button And Navigate To The Select Hotel Page

Scenario: Select Hotel Page
When user Select On Ratio Button
Then user Click On The Continue Button And Navigate To The Book Hotel Page

Scenario: Book A Hotel Page
When user Enter The First Name
And user Enter The Last Name
And user Enter The Billing Address
And user Enter The Credit Card Number
And user Select The Credit Card Type
And user Select The Credit Card Expiry Month
And user Select The Credit Card Expiry year
And user Enter The Credit Card CVV Number
Then Click On The Book Now Button And Navugate To The Booking Confirmation Page

