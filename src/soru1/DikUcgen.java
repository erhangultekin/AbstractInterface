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
public class DikUcgen implements Shape{
    double a;
    double b;
    double c;
    
    public DikUcgen(double a,double b) {
        this.a=a;
        this.b=b;
        c=Math.sqrt((a*a)+(b*b));
    }

    @Override
    public double cevreHesapla() {
        return a+b+c;
    }

    @Override
    public double alanHesapla() {
        return (a*b)/2;
    }
    public void tangetValues(){
        System.out.println("1. Acı degeri :"+a/b+" 2. Acı degeri :"+b/a);
    }

    @Override
    public String toString() {
        return "DikUcgen{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
}
