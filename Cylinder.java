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
public class Cylinder extends Circle implements CalculateSpace{
    private double height;
    public Cylinder(double radius)
    {
        super(radius);
    }
    public void setHeight(double height)
    {
        this.height=height;
    }
    public double getHeight()
    {
        return height;
    }

    @Override
    public double surfaceArea() {
        return 2*area()+round()*height;
    }

    @Override
    public double volume() {
        return area()*height;
    }
    
}
