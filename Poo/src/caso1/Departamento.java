package caso1;

/**
 *
 * @author Carlos Cuesta
 */
public class Departamento {

    private String nombre;
    private Empleado jefe;
    private Tienda tienda;

    public Departamento(String nombre, Tienda tienda) {
        this.nombre = nombre;
        this.tienda = tienda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado getJefe() {
        return jefe;
    }

    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }
    
    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    @Override
    public String toString() {
        return "Departamento {" 
                + "\n\tnombre: " + nombre 
                + "\n\tjefe: " + jefe.getIdentificacion() + " - " + jefe.getNombre()
                + "\n\ttienda: " + tienda.getNombre() + " - " + tienda.getDireccion()
                + "}";
    }

        

}
