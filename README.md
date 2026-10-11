# QAAutomationLabs-Automation

## About the Project

This project is a web UI test automation framework developed to practice and demonstrate automated testing using Selenium WebDriver, Java, Cucumber, and the Page Object Model (POM).

The project automates key e-commerce scenarios on a demo shopping website.

## Technologies Used

- Java 25
- Selenium WebDriver 4.49.0
- Cucumber 7.18.1
- JUnit 4.13.2
- Maven
- WebDriverManager 6.3.4
- Page Object Model (POM)

## Automated Test Scenarios

- **Login:** Verify successful login with valid credentials.
- **Product Search:** Search for products by name.
- **Product Filtering:** Filter products by type and price range.
- **Shopping Cart:** Add products to the shopping cart and verify cart contents.
- **Purchase Flow:** Complete the checkout process and verify successful order placement.

## Project Structure

```text
src
└── test
    └── java
        ├── features
        ├── pages
        ├── runner
        ├── stepDefinitions
        └── utilities
```

## Test Execution

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Make sure JDK 25 is configured.
4. Reload the Maven project to download dependencies.
5. Run `runner.TestRunner` to execute the Cucumber scenarios.

## Test Website

[QA Automation Labs Demo Shop](https://shop.qaautomationlabs.com/index.php)

This project is intended for learning and portfolio demonstration purposes.