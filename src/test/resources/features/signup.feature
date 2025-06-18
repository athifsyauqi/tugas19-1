Feature: Sign Up to Demoblaze

  Scenario: Signup with valid data
    Given I am on the home page
    When I click on the signup link
    And I fill the username field with "randomuser"
    And I fill the password field with "admin7"
    And I click on the signup button
    Then I should see a message "Sign up successful."

#Feature:Signup with existing data
#
#  Scenario: signup with existing data
#    Given I am on the home page
#    When I click on the signup link
#    And I fill the username field with "cuktaw11"
#    And I fill the password field with "admin11"
#    And I click on the signup button
#    Then I should see a message "User does not exist."
