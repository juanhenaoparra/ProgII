/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooshape;

/**
 *
 * @author parju
 */
public class Square extends Shape{
    
    private int edge = 0;

    public int getEdge() {
        return edge;
    }
    
    public void setEdge(int edge) {
        this.edge = edge;
    }
    
    @Override
    public float getArea() {
        return edge * edge;
    }

    @Override
    public float getPerimeter() {
        return edge * 4;
    }
}
