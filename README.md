Project Overview

This is a Selenium WebDriver automation framework built using Java, TestNG, and Maven, following the Page Object Model (POM) design pattern.

It automates the SauceDemo application and is designed for scalability, maintainability, and real-world test automation practices.

Framework Structure
## 📁 Project Structure

```text
selenium-testing-framework
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── base
│   │   │   ├── pages
│   │   │   ├── utilities
│   │   │   └── listeners
│   │   │
│   │   └── resources
│   │         config.properties
│   │
│   └── test
│       └── java
│            tests
│
├── testng.xml
├── pom.xml
├── screenshots
├── reports
└── README.md
```


Tech Stack
Java
Selenium WebDriver
TestNG
Maven
WebDriverManager
Page Object Model (POM)

Application Under Test
URL: https://www.saucedemo.com
Type: E-commerce demo application

Features

✔ Page Object Model (POM) Design
✔ Maven-based project structure
✔ Centralized configuration management
✔ Reusable utility classes
✔ Cross-browser support (Chrome setup)
✔ TestNG test execution
✔ Scalable framework design


Configuration

browser=chrome

url=https://www.saucedemo.com

username=standard_user

password=secret_sauce

▶️ How to Run the Project

1️⃣ Clone Repository

git clone https://github.com/your-username/selenium-testing-framework.git

2️⃣ Import Project

Open Eclipse / IntelliJ

Import as Maven Project

3️⃣ Run Tests

Option 1: TestNG XML

Right-click testng.xml → Run As → TestNG Suite

Option 2: Maven Command

mvn clean test

🧪 Test Flow Example

Launch browser

Open application URL

Enter username & password

Click login

Validate login success

📌 Author

👩‍💻 Neethu Mathew

QA Automation Engineer

Skills: Selenium | Java | TestNG | API Testing | POM

🚀 Future Enhancements

Extent Reports integration

Parallel execution

Retry failed tests

CI/CD pipeline (Jenkins)

Docker support

📜 License


This project is for learning and portfolio demonstration purposes.
