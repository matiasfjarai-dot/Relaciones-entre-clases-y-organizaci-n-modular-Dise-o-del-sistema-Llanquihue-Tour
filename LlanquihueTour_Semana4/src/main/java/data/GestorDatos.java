package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * Lee los registros de tours desde el archivo tours.txt.
 */
public class GestorDatos {

    /**
     * Carga los tours desde resources/tours.txt y los almacena en un ArrayList.
     *
     * @return lista de tours leídos desde el archivo
     */
    public ArrayList<Tour> cargarTours() {
        ArrayList<Tour> tours = new ArrayList<>();

        InputStream archivo = getClass().getClassLoader()
                .getResourceAsStream("tours.txt");

        if (archivo == null) {
            System.out.println("Error: no se encontró el archivo tours.txt en resources.");
            return tours;
        }

        try (BufferedReader lector = new BufferedReader(
                new InputStreamReader(archivo, StandardCharsets.UTF_8))) {

            String linea;

            while ((linea = lector.readLine()) != null) {
                if (linea.isBlank()) {
                    continue;
                }

                String[] datos = linea.split(";");

                if (datos.length != 3) {
                    System.out.println("Registro omitido por formato incorrecto: " + linea);
                    continue;
                }

                try {
                    String nombre = datos[0].trim();
                    String ubicacion = datos[1].trim();
                    int produccion = Integer.parseInt(datos[2].trim());

                    Tour tour = new Tour(nombre, ubicacion, produccion);
                    tours.add(tour);

                } catch (NumberFormatException e) {
                    System.out.println("Registro omitido: la producción no es un número: " + linea);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return tours;
    }
}
