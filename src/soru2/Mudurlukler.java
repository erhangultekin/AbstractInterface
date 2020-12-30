/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru2;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Mudurlukler extends FirmaBilesen{
    String mudurlukAdı;
    ArrayList<FirmaBilesen> arrayList;
    
    public Mudurlukler(String mudurlukAdı,ArrayList<FirmaBilesen> arrayList){
        this.mudurlukAdı=mudurlukAdı;
        this.arrayList=arrayList;
    }
    
    public void MudurlukEkle(Mudurlukler mudurluk){
        this.arrayList.addAll(mudurluk.arrayList);
    }
    
    @Override
    int maliyet() {
        int toplamMaliyet=0;
        for(int i=0;i<this.arrayList.size();i++){
            toplamMaliyet+=this.arrayList.get(i).maliyet();
        }
        return toplamMaliyet;
    }
    
}
