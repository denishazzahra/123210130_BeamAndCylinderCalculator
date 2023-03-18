/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author LENOVO
 */
public class Rectangle implements CalculateFlatField{
    double width, length;
    public Rectangle(double width, double length)
    {
        this.width=width;
        this.length=length;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double round() {
        return 2*(length+width);
    }
}
