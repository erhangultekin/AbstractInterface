/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author DELL
 */
public class Soru1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Shape> shapes=new ArrayList<>(5);
        BufferedReader br = new BufferedReader(new FileReader("girdi.txt"));
        
        String line;
                
        while ((line = br.readLine()) != null){
            String[] txtarray = line.split(" ");
          
            
            if (txtarray[0].equals("Circle")){
                Circle circle=new Circle(Double.parseDouble(txtarray[1]));
                shapes.add(circle);             
            }
            else if(txtarray[0].equals("Rectangle")){
                Rectangle rectangle=new Rectangle(Double.parseDouble(txtarray[1]),Double.parseDouble(txtarray[2]));   
                shapes.add(rectangle);
            }
            else if(txtarray[0].equals("DikUcgen")){
                DikUcgen dikUcgen=new DikUcgen(Double.parseDouble(txtarray[1]),Double.parseDouble(txtarray[2]));
                shapes.add(dikUcgen);
                
            }
        }
        
        
        
        for(Shape s :shapes){
           if(s instanceof DikUcgen){
               DikUcgen dikUcgen=(DikUcgen)s;
               dikUcgen.tangetValues();
           }
           System.out.println("Bilgi :"+s.toString());
           System.out.println("Alan  :"+s.alanHesapla());
           System.out.println("Cevre :"+s.cevreHesapla());
           System.out.println("-----------------------");
        }
        
        
        
        
    }
    
}
