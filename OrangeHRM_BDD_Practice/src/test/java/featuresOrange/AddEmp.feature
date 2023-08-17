@tag
Feature: AddEmployee OrangeHRM

@tag1
Scenario: Add Employee for OrangeHRM

Given User is already on LoggedIn
 When user click on PIM
 Then user click on add employee
 Then user enters firstname and lastname and midname and empid
 |fname|lname|midname|empid|
 |John|smith|tda|1991|
 |Julie|Last|tda|1992|
 |Adm|dom|rec|1993|
  
 Then user exit
 
