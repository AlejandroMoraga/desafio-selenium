Proyecto de automatización con:
Maven
Java 21
Selenium webdriver

**Evaluación Técnica: Automatización de Pruebas Web con Selenium y Java**
Este desafío está diseñado para evaluar tus conocimientos fundamentales en automatización de pruebas. No
buscamos la perfección, sino entender tu proceso de pensamiento, tu familiaridad con las herramientas y tu capacidad
para resolver problemas básicos.
Descripción del Desafío
Deberás automatizar el siguiente flujo de prueba en el sitio web de práctica **https://www.saucedemo.com/.**

1. Requisitos del proyecto:
  Crea un nuevo proyecto Maven.
  En el archivo , agrega las dependencias necesarias para Selenium WebDriver y TestNG (o JUnit, si
  lo prefieres).
  Configura el proyecto en tu IDE preferido (Eclipse o IntelliJ IDEA).
  Realizar la programación del proyecto con patrón de diseño POM (Page Object Model).

2. Creación del Scripts de Prueba:
  Crea una clase de prueba (por ejemplo, LoginTest.java ).
  Dentro de esta clase, crea un método de prueba usando la anotación @Test .
  **Script de Prueba #1: Agregar item al carrito
    i. Abrir el navegador y navegar a https://www.saucedemo.com/ .
    ii. Ingresar el nombre de usuario "standard_user" en el campo de usuario.
    iii. Ingresar la contraseña "secret_sauce" en el campo de contraseña.
    iv. Hacer clic en el botón de login.
    v. Verificar (Aserción): Comprobar que el login fue exitoso. Puedes hacerlo verificando que el título de la
    página de productos "Products" sea visible después de iniciar sesión.
    vi. Agregar el primer producto de la lista (por ejemplo, "Sauce Labs Backpack") al carrito de compras
    haciendo clic en su botón "Add to cart".
    vii. Hacer clic en el ícono del carrito de compras para ir a la página del carrito.
  a. Verificar (Aserción): Comprobar que el producto "Sauce Labs Backpack" se encuentra en el carrito.

  **Script de Prueba #2: Validación de Login Inválido
    i. Navegar a la página de login.
    ii. Intentar iniciar sesión con el usuario "locked_out_user" y la contraseña "secret_sauce".
  b. Verificar (Aserción): Comprobar que se muestra un mensaje de error en la página. El texto del mensaje
  debe ser: Epic sadface: Sorry, this user has been locked out.
  
  Script de Prueba #3: Ordenamiento de Productos
    i. Realizar un login exitoso con "standard_user".
    ii. Localizar el menú desplegable (dropdown) de ordenamiento de productos.
    iii. Seleccionar la opción "Price (high to low)".
    
3. Verificar (Aserción): Comprobar que los productos se han ordenado correctamente.
  Sugerencia Obtén el precio del primer producto y el precio del último producto de la lista. Convierte los
  textos a números y verifica que el precio del primero sea mayor ( ) que el del último.

Script de Prueba #4: Flujo Completo de Compra (End-to-End)
  i. Realizar un login exitoso con "standard_user".
  ii. Agregar cualquier producto al carrito.
  iii. Ir al carrito y hacer clic en el botón "Checkout".
  iv. Rellenar el formulario de información del comprador con datos de prueba (Nombre, Apellido, Código
  Postal).
  v. Hacer clic en "Continue".
  vi. En la página de resumen del pedido, hacer clic en "Finish".
a. Verificar (Aserción): Comprobar que se muestra el mensaje de confirmación "Thank you for your order!".

4. Control de Versiones:
  Inicializa un repositorio de Git en la carpeta de tu proyecto.
  Realiza al menos un commit con tu código finalizado.
  Sube tu proyecto a un repositorio público en GitHub o GitLab.

Entregables
Al finalizar, debes proporcionar el enlace a tu repositorio público de Git por correo. El repositorio debe contener:
  El archivo pom.xml con las dependencias.
  El código fuente de tu clase de prueba en Java.
  Un archivo .gitignore simple para

