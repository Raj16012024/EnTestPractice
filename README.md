# gitrepo

# gitrepomaven
This is a maven project for Behaviour Driven Development(BDD) with Cucumber.

## Overview
This repository contains a maven project setup for BDD testing using cucumber which includes BrowserControls,Featurefiles,StepDefinitions,pageobjects and Utilities to help you to egt started with BDD project.

## Prerequisites

Before you begin ensure you have following softwares installed
 1.Java
 2.Maven 
 3.Any IDE that supports Maven projects like INTELLIJ or Eclipse

 ## Getting started
 1.Clone the repository to your local machine
 git clone
 2.Open the project in preferred IDE
 3.Run the build to download maven dependencies
 4.Execute the cucumber tests

 ## Project Structure

 **src/test/java** Contains test code, including Cucumber Featurefiles,StepDefinitions and the runner class for the project execution

  **src/test/target/pom.xml**  contains all the  project dependencies.

## Writing Features

Write your BDD scenarios using Gherkin syntax in the `src/test/java/Features` directory. Each feature file should have a corresponding step definition in `src/test/java/StepDefinitions`.

## Running Tests

Execute your Cucumber tests using Maven:

mvn test

## Reporting

Cucumber uses reporter plugins to produce reports that contain information about what scenarios have passed or failed.

View Cucumber HTML reports in target/cucumber-reports/index.html after running the tests.

we can generate local reports using built-in reporter plugins like "pretty"
   

  
 


