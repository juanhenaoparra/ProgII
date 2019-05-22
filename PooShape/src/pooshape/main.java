/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooshape;

/**
 *
 * @author prog
 */

import javax.swing.JOptionPane;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String title = "";
        
        int size = 0;
        Shape[] shapes = {};
        Shape shape = null;
        Rect rect = null;
        Circle circle = null;
        Square square = null;
        
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        int radius = 0;
        int edge = 0;
        //float area = 0;
        //float perimeter = 0;
        char type = '?';
        
        int count = 0;
        
        title = "Enter the number of figures: ";
        size = Integer.parseInt(JOptionPane.showInputDialog(title));
        
        shapes = new Shape[size];
        
        for (int i = 0; i < shapes.length; i++) {
            title = "Type the type of figure (R: Rectangle, C: Circle, S: Square): ";
            type = JOptionPane.showInputDialog(title).toUpperCase().charAt(0);
            
            title = "Type the X coordinate of the figure: " + (i + 1);
            x = Integer.parseInt(JOptionPane.showInputDialog(title));
            
            title = "Type the Y coordinate of the figure: " + (i + 1);
            y = Integer.parseInt(JOptionPane.showInputDialog(title));
            
            switch (type) {
                case 'R':
                    title = "Type the width of the figure: " + (i + 1);
                    width = Integer.parseInt(JOptionPane.showInputDialog(title));
                    title = "Type the height of the figure: " + (i + 1);
                    height = Integer.parseInt(JOptionPane.showInputDialog(title));
                    rect = new Rect();
                    rect.setX(x);
                    rect.setY(y);
                    rect.setHeight(height);
                    rect.setWidth(width);
                    shapes[i] = rect;
                    break;
                case 'C':
                    title = "Type the radius of the figure: " + (i + 1);
                    radius = Integer.parseInt(JOptionPane.showInputDialog(title));
                    circle = new Circle();
                    circle.setX(x);
                    circle.setY(y);
                    circle.setRadius(radius);
                    shapes[i] = circle;
                    break;
                case 'S':
                    title = "Type the edge of the figure: " + (i + 1);
                    edge = Integer.parseInt(JOptionPane.showInputDialog(title));
                    square = new Square();
                    square.setX(x);
                    square.setY(y);
                    square.setEdge(edge);
                    shapes[i] = square;
                    break;
                default:
                    break;
            }                
        }
        
        count = 1;
        
        for (Shape s: shapes) {
            System.out.println("Figure " + count + ": " + s.getClass().getName().substring(9));
            System.out.println("Area:" + s.getArea());
            System.out.println("Perimeter: " + s.getPerimeter() + "\n");        
            count += 1;
        }
        
    }
    
}
