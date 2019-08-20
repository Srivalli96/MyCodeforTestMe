Feature: My validations on mercury tours

  Scenario Outline: Login validation for multiple users in tesmeapp
    Given Testmeapp is launched my user
    When User clicks on signin link in landing page
    Then User provides the valid username "<uname>"
    And User provides the valid password "<pswrd>"
    Then user clicks for submission of data
    And verifies the login status for the account

    Examples: 
      | uname   | pswrd       |
      | Lalitha | Password123 |
      | Admin   | Password456 |
