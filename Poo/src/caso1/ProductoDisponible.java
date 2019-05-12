package caso1;

/**
 *
 * @author Prometeo
 */
public class ProductoDisponible {
    
    private int cantidad;
    private Fabricante fabricante;
    private Producto producto;
    private double precioVenta;
    private double precioCompra;

    public ProductoDisponible(int cantidad, Fabricante fabricante, Producto producto, double precioVenta, double precioCompra) {
        this.cantidad = cantidad;
        this.fabricante = fabricante;
        this.producto = producto;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    @Override
    public String toString() {
        return "ProductoDisponible {" 
                + "\n\tproducto: " + producto.getCodigo() + " - " + producto.getNombre() 
                + "\n\tfabricante: " + fabricante.getNombre() + " - " + fabricante.getDireccion()
                + "\n\tcantidad disponible: " + cantidad
                + "\n\tprecio de compra: " + precioCompra
                + "\n\tprecio de venta: " + precioVenta
                + "\n}";
    }
    
}
