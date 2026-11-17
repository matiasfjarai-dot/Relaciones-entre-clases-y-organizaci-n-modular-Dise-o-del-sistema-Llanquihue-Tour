package model;

/**
 * Guarda los datos de una direccion.
 * Esta clase se utiliza dentro de Persona.
 */
public class Direccion {
    private String calle;
    private int numero;
    private String comuna;

    /**
     * Crea una direccion con sus datos principales.
     *
     * @param calle nombre de la calle
     * @param numero numero de la vivienda
     * @param comuna comuna donde esta ubicada la direccion
     */
    public Direccion(String calle, int numero, String comuna) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
    }

    /**
     * Obtiene el nombre de la calle.
     *
     * @return nombre de la calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Cambia el nombre de la calle.
     *
     * @param calle nuevo nombre de la calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el numero de la vivienda.
     *
     * @return numero de la vivienda
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Cambia el numero de la vivienda.
     *
     * @param numero nuevo numero de la vivienda
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtiene la comuna de la direccion.
     *
     * @return nombre de la comuna
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Cambia la comuna de la direccion.
     *
     * @param comuna nueva comuna
     */
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    /**
     * Muestra los datos de la direccion como texto.
     *
     * @return calle, numero y comuna
     */
    @Override
    public String toString() {
        return calle + " " + numero + ", " + comuna;
    }
}
