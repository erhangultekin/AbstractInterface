/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru1;

/**
 *
 * @author DELL
 */
public class Circle implements Shape{
    double radius;
    
    public Circle(double radius){
        this.radius=radius;
    }
    
    @Override
    public double cevreHesapla() {
        return 2*radius*Math.PI;
    }

    @Override
    public double alanHesapla() {
         return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
   
}
