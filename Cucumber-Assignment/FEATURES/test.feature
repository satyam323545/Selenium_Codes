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
#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
      
      
      
Feature: Verification of tables

Scenario: Admin table verification
Given Main page is open
When User clicks on administration link
Then User can see the administration menu

Scenario: List of Store Categories Verification
Given Main page is open
When User clicks on administration link
And user clicks on categories
Then User can see List of Store categories table

Scenario: Add and verify new category in list
Given Main page is open
When User clicks on administration link
And user clicks on categories
And user clicks on Add New link
And Enter category name
And Click add
Then name is available in the list of categories

Scenario: Add new product to added category
Given Main page is open
When User clicks on administration link
And user clicks on products
And user clicks on add new
And user adds new product
Then new product is added in the list
