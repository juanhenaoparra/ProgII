package caso1;

import java.util.ArrayList;

/**
 *
 * @author Carlos Cuesta
 */
public class DetalleVenta {

    private int cantidad;
    private ProductoDisponible productoDisponible;

    public DetalleVenta(int cantidad, ProductoDisponible productoDisponible) {
        this.cantidad = cantidad;
        this.productoDisponible = productoDisponible;
    }

    public ProductoDisponible getProductoDisponible() {
        return productoDisponible;
    }

    public void setProductoDisponible(ProductoDisponible productoDisponible) {
        this.productoDisponible = productoDisponible;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double getTotalLinea() {
        return cantidad * productoDisponible.getPrecioVenta();
    }

    @Override
    public String toString() {
        Producto p = productoDisponible.getProducto();
        // nótese la diferencia al usar un método de instancia y uno de clase
        String nombreProducto = Util.rightPad(p.getNombre(), 30);
        String precioVenta = String.format("%10.2f", productoDisponible.getPrecioVenta());
        return cantidad + " - " + nombreProducto + precioVenta + "  " + String.format("%10.2f", getTotalLinea());
    }

}
