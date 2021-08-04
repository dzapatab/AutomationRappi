Automation RetoServicios

Introduction 🚀
Automation made for a business challenge, with transactions to call APIs with GET, POST, PUT method.

Scenarios
Scenario: Consume API with GET method
   Since the user connects to the API
   When you consume the get method
   Then you should see response code 200
   Then verify that the id "8" exists

Scenario: Consume API with POST method
    Since the user connects to the API
    When you consume the post method with the name "Alejo"
    Then you should see response code 201
    Then verify that the name "Alejo" exists

Scenario: Consume API with PUT method
    Since the user connects to the API
    When you consume the put method with the name "DiegoA"
    Then you should see response code 200
    Then verify that the name has been changed to "DiegoA"

Pre requirements to execute 📋
Java version 1.8, update 151 or higher and JDK (environment variables configured).
Eclipse IDE or IntelliJ IDEA (version 2018.3 or higher).
Gradle version 6.0 or higher (environment variables configured).
Cucumber for Java Plugin (updated version).
Gherkin Plugin (updated version).

Installation 🔧
To clone this repository locally, the following command must be run: 
git clone https://github.com/dzapatab/AutomationRappi.git
Import the project from Eclipse or IntelliJ IDE under the structure of an existing Gradle project.
Configure JRE System Library with JavaSE-1.8.
Configure the encoding to UTF-8 to the project once it is imported.

Compile the project and generate Wrapper 🔨
To build the project you must run the command: gradle clean build -x test
To generate the project wrapper files, you must run the command: gradle wrapper --gradle-distribution-url https://services.gradle.org/distributions/gradle-6.0-bin.zip
Command for execution 💻
The project can be executed from the console with the following command: gradle clean test aggregate

Project structure 🚧
RetoRappi/src/main/java/
+ exceptions
    Classes that catch custom exceptions when automation fails and cannot find an expected field.

+ questions
    Classes with which values are obtained and then verified in the stepdefinitions (asserts).

+ tasks
    Classes that perform high-level actions, such as login in the application, enter data into a form, etc.

+ utils
    Classes that contain common functionalities.

RetoRappi/src/test/java/
+ runners
    Classes to run automation with the scenarios indicated in the feature.

+ stepdefinitions
    Classes that are the entry point of the feature to translate from Gherkin language to machine language and thus allow the execution of automation.
RetoRappi/src/test/resources/

+ templates
    templates json.

+ features
    The project features are found.

Built with 🛠
Automation was developed with:

BDD - Development strategy
Screenplay
Gradle - Dependency manager
Cucumber - Framework to automate BDD tests
Serenity BDD - Open source library for report generation
Gherkin - Business Readable DSL Language (Business-readable domain specific language)
Versioning 📌
Git was used for version control, applying GitFlow 🔀
--------------------------------------------------------------------------------------------------------
Automation Calculator

Introduction 🚀
Automation created in order to perform the basic operations in the calculator, addition, subtraction, multiplication and division

Scenarios
Scenario: Sum
    Since the user user opens the calculator
    When you perform the operation, add between "2" and "6"
    Then you should see the result "8"
Scenario: Subtraction
    When he performs the operation, he subtracts between "6" and "2"
    Then you should see the result "4" in the subtraction.
Scenario: Sum
    When you perform the multiplication operation between "2" and "6"
    Then you should see the result "12" in the multiplication.
Scenario: Division
    When you perform the division operation between "8" and "2"
    Then you should see the result "4" in the division.

Pre requirements to execute 📋
Java version 1.8, update 151 or higher and JDK (environment variables configured).
Eclipse IDE or IntelliJ IDEA (version 2018.3 or higher).
Gradle version 6.0 or higher (environment variables configured).
Cucumber for Java Plugin (updated version).
Gherkin Plugin (updated version).
Have Appium installed
Have Android Studio installed
Install Pixel 3 Emulator API 29, Api 29, Android 10
Install apk in the path https://google-calculator.uptodown.com/android Version 7.8 (271241277) in the emulator
Have android environment variables set
Configurate Capabilities in appium:
{
  "platformName": "Android",
  "platformVersion": "10",
  "deviceName": "Pixel 3 API 29",
  "automationName": "UiAutomator2",
  "appPackage": "com.google.android.calculator",
  "appActivity": "com.android.calculator2.Calculator"
}

Command for execution 💻
The project can be executed from the console with the following command: gradle clean test

Project structure 🚧
Calculator\src\main\java

+ questions
    Classes with which values are obtained and then verified in the stepdefinitions (asserts).

+ tasks
    Classes that perform high-level actions, such as login in the application, enter data into a form, etc.

+ utils
    Classes that contain common functionalities.

+ hooks
    Configurations of capabilities.

+ interactions
    Small actions that can be reused.

+ models
    Layer to encapsulate the data.

+ screens
    Configuration for the correct operation of the project.

+ userinterfaces
    Mapping objects for later manipulation of these

Calculator\src\test\java
+ runners
    Classes to run automation with the scenarios indicated in the feature.

+ stepdefinitions
    Classes that are the entry point of the feature to translate from Gherkin language to machine language and thus allow the execution of automation.

Calculator/src/test/resources/

+ apk
    templates json and apk.

+ features
    The project features are found.

Built with 🛠
Automation was developed with:

BDD - Development strategy
Screenplay
Gradle - Dependency manager
Cucumber - Framework to automate BDD tests
Appium
Android Studio
Gherkin - Business Readable DSL Language (Business-readable domain specific language)

Versioning 📌
Git was used for version control, applying GitFlow 🔀

Authors 👨
Diego Alejandro Zapata Betancur - dazb12@hotmail.com