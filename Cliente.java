package prototipocaso1;

/**
 *
 * @author Carlos Cuesta
 */
public class Cliente {

    private String identificacion;
    private String nombre;

    public Cliente(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente {"
                + "\n\tidentificacion: " + identificacion
                + "\n\tnombre: " + nombre
                + "\n\t}";
    }

}
