Feature: Login Test feature

  Background: : 1. Navigate to the website
    Given the user navigates to the homepage

  @SmokeTest1
  Scenario Outline: Verify Login details in the Data_Driven format
    When the user login with "<Username>" username and "<Password>" password
    Then the user should see "<Expected Text>" text on the page
    Examples:
      | Username      | Password     | Expected Text                                                             |
      | standard_user | secret_sauce | Products                                                                  |
      | Standard_User | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | standard_user | SecretSauce  | Epic sadface: Username and password do not match any user in this service |
      | Standard_User | SecretSauce  | Epic sadface: Username and password do not match any user in this service |
      |               |              | Epic sadface: Username is required                                        |

  @SmokeTest2
  Scenario Outline: Verify Login details in the Data_Driven format
    When the user login with "<Username>" username and "<Password>" password
    Then the user should see "<Expected Text>" text on the page
    Examples:
      | Username        | Password     | Expected Text                                                             |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
      | lockedout_user  | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user | SecretSauce  | Epic sadface: Username and password do not match any user in this service |
      | lockedout_user  | SecretSauce  | Epic sadface: Username and password do not match any user in this service |
