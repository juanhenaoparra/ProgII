package prototipocaso1;

/**
 *
 * @author Usuario para clases
 */
public class Tienda {
    private String nombre;
    private String direccion;
    
    public Tienda(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
        return "Tienda {"
               + "\n\tnombre: " + nombre
               + "\n\tdireccion: " + direccion
               + "\n\t}";
    }
}
