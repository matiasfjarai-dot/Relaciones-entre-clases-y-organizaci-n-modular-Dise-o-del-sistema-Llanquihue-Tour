package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

/**
 * Clase principal: carga, muestra y filtra los tours.
 */
public class Main {

    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> listaTours = gestor.cargarTours();

        System.out.println("========== LLANQUIHUE TOUR ==========");
        System.out.println("Cantidad de tours cargados: " + listaTours.size());

        System.out.println("\n========== LISTA COMPLETA DE TOURS ==========");
        for (Tour tour : listaTours) {
            System.out.println(tour);
        }

        System.out.println("\n========== TOURS CON PRODUCCIÓN SUPERIOR A 1000 ==========");
        int cantidadFiltrada = 0;

        for (Tour tour : listaTours) {
            if (tour.getProduccion() > 1000) {
                System.out.println(tour);
                cantidadFiltrada++;
            }
        }

        System.out.println("Total de tours que cumplen el filtro: " + cantidadFiltrada);
    }
}
