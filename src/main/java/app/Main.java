package app;

import model.Persona;
import model.Empleado;

/**
 * Clase principal para probar las clases del sistema Llanquihue Tour.
 */
public class Main {

    /**
     * Crea tres objetos y muestra sus datos en consola.
     *
     * @param args argumentos del programa (no se utilizan)
     */
    public static void main(String[] args) {
        // Un cliente, que utiliza la clase Persona.
        Persona cliente = new Persona("Ignacia Antonia", "18.567.935-k",
                "Los Alerces", 150, "Puerto Varas");

        // Dos empleados, que heredan de la clase Persona.
        Empleado guia = new Empleado("Nicolaz Valenzuela", "17.098.784-4",
                "San Francisco", 420, "Puerto Varas", "Guia turistico", 750000);

        Empleado recepcionista = new Empleado("Valentina Rojas", "17.998.993-1",
                "Vicente Perez Rosales", 80, "Frutillar", "Recepcionista", 680000);

        System.out.println("===== LLANQUIHUE TOUR =====");
        System.out.println("\nCLIENTE:");
        System.out.println(cliente.toString());

        System.out.println("\nEMPLEADO 1:");
        System.out.println(guia.toString());

        System.out.println("\nEMPLEADO 2:");
        System.out.println(recepcionista.toString());
    }
}
