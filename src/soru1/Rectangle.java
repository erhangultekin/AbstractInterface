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
public class Rectangle implements Shape{
    double height;
    double width;

    public Rectangle(double height,double width){
        this.width=width;
        this.height=height;
    }    
    
    @Override
    public double cevreHesapla() {
        return 2*(height+width);
    }

    @Override
    public double alanHesapla() {
       return height*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "height=" + height + ", width=" + width + '}';
    }
    
 
}
