Feature: Application LogIn.


  Scenario: Admin Page Default LogIn
    Given Admin is on NetBanking LogIn page
    When  Admin log in into application with username admin and password 1234
    Then  Home Page is displayed
    And  Cards are displayed


  Scenario: User Page Default LogIn
    Given  User is on NetBanking LogIn page
    When  User log in into application with username1 user  and password1 5678
    Then  Home Page is visible
    And  Cards are visible


  Scenario Outline: User Page Default LogIn
    Given  User is on MobileBanking LogIn page
    When  User log in into application with "<username>"  and "<password>" combination
    Then  Home Page can be seen
    And  Cards can be seen

    Examples:

      | username | password |
      | credit   | credit1  |
      | debit    | debit1   |
      | admin    | admin1   |

  Scenario: User page default sign up

    Given User is on SignUp page
    When User Sign up into application with following credentials
      |Pallabi|
      |Halder|
      |halderpallabi567@gmail.com|
      |8617588819|
    Then Home Page is marked
    And  Cards are marked








