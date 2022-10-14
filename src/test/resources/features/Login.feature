
Feature: The user should be able to add a new story

Scenario: user login
  Given navigate login page
  And enter username "admin"
  And enter password "admin"
  When click the login button
  Then check user is on homepage

@wip
Scenario: create account
  Given navigate login page
  Given user login successfully
  When click addCompany
  And enter name of company and address
    |name|akade|
    |address |istanbul|
  And click send button
  When click addCompany
  And enter name of company and address
    |name|akade|
    |address |istanbul|
  And click send button
  Then create admin user for company
  Then click new user
  And add new user
    |username|musterman|
    |password |12345|
    |firstname|muster|
    |lastname |man|
    |email|musterman@alesta.com|
















