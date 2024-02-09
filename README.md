# MavenTestPractice

This is a maven project for Behaviour-driven Development (BDD) with Cucumber.

## Overview
This repository contains a maven project setup for BDD testing using Cucumber, which includes BrowserControls, Featurefiles, StepDefinitions, page objects and Utilities to help you get started with the BDD project.

## Prerequisites

Before you begin, ensure you have the following software installed.

* Java
* Maven 
* Any IDE that supports Maven projects like IntelliJ or Eclipse

 ## Getting started
 1. Clone the repository to your local machine
 git clone
 2. Open the project in the preferred IDE
 3. Run the build to download Maven dependencies
 4. Execute the cucumber tests

 ## Project Structure

 ** src/test/java** Contains test code, including Cucumber Feature files, StepDefinitions and the runner class for the project execution

 ** src/test/target/pom.xml**  contains all the  project dependencies.

## Writing Features

Write your BDD scenarios using Gherkin syntax in the `src/test/java/Features` directory. Each feature file should have a corresponding step definition in `src/test/java/StepDefinitions`.

## Running Tests

Execute your Cucumber tests using the Maven: mvn test.

## Reporting

Cucumber uses reporter plugins to produce repcontaining information about scenarios thatarios have passed or failed.

View Cucumber HTML reports in target/cucumber-reports/index.html after running the tests.

We can generate local reports using built-in reporter plugins like "Pretty."
   

  
 


