/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru2;

/**
 *
 * @author DELL
 */
public class Calisan extends FirmaBilesen{
    String adSoyad;
    int maas;
    
    public Calisan(String adSoyad,int maas){
        this.adSoyad=adSoyad;
        this.maas=maas;
    }
    
    @Override
    int maliyet() {
        return maas;
    }
    
}
