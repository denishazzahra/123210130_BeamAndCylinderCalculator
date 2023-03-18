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
public class Circle implements CalculateFlatField{
    final public double pi=3.14;
    double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }

    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double round() {
        return 2*pi*radius;
    }
    
}
