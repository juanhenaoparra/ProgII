package caso1;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Carlos Cuesta
 */
public class Venta {

    private String numero;
    private Calendar fecha;
    private Cliente cliente;
    private Empleado empleado;
    private ArrayList<DetalleVenta> detallesVenta;

    public Venta(String numero, Calendar fecha, Cliente cliente, Empleado empleado) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.empleado = empleado;
        this.detallesVenta = new ArrayList();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getStrFecha() {
        return Util.strFecha(fecha);
    }
    
    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public ArrayList<DetalleVenta> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(ArrayList<DetalleVenta> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }
    
    public void setDetalleVenta(DetalleVenta detalleVenta) {
        detallesVenta.add(detalleVenta);
    }
    
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    public double getTotalVenta() {
        double total = 0;
        for (DetalleVenta dv : detallesVenta) {
            total += dv.getTotalLinea();
        }
        return total;
    }
    
    private String detallesToString() {
        String strDetalle = "\n\tDetalle de la venta:";
        for (DetalleVenta dv : detallesVenta) {
            strDetalle += ("\n\t\t" + dv);
        }
        return strDetalle;
    }

    @Override
    public String toString() {
        // nótese la diferencia al usar un método de instancia y uno de clase
        return "Venta{"
                + "\n\tnumero: " + numero
                + "\n\tfecha: " + getStrFecha()
                + "\n\tcliente: " + cliente.getIdentificacion() + " - " + cliente.getNombre() 
                + detallesToString()
                + Util.rightPad("\n\tTotal de la venta", 56) + String.format("%10.2f", getTotalVenta())
                + "\n}";
    }

}
