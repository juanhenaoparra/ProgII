package caso1;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Carlos Cuesta
 */
public class MainTienda {

    public static void main(String[] args) {
        
        ArrayList<Venta> listaVentas;
        
        Fabricante f1 = new Fabricante("Pepsico", "Vda. Isla, Ceuta, Funza, Cundinamarca");
        Fabricante f2 = new Fabricante("Zenu", "Facatativa, Bogota D.C.");
        Fabricante f3 = new Fabricante("Super Alimentos", "Manizales, Caldas");
        Fabricante f4 = new Fabricante("Postobon", "Jumbo, Valle del Cauca");
        
        Producto p1 = new Producto("PRD01", "Doritos");
        Producto p2 = new Producto("PRD02", "Cheese Tris");
        Producto p3 = new Producto("PRD03", "Natuchips");
        Producto p4 = new Producto("PRD04", "Suiza");
        Producto p5 = new Producto("PRD05", "Practicarne");
        Producto p6 = new Producto("PRD06", "Trululu");
        Producto p7 = new Producto("PRD07", "Super Coco");
        Producto p8 = new Producto("PRD08", "Manzana 2L");
        Producto p9 = new Producto("PRD09", "Jugo Hit Mora");
        
        Producto temp = new Producto(p2.getCodigo(), p2.getNombre()); //¿? pq no funciona si se direcciona a temp = p2
        p2.setCodigo(p1.getCodigo());
        p2.setNombre(p1.getNombre());
        p1.setCodigo(temp.getCodigo());
        p1.setNombre(temp.getNombre());
        
        ProductoDisponible pd1 = new ProductoDisponible(50, f1, p1, 1000, 750);
        ProductoDisponible pd2 = new ProductoDisponible(30, f1, p2, 1200, 950);
        ProductoDisponible pd3 = new ProductoDisponible(35, f1, p3, 1200, 850);
        ProductoDisponible pd4 = new ProductoDisponible(40, f2, p4, 2400, 1500);
        ProductoDisponible pd5 = new ProductoDisponible(20, f2, p5, 2500, 2000);
        ProductoDisponible pd6 = new ProductoDisponible(120, f3, p6, 200, 80.5);
        ProductoDisponible pd7 = new ProductoDisponible(80, f3, p7, 500, 300);
        ProductoDisponible pd8 = new ProductoDisponible(30, f4, p8, 2250, 1500);
        ProductoDisponible pd9 = new ProductoDisponible(30, f4, p9, 1800, 1200);
        
        Tienda tienda = new Tienda("Makro", "Cra. 15 ##10-32, Dosquebradas, Risaralda");
        Tienda tienda2 = new Tienda("Merko", "Cra. 09 ##05-35, Filadelfia, Caldas");
        
        Departamento d1 = new Departamento("Departamento de tecnología", tienda);
        Empleado e1 = new Empleado("EMP01", "Fernando Fernández", d1);
        Empleado e2 = new Empleado("EMP02", "Gonzalo González", d1);
        Empleado e3 = new Empleado("EMP03", "Alvaro Alvarez", d1);
        Empleado e4 = new Empleado("EMP04", "Ximena Jimenez", d1);
        d1.setJefe(e1);
        
        Departamento d2 = new Departamento("Departamento de limpieza", tienda);
        Empleado e5 = new Empleado("EMP05", "John Doe", d2);
        Empleado e6 = new Empleado("EMP06", "Franco González", d2);
        Empleado e7 = new Empleado("EMP07", "Alvaro Uribe", d2);
        d2.setJefe(e5);
        
        Departamento d3 = new Departamento("Departamento de analisis", tienda);
        Empleado e8 = new Empleado("EMP08", "Mark Zuckerberg", d3);
        Empleado e9 = new Empleado("EMP09", "Stevie Wozniak", d3);
        Empleado e10 = new Empleado("EMP10", "Paul Allen", d3);
        d3.setJefe(e8);
        
        Departamento d4 = new Departamento("Departamento de marketing", tienda2);
        Empleado e11 = new Empleado("EMP11", "Benjamin Franklin", d4);
        Empleado e12 = new Empleado("EMP12", "Amanda Cerni", d4);
        Empleado e13 = new Empleado("EMP13", "Elon Musk", d4);
        d4.setJefe(e11);
        
        Cliente c1 = new Cliente("CLN01", "Rodrigo Rodríguez");
        Cliente c2 = new Cliente("CLN02", "Sundar Pichai");
        Cliente c3 = new Cliente("CLN03", "Aretha Franklin");
        Cliente c4 = new Cliente("CLN04", "Gary Vaynerchuk");
        
        Calendar fecha = Calendar.getInstance();
        fecha.set(2019, 05, 07);
        
        Venta v1 = new Venta("V01", fecha, c1, e1);
        Venta v2 = new Venta("V02", fecha, c2, e10);
        Venta v3 = new Venta("V03", fecha, c3, e13);
        Venta v4 = new Venta("V04", fecha, c4, e9);

        v1.setDetalleVenta(new DetalleVenta(2, pd1));
        v1.setDetalleVenta(new DetalleVenta(3, pd2));
        v2.setDetalleVenta(new DetalleVenta(3, pd4));
        v2.setDetalleVenta(new DetalleVenta(8, pd5));
        v3.setDetalleVenta(new DetalleVenta(6, pd6));
        v4.setDetalleVenta(new DetalleVenta(4, pd9));
        
        listaVentas = ventasAdd(v1, v2, v3, v4);
        
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
        System.out.println(e12);
        printVentas(listaVentas);
    }
    
    public static ArrayList<Venta> ventasAdd(Venta... ventas){
        ArrayList<Venta> lv = new ArrayList();
        
        for(Venta v: ventas){
            lv.add(v);
        }
        
        return lv;
    }
    
    public static void printVentas(ArrayList<Venta> lv){
        for(Venta v : lv){
            System.out.println(v);
        }
    }
    
}
