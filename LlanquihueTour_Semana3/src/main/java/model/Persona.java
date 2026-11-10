package model;

/**
 * Representa a una persona que se relaciona con Llanquihue Tour.
 * Cada persona tiene una direccion que se crea dentro de esta clase.
 */
public class Persona {
    private String nombre;
    private String rut;
    private Direccion direccion;

    /**
     * Crea una persona con sus datos y su direccion.
     * La direccion se crea aqui como parte de la persona (composicion).
     *
     * @param nombre nombre de la persona
     * @param rut RUT de ejemplo de la persona
     * @param calle calle de la direccion
     * @param numero numero de la direccion
     * @param comuna comuna de la direccion
     */
    public Persona(String nombre, String rut, String calle, int numero, String comuna) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = new Direccion(calle, numero, comuna);
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la persona.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el RUT de la persona.
     *
     * @return RUT guardado
     */
    public String getRut() {
        return rut;
    }

    /**
     * Modifica el RUT de la persona.
     *
     * @param rut nuevo RUT
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * Obtiene la direccion que pertenece a la persona.
     *
     * @return objeto Direccion de la persona
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Cambia la direccion de la persona creando una nueva.
     *
     * @param calle nombre de la nueva calle
     * @param numero numero de la nueva direccion
     * @param comuna nombre de la nueva comuna
     */
    public void setDireccion(String calle, int numero, String comuna) {
        this.direccion = new Direccion(calle, numero, comuna);
    }

    /**
     * Devuelve los datos principales de la persona.
     *
     * @return nombre, RUT y direccion en forma de texto
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre
                + " | RUT: " + rut
                + " | Direccion: " + direccion;
    }
}
