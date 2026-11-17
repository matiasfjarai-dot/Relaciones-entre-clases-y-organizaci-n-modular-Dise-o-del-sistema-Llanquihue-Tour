# Llanquihue Tour - Semana 4
## Manipulación de archivos y colecciones

### Descripción
Aplicación Java que lee información de tours turísticos desde un archivo de texto (`tours.txt`), convierte cada registro en un objeto `Tour` y almacena los objetos en una colección dinámica `ArrayList<Tour>`.

### Requisitos
- Java 17 o superior.
- IntelliJ IDEA.
- Maven (opcional, para administrar el proyecto).

### Estructura del proyecto
```text
LlanquihueTour_Semana4/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   ├── model/
        │   │   └── Tour.java
        │   ├── data/
        │   │   └── GestorDatos.java
        │   └── ui/
        │       └── Main.java
        └── resources/
            └── tours.txt
```

### Formato del archivo de datos
El archivo `src/main/resources/tours.txt` contiene un tour por línea. Cada línea utiliza punto y coma (`;`) para separar los campos, sin encabezado:

```text
Isla Huar;Calbuco;1200
Volcán Osorno;Puerto Varas;1800
Lago Todos los Santos;Petrohué;950
Saltos del Petrohué;Puerto Varas;1500
Frutillar Cultural;Frutillar;800
```

Los campos corresponden a:
1. Nombre del tour (`String`).
2. Ubicación (`String`).
3. Producción (`int`).

### Funcionamiento
1. `Tour`: representa un tour y contiene sus atributos privados, constructor, getters, setters y `toString()`.
2. `GestorDatos`: abre el archivo ubicado en `resources`, lo lee línea por línea, separa los campos con `split(";")` y crea objetos `Tour`.
3. Los objetos se agregan a un `ArrayList<Tour>`.
4. `Main`: muestra todos los tours y después aplica un filtro para mostrar los que tienen producción superior a 1000.

### Ejecución
Abre el proyecto en IntelliJ IDEA y ejecuta el método `main` de `ui.Main`.

El archivo se carga desde el classpath usando `getResourceAsStream`, por lo que funciona tanto desde IntelliJ como desde un paquete Maven compilado, siempre que `tours.txt` esté dentro de `src/main/resources`.

### Resultado esperado
La consola muestra los cinco tours cargados y, en una segunda sección, únicamente aquellos cuya producción es superior a 1000.

### Autoría y propósito académico
Proyecto desarrollado como actividad de la Semana 4 para practicar lectura de archivos, creación de objetos, colecciones dinámicas y filtrado de datos en Java.
