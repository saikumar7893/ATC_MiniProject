PROJECT TITLE: Selenium Automation Framework for Travel Booking Platform 

URL: https://flights.booking.com/

PROBLEM STATEMENT: 

Search and Flight Selection:

Open the URL: https://flights.booking.com/

Search for a flight with specified departure and arrival destinations and dates.

Select a flight from the search results.

Passenger Details and Booking:

Enter passenger details including name, age, and contact information.

Fill the details and go till Check and pay page

Verification:

Verify the Contact Details, Passenger Details and Baggage information


OVERVIEW:
This repository contains an automated testing framework designed for the travel booking platform using Java and Selenium.
The framework aims to provide a scalable, maintainable, and platform-independent solution for testing flight search, 
selection, and booking processes.

PREREQUISITES:
Before running the tests, ensure you have the following installed:

Java Development Kit (JDK),
Maven,
Selenium,
TestNG,
Chrome Browser

REQUIREMENTS:

Utilize Java and Selenium for automation.

Ensure tests run and pass on the Chrome browser.

Design a scalable and maintainable automation framework.

Implement helper methods for common interactions like searching, selecting, and filling forms.

Maintain platform-independent code (compatible with Windows, macOS, Linux).

Include a README file with detailed instructions on executing the framework.

Support local execution and Selenium Grid for parallel testing.

(Optional, Good to Have) Dockerize the automation framework.

(Optional, Good to Have) Set up a Jenkins pipeline for automated execution on Selenium Grid.

Apply appropriate design patterns (e.g., Page Object Model, Factory pattern) for maintainability.

Enable test cases to run seamlessly in parallel using TestNG or JUnit.

No data should be hard coded into the scripts.

To Start Execution:

SETUP

1.Clone the repository:
command: git clone https://github.com/saikumar7893/FlightBooking_MiniProject.git

2.Navigate to the project directory:
command: cd travel-booking-automation

3.Install dependencies:
command: mvn clean install

FRAMEWORK STRUCTURE:

The framework follows the Page Object Model (POM) design pattern and includes:

MiniProject/Screenshots:Captures the screenshots here.

src/main/java/BaseTest: BaseTest contains the BaseClass in which all the page objects are inheriting the common basic features from it.

src/main/java/PageObjects: It contains all the page clases representing the different Pages of an application.

                         /HomePage: Initial Page of the Flight Booking Application

                         /HomePageLocationTest: Initial Page for the Second TestCase
                         
                         /FlightSelect: page where we are going to select the customized Flight.
                         
                         /ContactInformationPage: Here It takes the details of the travellers.
                         
                         /SeatSelection: Selection of the Flight Tickets in this Page.
                         
                         /DetailsVerification:After all the Flights and Details are selected It will be landed into the payment Page that gives the Information about the contact details,
                          traveller and the baggage details will be verified here.
                          
src/main/java/Utilities/ReadPropertyFile: provides a method (getProperty1) for reading a specified key's value from a configuration file (Config.properties).

                       /Utility: This class contains the Functionality for the Screenshot when ever the user needs the reequirements like failure occurs or success.

src/main/resources: It contains the Configuration Properties

src/test/java/BookingFlight: Test class implementing scenarios.

             /FlightLocations: Implementing the Test Case for the Invalid Locations

pom.xml: It contains configuration information related to the project's build process, dependencies, plugins, and other settings. 

PROJECT INFORMATION:

Group ID: Identifies the project's group.

Artifact ID: Specifies the project's unique identifier.

Version: Represents the version of the project.



DEPENDENCIES:

Selenium WebDriver (4.14.0):
Selenium is a powerful tool for controlling web browsers through programs and performing browser automation.

Log4j (1.2.17):
Log4j is a logging library for Java.

JUnit (4.13.2):
JUnit is a simple framework to write repeatable tests.

WebdriverManager (5.6.2):
WebDriverManager is a library that helps to automate the management of the binary drivers required by Selenium WebDriver.

TestNG (7.8.0):
TestNG is a testing framework inspired by JUnit and NUnit but introducing some new functionalities that make it more powerful and easier to use.

Apache POI (4.1.2):
Apache POI is a set of Java APIs to manipulate various file formats based on Microsoft Office standards.

WORKING PROCESS:

TEST CASE-1:

1. In this UI Automation using Automation FrameWork I have created POM(Page Object Model) mostly for clean structure and to avoid Duplication in the test cases.

2. At First we need to setup a driver to initialize the browser or fire fox etc..

3. In order to prevent Hard Coding I have created config.properties and with the help of ReadPropertyFile I used to get the keys from it like url and contavt details information.

4. In the Home Page initially I have selected the round trip and automated the from and to locations with the help of the xpaths.

5. Later on navigated to the Flights Selection Page and clicked on view details based on our requirements.

6. Now you will be redirected to the ContactInformationPage where you need to send the information like mail,phone number without hard coding.

7. This time you will be navigated to the seat selection and click on the skip.

8. Finally you will be in the page Check and pay shows you the end of the Automation, There you need to pick the information regarding the contact, Traveller, and the baggage details
with the help of the xpath and gettext methods.

9. I have created a BookingFlight class where objects of the page objects are created and accessed the methods of it. It can be executed with the help of the TestNG. We need to use multiple 
Systematic Annotations such as @BeforeMethod, @Test, @AfterMethod

10. @BeforeMethod allows the method to execute before the execution of each @Test methods, whereas @afterMethod is executed after the execution of each @Test methods.

11. Finally I have Asserted the Information with expected values and Returned the successfull automation process.

TESTCASE-2:

1.A Small Base Test Case where Evaluating the from and to locations in the Home page.

2.Initially in this I have given the from and to location names as same.

3.So there is an error that gives Origin and Destination cant be same.

4.With the help of Method in the Utility Class I will take the screen shot of the page when ever the error occurs.

5.And the images will be stored in the Same Folder Structure as given by the Xpath.







