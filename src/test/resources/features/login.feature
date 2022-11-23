Feature:  As a user, I should be able to log in.

@trycloud
  Scenario Outline: Verify login with valid credentials

    Given user on the login page "http://qa3.trycloud.net/"
    When user use username "<username>" and passcode "<password>"
    And user click the login button
    Then verify the user should be at the dashboard page
    Examples:

      | username | password    |
      | User15   | Userpass123 |
      | User45   | Userpass123 |
      | User75   | Userpass123 |
      | User105  | Userpass123 |

