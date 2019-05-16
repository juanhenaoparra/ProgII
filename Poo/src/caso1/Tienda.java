package caso1;

/**
 *
 * @author Usuario para clases
 */
public class Tienda {
    private String nombre;
    private String direccion;
    private String nit;
    
    public Tienda(String nombre, String direccion, String nit){
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
    
    public String getNit(){
        return nit;
    }
    
    public void setNit(String nit){
        this.nit = nit;
    }
    
    @Override
    public String toString(){
        return "Tienda {"
               + "\n\tnombre: " + nombre
               + "\n\tdireccion: " + direccion
               + "\n\t}";
    }
}
