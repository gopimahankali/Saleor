# Enterprise E-Commerce Automation Framework (Saleor Platform)

An end-to-end UI automation and regression testing framework engineered to validate complex transaction lifecycles on the Saleor e-commerce platform. This architecture leverages **Java** and **Selenium WebDriver** to execute robust, scalable testing sweeps across critical business funnels, including account creation and product discovery.

---

## 🛠️ Framework Technology Stack
*   **Automation Engine:** Selenium WebDriver 4.x
*   **Design Pattern:** Page Object Model (POM) with deep decoupling
*   **Assertion Engine:** TestNG Test Runner
*   **Build Customization:** Apache Maven (`pom.xml`)
*   **Data Injection Layer:** Parameterized External Test Data Configurations (`testdata/`)

---

## 📂 Architecture Breakdown
*   `src/main/java/.../base`: Establishes core initialization setups, managing cross-browser capabilities and dynamic engine instantiations.
*   `src/main/java/.../pages`: Hosts granular web element factories and logical interface actions mapping to physical page views.
*   `src/main/java/.../utilities`: Features structural validation helpers and dynamic wait logic engines.
*   `src/test/java/.../tests`: Orchestrates operational regression flows, execution parameters, and test validations.

---

## 💻 Technical Design Implementations

### 1. Robust E-Commerce Workflow Verification
*   **Identity & Onboarding Validation (`CreateAccountTest.java`):** Automates user onboarding pipelines, validating boundary fields, form constraints, and confirmation loops.
*   **Search Engine Optimization Triage (`Verify_Product_Search_AccuracyTest.java`):** Enforces rigorous verification of search query accuracy, result grid sorting logic, and inventory item retrieval behaviors.

### 2. Scalable Framework Design
*   **Strict Page Object Model Separation:** Completely encapsulates application elements away from functional test logic scripts, slashing script refactoring timelines during UI updates.
*   **Dynamic Element Synchronization:** Built explicit synchronization waits into component interactions to handle async rendering, keeping test executions stable and dependable.
