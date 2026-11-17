package model;

/**
 * Representa un tour turístico ofrecido por Llanquihue Tour.
 */
public class Tour {
    private String nombre;
    private String ubicacion;
    private int produccion;

    /**
     * Crea un tour con su nombre, ubicación y producción.
     *
     * @param nombre nombre del tour
     * @param ubicacion lugar donde se realiza el tour
     * @param produccion valor de producción asociado al tour
     */
    public Tour(String nombre, String ubicacion, int produccion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.produccion = produccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

    /**
     * Devuelve los datos del tour en un formato legible.
     *
     * @return información del tour
     */
    @Override
    public String toString() {
        return "Tour: " + nombre
                + " | Ubicación: " + ubicacion
                + " | Producción: " + produccion;
    }
}
