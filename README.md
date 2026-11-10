[README.md](https://github.com/user-attachments/files/34607909/README.md)
# Llanquihue Tour - Semana 3

## Descripcion del proyecto

Este proyecto corresponde a la actividad sumativa de Desarrollo Orientado a Objetos I. El programa representa de manera sencilla a personas y empleados de la agencia de turismo Llanquihue Tour.

Fue desarrollado en **Java**, para ejecutarse en **IntelliJ IDEA**. Utiliza clases, atributos privados, constructores, metodos `get` y `set`, composicion, herencia y `toString()`.

## Clases utilizadas

* **Direccion:** guarda la calle, el numero y la comuna.
* **Persona:** guarda el nombre y el RUT, y crea internamente un objeto `Direccion` (**composicion**).
* **Empleado:** hereda de `Persona` usando `extends` y agrega el cargo y el sueldo base (**herencia**).
* **Main:** crea tres objetos (un cliente y dos empleados) y muestra sus datos en la consola.

## Organizacion de carpetas

```text
LlanquihueTour\_Semana3/
|-- pom.xml
|-- README.md
|-- src/
    |-- main/
        |-- java/
            |-- model/
            |   |-- Direccion.java
            |   |-- Persona.java
            |   |-- Empleado.java
            |-- app/
                |-- Main.java
```

El paquete `model` contiene las clases que representan los datos. El paquete `app` contiene `Main`, que inicia el programa.

## Conceptos aplicados

* **Encapsulamiento:** los atributos se declaran `private`, y se utilizan metodos `get` y `set` para acceder a ellos.
* **Composicion:** dentro del constructor de `Persona` se crea una `Direccion` con `new Direccion(...)`. Asi cada persona tiene su propia direccion.
* **Herencia:** `Empleado extends Persona`, por lo que puede reutilizar el nombre, el RUT y la direccion sin volver a escribir esos atributos.
* **`toString()`:** entrega los datos de cada objeto de manera legible en consola.
* **Javadoc:** los metodos tienen comentarios que explican su proposito y, cuando corresponde, sus parametros y valores devueltos.

## 

