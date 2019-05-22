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
public class Rect extends Shape{
    private int width = 0;
    private int height = 0;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    @Override
    public float getArea(){
        return width * height;
    }
    
    @Override
    public float getPerimeter(){
        return (width * 2) + (height * 2);
    }
}
