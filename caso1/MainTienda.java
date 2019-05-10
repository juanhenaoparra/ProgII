package caso1;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Carlos Cuesta
 */
public class MainTienda {

    public static void main(String[] args) {
        
        Fabricante f1 = new Fabricante("Pepsico", "Vda. Isla, Ceuta, Funza, Cundinamarca");
        Producto p1 = new Producto("PRD01", "Doritos");
        Producto p2 = new Producto("PRD02", "Cheese Tris");
        Producto p3 = new Producto("PRD03", "Natuchips");
        // agregar otros tres fabricantes con sus respectivos productos
        
        ProductoDisponible pd1 = new ProductoDisponible(50, f1, p1, 1000, 750);
        ProductoDisponible pd2 = new ProductoDisponible(30, f1, p2, 1200, 950);
        // y así sucesivamente para cada uno de los productos definidos
        
        Tienda tienda = new Tienda("Makro", "Cra. 15 ##10-32, Dosquebradas, Risaralda");
        
        Departamento d1 = new Departamento("Departamento de tecnología", tienda);
        Empleado e1 = new Empleado("EMP01", "Fernando Fernández", d1);
        Empleado e2 = new Empleado("EMP02", "Gonzalo González", d1);
        // agregar otros dos empleados al departamento d1
        d1.setJefe(e1);
        // agregar otros tres departamentos con mínimo 3 empleados
        
        Cliente c1 = new Cliente("CLN01", "Rodrigo Rodríguez");
        // agregar unos cuantos clientes más
        
        Calendar fecha = Calendar.getInstance();
        fecha.set(2019, 05, 07);
        
        Venta v1 = new Venta("V01", fecha, c1, e1);  
        
//        ArrayList<DetalleVenta> dv1 = v1.getDetallesVenta();
//        dv1.add(new DetalleVenta(2, pd1));
//        dv1.add(new DetalleVenta(3, pd2));

        v1.setDetalleVenta(new DetalleVenta(2, pd1));
        v1.setDetalleVenta(new DetalleVenta(3, pd2));
        
        // Proceder de forma similar para agregar unas 4 ventas más
        
        // Agregar las ventas creadas a una instancia de ArrayList
        
        // Mostrar el total de las ventas a partir de la información contenida en el ArrayList
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(f1);
        System.out.println(c1);
        System.out.println(pd1);
        System.out.println(pd2);
        System.out.println(tienda);
        System.out.println(d1);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(v1);
    }
    
}
