package model;

/**
 * Representa a un empleado de Llanquihue Tour.
 * Hereda los datos de Persona y agrega cargo y sueldo base.
 */
public class Empleado extends Persona {
    private String cargo;
    private int sueldoBase;

    /**
     * Crea un empleado con sus datos personales y laborales.
     *
     * @param nombre nombre del empleado
     * @param rut RUT de ejemplo del empleado
     * @param calle calle de su direccion
     * @param numero numero de su direccion
     * @param comuna comuna de su direccion
     * @param cargo trabajo que realiza en la agencia
     * @param sueldoBase sueldo base en pesos chilenos
     */
    public Empleado(String nombre, String rut, String calle, int numero,
                    String comuna, String cargo, int sueldoBase) {
        super(nombre, rut, calle, numero, comuna);
        this.cargo = cargo;
        this.sueldoBase = sueldoBase;
    }

    /**
     * Obtiene el cargo del empleado.
     *
     * @return cargo del empleado
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Modifica el cargo del empleado.
     *
     * @param cargo nuevo cargo del empleado
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Obtiene el sueldo base del empleado.
     *
     * @return sueldo base en pesos chilenos
     */
    public int getSueldoBase() {
        return sueldoBase;
    }

    /**
     * Modifica el sueldo base del empleado.
     *
     * @param sueldoBase nuevo sueldo base en pesos chilenos
     */
    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    /**
     * Muestra los datos personales y laborales del empleado.
     *
     * @return texto con datos de Persona, cargo y sueldo base
     */
    @Override
    public String toString() {
        return super.toString()
                + " | Cargo: " + cargo
                + " | Sueldo base: $" + sueldoBase;
    }
}
