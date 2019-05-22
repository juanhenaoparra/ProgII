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
public class Circle extends Shape{
    private int radius = 0;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    @Override
    public float getArea(){
        return (float) (Math.PI * radius * radius);
    }
    
    @Override
    public float getPerimeter(){
        return (float) (2 * Math.PI * radius);
    }
}
