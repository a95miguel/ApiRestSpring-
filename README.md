##Spring boot
Proyecto Spring Boot con las dependencias / starters:
* H2
* Spring Data JPA
* Spring Web
* Spring Boot dev tools

Aplicacion Api Rest  con acceso a base de datos.
El acceso se puede realizar con Postman o el navejador.


##Creacion clase HelloController
1. Que sea un controlador REST. 
2. Dentro de la clase crear un método que retorne un saludo. 
3. Probar que retorna el saludo desde el navegador y desde Postman.

##Creacion las clases necesarias para trabajar con "ordenadores":
Laptop (entidad) - LaptopRepository (repositorio) - LaptopController (controlador)

##Creacion de un método en LaptopController que reciba un objeto Laptop enviado en formato JSON desde Postman y persistirlo en la base de datos.

##Implementar los métodos CRUD: findAll(),findOneById(),create(),update(),delete(),deleteAll()

##Implementar swagger sobre el API REST y verificar que funciona en la URL: http://localhost:8081/swagger-ui/

##Crear casos de test para el controlador de Laptop desde Spring Boot

Probar a empaquetar la aplicación con maven package, vereficar desde la terminal el comando: java -jar target/demo-0.0.1-SNAPSHOT.jar.
Crear un perfil para dev y otro para test con una propiedad nueva que carguemos en el controlador.

##Desplegar el API REST de Laptops en Render 
https://apirestspring.onrender.com

##Implementacion Spring Security sobre el proyecto  y configurar 2 usuarios en memoria utilizando una clase WebSecurityConfig.