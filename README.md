  # 🧪 Selenium + Cucumber + TestNG Framework

Este proyecto es un framework de automatización de pruebas web utilizando Selenium WebDriver, Cucumber y TestNG con Java.

---

## 🚀 Tecnologías utilizadas

- Java 17
- Selenium WebDriver
- Cucumber (BDD)
- TestNG
- Maven
- WebDriverManager

---

## 📁 Estructura del proyecto
rc/test/java
├── Runner
│ └── TestRunner.java
├── hooks
│ └── Hooks.java
├── pages
│ └── TextBoxPage.java
├── steps
│ └── primerTest.java
└── resources
└── features
└── login.feature


---

## 🧪 Caso de prueba automatizado

El escenario automatiza el flujo en la página:

👉 https://demoqa.com

### Flujo del test:

1. Abrir el navegador Chrome
2. Entrar a DemoQA
3. Hacer click en **Elements**
4. Entrar a **Text Box**
5. Completar el formulario:
   - Nombre
   - Email
   - Dirección
6. Hacer click en **Submit**
7. Validar ejecución correcta

---

## 🧠 Patrón utilizado

Se utiliza el patrón **Page Object Model (POM)**:

- `TextBoxPage` contiene los elementos y acciones de la página
- `primerTest` contiene los pasos del escenario
- `Hooks` maneja apertura y cierre del navegador

---

## ▶️ Cómo ejecutar el proyecto

1. Clonar el repositorio:`bash
git clone https://github.com/franco4000/selenium-cucumber-testng.git

Importar en IntelliJ IDEA como proyecto Maven
Ejecutar la clase:

Notas importantes
Se utiliza WebDriverManager para manejar el driver automáticamente
Se implementan esperas explícitas (WebDriverWait) para estabilidad
Se manejan posibles popups con control de errores
Se usa JavaScript Executor para clicks cuando es necesario


Proyecto creado como práctica de automatización QA con Selenium + Cucumber + TestNG.
Dimitri Franco 
Mail: dimitrifranco1@gmail.com 
linkidin :  www.linkedin.com/in/franco-dimitri-8137419b
