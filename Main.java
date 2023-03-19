/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Main 
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char option;
        do
        {
            System.out.println("MENU");
            System.out.println("1. Rectangle and Beam");
            System.out.println("2. Circle and Cylinder");
            System.out.println("0. Exit");
            System.out.print("Choose : ");
            int menu=input.nextInt();
            if(menu==1)
            {
                double l,w,h;
                System.out.println("\nRECTANGLE AND BEAM\n");
                do
                {
                    System.out.print("Length : ");
                    l=input.nextDouble();
                }
                while(l<=0);
                do
                {
                    System.out.print("Width  : ");
                    w=input.nextDouble();
                }
                while(w<=0);
                do
                {
                    System.out.print("Height : ");
                    h=input.nextDouble();
                }
                while(h<=0);
                Beam x=new Beam(w,l);
                x.setHeight(h);
                System.out.println("\nArea of rectangle    : "+x.area());
                System.out.println("Round of rectangle   : "+x.round());
                System.out.println("Surface area of beam : "+x.surfaceArea());
                System.out.println("Volume of beam       : "+x.volume());
            }
            else if(menu==2)
            {
                double r,h;
                System.out.println("\nCIRCLE AND CYLINDER\n");
                do
                {
                    System.out.print("Radius : ");
                    r=input.nextDouble();
                }
                while(r<=0);
                do
                {
                    System.out.print("Height : ");
                    h=input.nextDouble();
                }
                while(h<=0);
                Cylinder y=new Cylinder(r);
                y.setHeight(h);
                System.out.println("\nArea of circle           : "+y.area());
                System.out.println("Round of circle          : "+y.round());
                System.out.println("Surface area of cylinder : "+y.surfaceArea());
                System.out.println("Volume of cylinder       : "+y.volume());
            }
            else if(menu==0)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("\nMenu doesn't exist!");
            }
            System.out.println("");
            System.out.print("Return to menu? (Y/N) : ");
            option=input.next().charAt(0);
            System.out.println("\n============================================\n");
        }
        while(option=='Y'||option=='y');
    }
    
}
