@Navigation
Feature: Navigation bar
 To see the subpages
 Without logging in
 I can click the navigation bar links

Background: I am on the Free Range Testers web without loggin in.
Given I navigate to www.freerangetesters.com

@Subpages
Scenario Outline: I can access the subpages through the navigation bar 
  When I go to <section> using navigation bar
  Examples: 
  |section|
  |Cursos|
  |Recursos|
  |Blog|
  |Mentorías|
  |Udemy|

@Courses
Scenario: Courses are presented correctly tto petential customers
  When I go to Cursos using navigation bar
  And I select Introduction al Testing

@Plans
Scenario: Users can select a plan when signing up
  When The client selects Elegir Plan
  Then The client can validate the options in the checkout page

  
  
