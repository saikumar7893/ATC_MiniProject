# PROJECT TITLE: Selenium Automation Framework for Travel Booking Platform

## URL: [Flights Booking Platform](https://flights.booking.com/)

### PROBLEM STATEMENT:

#### Search and Flight Selection:

1. Open the URL: [Flights Booking Platform](https://flights.booking.com/)
2. Search for a flight with specified departure and arrival destinations and dates.
3. Select a flight from the search results.

#### Passenger Details and Booking:

4. Enter passenger details including name, age, and contact information.
5. Fill the details and proceed to the Check and Pay page.

#### Verification:

6. Verify the Contact Details, Passenger Details, and Baggage information.

### OVERVIEW:

This repository contains an automated testing framework designed for the travel booking platform using Java and Selenium. The framework aims to provide a scalable, maintainable, and platform-independent solution for testing flight search, selection, and booking processes.

### PREREQUISITES:

Before running the tests, ensure you have the following installed:

- Java Development Kit (JDK)
- Maven
- Selenium
- TestNG
- Chrome Browser

### REQUIREMENTS:

- Utilize Java and Selenium for automation.
- Ensure tests run and pass on the Chrome browser.
- Design a scalable and maintainable automation framework.
- Implement helper methods for common interactions like searching, selecting, and filling forms.
- Maintain platform-independent code (compatible with Windows, macOS, Linux).
- Include a README file with detailed instructions on executing the framework.
- Support local execution and Selenium Grid for parallel testing.
- (Optional, Good to Have) Dockerize the automation framework.
- (Optional, Good to Have) Set up a Jenkins pipeline for automated execution on Selenium Grid.
- Apply appropriate design patterns (e.g., Page Object Model, Factory pattern) for maintainability.
- Enable test cases to run seamlessly in parallel using TestNG or JUnit.
- No data should be hard-coded into the scripts.

### To Start Execution:

#### SETUP

1. Clone the repository: `git clone https://github.com/saikumar7893/ATC_MiniProject.git`
2. Navigate to the project directory: `cd travel-booking-automation`
3. Install dependencies: `mvn clean install`

#### FRAMEWORK STRUCTURE:

The framework follows the Page Object Model (POM) design pattern and includes:

- **MiniProject/Screenshots:** Captures the screenshots here.

- **src/main/java/BaseTest:** BaseTest contains the BaseClass in which all the page objects are inheriting the common basic features from it.

- **src/main/java/PageObjects:** It contains all the page classes representing the different Pages of an application.
    - /HomePage: Initial Page of the Flight Booking Application
    - /HomePageLocationTest: Initial Page for the Second TestCase
    - /FlightSelect: Page where we are going to select the customized Flight.
    - /ContactInformationPage: Here It takes the details of the travelers.
    - /SeatSelection: Selection of the Flight Tickets on this Page.
    - /DetailsVerification: After all the Flights and Details are selected, It will be landed on the payment Page that gives the Information about the contact details, traveler, and the baggage details will be verified here.

- **src/main/java/Utilities/ReadPropertyFile:** Provides a method (getProperty1) for reading a specified key's value from a configuration file (Config.properties).

    - /Utility: This class contains the Functionality for the Screenshot when the user needs the requirements like failure occurs or success.

- **src/main/resources:** It contains the Configuration Properties

- **src/test/java/BookingFlight:** Test class implementing scenarios.
    - /FlightLocations: Implementing the Test Case for the Invalid Locations

- **pom.xml:** It contains configuration information related to the project's build process, dependencies, plugins, and other settings.

### PROJECT INFORMATION:

- **Group ID:** Identifies the project's group.
- **Artifact ID:** Specifies the project's unique identifier.
- **Version:** Represents the version of the project.

### DEPENDENCIES:

- **Selenium WebDriver (4.14.0):** Selenium is a powerful tool for controlling web browsers through programs and performing browser automation.
- **Log4j (1.2.17):** Log4j is a logging library for Java.
- **JUnit (4.13.2):** JUnit is a simple framework to write repeatable tests.
- **WebdriverManager (5.6.2):** WebDriverManager is a library that helps automate the management of the binary drivers required by Selenium WebDriver.
- **TestNG (7.8.0):** TestNG is a testing framework inspired by JUnit and NUnit but introducing some new functionalities that make it more powerful and easier to use.
- **Apache POI (4.1.2):** Apache POI is a set of Java APIs to manipulate various file formats based on Microsoft Office standards.

### WORKING PROCESS:

#### TEST CASE-1:

1. UI Automation using the Automation Framework with the Page Object Model (POM) for a clean structure and to avoid duplication in test cases.

2. Set up a driver to initialize the browser or Firefox, etc.

3. Config.properties file for preventing hard coding, providing values like URL and contact details information.

4. Home Page: Selected round trip and automated the from and to locations using Xpaths.

5. Navigated to the Flights Selection Page and clicked on view details based on our requirements.

6. Redirected to the ContactInformationPage, where information like mail and phone number is entered without hard coding.

7. Navigated to seat selection and clicked on skip.

8. Landed on the Check and Pay page, where contact details, traveler, and baggage details are verified using Xpaths and gettext methods.

9. Created a BookingFlight class where objects of the page objects are created and accessed the methods of it. Executed with TestNG using multiple systematic annotations such as @BeforeMethod, @Test, @AfterMethod.

10. @BeforeMethod allows the method to execute before each @Test method, while @AfterMethod is executed after each @Test method.

11. Asserted the information with expected values and returned the successful automation process.

#### TEST CASE-2:

1. A Small Base Test Case evaluating from and to locations in the Home page.

2. Given the from and to location names as the same, causing an error.

3. Utilized the Utility Class method to take a screenshot when an error occurs.

4. Images stored in the same folder structure as given by the XPath.
