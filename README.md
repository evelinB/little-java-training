# little-java-training
Basics of java, test and annotations

## Eve Barrios

## Consignas
1. Crear un nuevo paquete llamado "paquete"
2. Crear dentro del paquete una clase java llamada "Persona"
3. Agregar atributos:
 - nombre (String)
 - dni (int)
 - edad (byte)
 - genero (Genero -> Tipo de dato ya incluido en el proyecto en el paquete tipos)
4. Crear getters y setters comunes para nombre y dni
4. Crear getters y setters con anotaciones @Getter y @Setter para edad y genero
5. Crear constructor con nombre, dni, edad
6. Crear constructor de todos los parametros anotando sobre la clase @AllArgsConstructor
7. Crear metodo hablar() que devuelva un String con el valor "Hola me llamo 'nombre'"
8. Crear test para la clase. Esto se hace haciendo click sobre el nombre de la clase, y luego presionando Alt + Enter, create Test, dejar opciones por default.
9. En el test:
 - Declarar instancia de persona;
 - crear un metodo anotado con @Before llamado setUp que dentro inicialice la instancia construyendo una persona
 - crear test que verifique cada uno de los atributos de la persona (usar como ejemplo el test de Perro)
 - crear un test que verifique que la persona sabe hablar()
10. OPCIONAL -> Implementar un Test para la Clase Gato, que a diferencia de Perro, su constructor tiene un parametro más que determina si es macho o hembra.

## Prerequisitos
- IntelliJ Community o Ultimate con Lombok plugin instalado
- Al importar el proyecto habilitar el procesado de anotaciones.
File -> Settings -> Build, Execution, Deployment -> Compiler -> Annotation Processors -> Enable annotation processing

## Aclaraciones
El proyecto no posee un método main por lo que el testeo de la funcionalidad se hace exclusivamente mediante los unit tests. Al ejecutar el boton Play (Flechita verde) en los unit tests, la consola debe arrojar resultados positivos.
