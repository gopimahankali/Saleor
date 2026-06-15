# Enterprise E-Commerce Automation Framework (Saleor Platform)

A highly optimized frontend UI regression testing engine engineered to validate core user journeys on the Saleor e-commerce application. This framework is written in **Java** utilizing **Selenium WebDriver 4.x** and **TestNG** to demonstrate production-grade test automation architecture.

---

## 🛠️ Core Technology Stack
*   **UI Automation Engine:** Selenium WebDriver 4.x
*   **Design Pattern Architecture:** Page Object Model (POM)
*   **Test Runner & Execution:** TestNG 
*   **Data Integration Engine:** Apache POI (Data-Driven External Parameterization)
*   **Build Automation Tool:** Apache Maven (`pom.xml`)

---

## 📂 Core Execution Scripts
The automated validation suite focuses heavily on the two most business-critical customer flows located under `src/test/java/com/automation/framework/tests/`:

1.  **`CreateAccountTest.java` (Data-Driven Identity Validation)**
    *   Leverages a custom TestNG `@DataProvider` engine to inject multi-row Excel matrices from `testdata/UserData.xlsx`.
    *   Executes full parameterized onboarding loops while utilizing explicit synchronization guards to ensure element state readiness.
2.  **`Verify_Product_Search_AccuracyTest.java` (Functional Discovery Validation)**
    *   Validates front-end text querying pipelines using optimized keyboard `.submit()` handlers.
    *   Ensures consistent transactional page transitions across e-commerce product discovery modules.

---

## 💻 Technical Design Implementations
*   **Strict Page Object Model Isolation:** Completely separates raw element locators from underlying execution assertions, cutting maintenance timelines during application UI updates.
*   **Dynamic Synchronization:** Replaced fragile hardcoded thread sleeps with explicit wait boundaries to seamlessly handle asynchronous DOM rendering.
