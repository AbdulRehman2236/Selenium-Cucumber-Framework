# Selenium-Cucumber-Framework

## Overview
Selenium-Cucumber-Framework - This project is based on Selenium which enables reliable end-to-end testing for modern web apps. Project is designed to evaluate proficiency in automated testing.
The projects showcase automation script development and utilize various reporters such as Allure and HTML.
### Features

- **Selenium:** A widely used browser automation tool to interact with web applications.
- **Cucumber:** A behavior-driven development (BDD) framework that allows the use of natural language in test scenarios.
- **Java:** The programming language used for writing the test scripts.
- **Maven:** A build automation and project management tool for Java-based projects.

### Assessment Tasks

1. **Login Functionality:** Verify the login functionality of the website, including both valid and invalid scenarios.

2. **Logout Functionality:** Verify the logout functionality of the website.

3. **Checkout Functionality:** Verify the checkout functionality of the website.

## Getting Started

### Prerequisites
The following softwares are required:

- Java Development Kit (Ensure that the Java class path is properly set)
- Maven (Ensure that the .m2 class path is properly set)
- Eclipse IDE
- Cucumber for Java Plugin
- Gherkin Plugin
- **Browsers**: To run your automation project on a specific browser, update the `config.properties` file with the desired browser name (make sure that the desired browser is installed on your system).
   ```
   browser=chrome
   ``` 
  
### Installation

1. Clone the repo using below URL:
   ```
   https://github.com/AbdulRehman2236/Selenium-Cucumber-Framework.git
   ```

2. Navigate to the project directory:
   ```
   cd Selenium-Cucumber-Framework
   ```
3. Install dependencies:
   ```
   mvn clean install
   ```

## Running Test

For execution of all test scenarioes, use below command: 
   ```
   mvn test
   ```

## Reporting

### Allure Report

To generate an Allure report, you can use one of the following command:

- `allure serve`: This command generates the report in the temp folder and opens a web server with the results in your default browser.

### HTML Report

After each execution HTML report is generated, and you can find it at `target/cucumber-reports/cucumber-report.html`.

## Contact Information

- Email: abdulrehmanfayyaz3083@gmail.com

Feel free to reach out to me if you have any questions or feedback about my project. I'm always happy to help!
