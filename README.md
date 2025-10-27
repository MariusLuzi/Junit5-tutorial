JUnit 5 Tutorial - From Basics to Best Practices

[![Java](https://img.shields.io/badge/Java-17+-blue.svg)](https://java.com)
[![JUnit 5](https://img.shields.io/badge/JUnit-5-brightgreen.svg)](https://junit.org/junit5/)
[![Maven](https://img.shields.io/badge/Build-Maven-orange.svg)](https://maven.apache.org)

A comprehensive, hands-on tutorial for mastering JUnit 5. This project contains step-by-step examples and explanations covering everything from basic annotations to advanced testing features.

## 📚 What You'll Learn

### Core Concepts
- **Annotations**: `@Test`, `@BeforeEach`, `@AfterEach`, `@BeforeAll`, `@AfterAll`
- **Assertions**: JUnit 5 assertion methods and Hamcrest matchers
- **Test Lifecycle**: Understanding test execution order
- **Display Names**: Using `@DisplayName` for better test reports

### Advanced Features
- **Parameterized Tests**: Run the same test with different inputs
- **Dynamic Tests**: Generate tests at runtime
- **Nested Tests**: Organize tests hierarchically
- **Test Interfaces**: `@TestInterface` and default methods
- **Assumptions**: Conditional test execution with `assumeTrue()`
- **Tags and Filtering**: Organize and selectively run tests
- **Extensions**: Custom test behavior with extensions

## 🚀 Getting Started

### Prerequisites
- Java 8 or higher (recommended: Java 11+)
- Maven 3.6+
- Your favorite IDE (IntelliJ IDEA, Eclipse, or VS Code)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/MariusLuzi/Junit5-tutorial.git
   cd Junit5-tutorial
Build the project:

bash
mvn clean compile
Run all tests:

bash
mvn test
📁 Project Structure
text
Junit5-tutorial/
├── src/
│   ├── main/java/      # Production code examples
│   └── test/java/      # Test examples organized by topic
│       ├── basics/     # Fundamental JUnit 5 features
│       ├── assertions/ # Different assertion techniques
│       ├── advanced/   # Parameterized, dynamic tests
│       └── extensions/ # Custom extensions and lifecycle
├── pom.xml            # Maven configuration
└── README.md          # This file
🧪 Running Tests
Run All Tests
bash
mvn test
Run Specific Test Class
bash
mvn test -Dtest=ClassNameTest
Run Tests with Specific Tags
bash
mvn test -Dgroups="fast"
💡 Examples Overview
Basic Test Example
java
@Test
@DisplayName("Should demonstrate basic assertion")
void basicTest() {
    assertEquals(4, 2 + 2, "Basic math should work");
}
Parameterized Test
java
@ParameterizedTest
@ValueSource(ints = {1, 3, 5, -3, 15})
void isOdd_ShouldReturnTrueForOddNumbers(int number) {
    assertTrue(Math.abs(number) % 2 == 1);
}
Lifecycle Example
java
@BeforeEach
void setUp() {
    // Setup before each test
}

@AfterEach
void tearDown() {
    // Cleanup after each test
}
🛠 Dependencies
JUnit 5 - Core testing framework

AssertJ - Fluent assertions (optional)

Mockito - Mocking framework (optional)

Maven Surefire - Test execution

🤝 Contributing
Found an issue or want to add more examples? Contributions are welcome!

Fork the project

Create your feature branch (git checkout -b feature/amazing-example)

Commit your changes (git commit -m 'Add some amazing example')

Push to the branch (git push origin feature/amazing-example)

Open a Pull Request

📖 Resources
JUnit 5 User Guide

JUnit 5 API Documentation

Maven Surefire Plugin

📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

Happy Testing! 🎯

If you find this tutorial helpful, please give it a ⭐ on GitHub!

text

## To add this README to your project:

1. **Create the file** in your project root directory as `README.md`
2. **Add and commit it** to Git:
   ```powershell
   git add README.md
   git commit -m "docs: Add comprehensive README with project overview"
   git push
