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
Desde LaptopController crea un método que devuelva una lista de objetos Laptop.
Los objetos Laptop se  insertan desde el método main de la clase principal.

##Creacion de un método en LaptopController que reciba un objeto Laptop enviado en formato JSON desde Postman y persistirlo en la base de datos.
Comprobar que al obtener de nuevo los laptops aparece el nuevo ordenador creado.