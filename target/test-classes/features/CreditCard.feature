#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Credit card login
  I want to use this template for my feature file

  @tag1
  Scenario: Bank home page
    Given User is onlanding page
    When User logs into appln with "Shaaz" and "1234"
    Then Credit Home Page is loaded
    And Card displayed are "true"
    
    @tag1
  Scenario: Bank home page
    Given User is onlanding page
    When User logs into appln with "Ryan" and "7071"
    Then Credit Home Page is loaded
    And Card displayed are "false"
