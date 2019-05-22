package caso1;

/**
 *
 * @author Carlos Cuesta
 */
public class Empleado {
    
    private String identificacion;
    private String nombre;
    private Departamento departamento;

    public Empleado(String identificacion, String nombre, Departamento departamento) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.departamento = departamento;
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
    
    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public Tienda getTienda() {
        return departamento.getTienda();
    }

    @Override
    public String toString() {
        return "Empleado {" 
                + "\n\tidentificacion: " + identificacion 
                + "\n\tnombre: " + nombre 
                + "\n\tdepartamento: " + departamento.getNombre()
                + "\n\ttienda: " + departamento.getTienda().getNombre()
                + "\n}";
    }
}
