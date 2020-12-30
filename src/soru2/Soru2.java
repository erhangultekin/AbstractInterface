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
public class Soru2 {
    
    public static void main(String[] args) {
        
        Calisan calisanAli=new Calisan("Ali",5000);
        Calisan calisanVeli=new Calisan("Veli",6000);
        Calisan calisanAyse=new Calisan("Ayse",4000);
        Calisan calisanCan=new Calisan("Can",3000);
        Calisan calisanSelim=new Calisan("Selim",2000);
        Calisan calisanMurat=new Calisan("Murat",1500);
        Calisan calisanZeynep=new Calisan("Zeynep",2500);
        Calisan calisanEmre=new Calisan("Emre",3000);
        Calisan calisanAhmet=new Calisan("Ahmet",4000);
        Calisan calisanBahar=new Calisan("Bahar",2500);
        Calisan calisanSedat=new Calisan("Sedat",1500);
        Calisan calisanVedat=new Calisan("Vedat",2500);
        
        ArrayList<FirmaBilesen> arrayGenelMudurluk=new ArrayList<>();
        arrayGenelMudurluk.add(calisanAli);
        arrayGenelMudurluk.add(calisanVeli);
        Mudurlukler GenelMudurluk=new Mudurlukler("Genel Mudurluk",arrayGenelMudurluk);
        
        
        ArrayList<FirmaBilesen> arrayEgeBolgeMudurlugu=new ArrayList<>();
        arrayEgeBolgeMudurlugu.add(calisanAyse);
        arrayEgeBolgeMudurlugu.add(calisanCan);
        Mudurlukler EgeBolgeMudurluk=new Mudurlukler("Ege Bolge Mudurlugu", arrayEgeBolgeMudurlugu);
        
        
        ArrayList<FirmaBilesen> arrayIzmırIlMudurlugu=new ArrayList<>();
        arrayIzmırIlMudurlugu.add(calisanSelim);
        arrayIzmırIlMudurlugu.add(calisanMurat);
        arrayIzmırIlMudurlugu.add(calisanZeynep);
        Mudurlukler IzmırIlMudurluk=new Mudurlukler("Izmır Il Mudurlugu", arrayIzmırIlMudurlugu);
        
        
        ArrayList<FirmaBilesen> arrayAkdenizBolgeMudurlugu=new ArrayList<>();
        arrayAkdenizBolgeMudurlugu.add(calisanEmre);
        arrayAkdenizBolgeMudurlugu.add(calisanAhmet);
        Mudurlukler AkdenızBolgeMudurluk=new Mudurlukler("Akdenız Bolge Mudurlugu", arrayAkdenizBolgeMudurlugu);
        
        
        ArrayList<FirmaBilesen> arrayAntalyaIlMudurlugu=new ArrayList<>();
        arrayAntalyaIlMudurlugu.add(calisanBahar);
        arrayAntalyaIlMudurlugu.add(calisanSedat);
        arrayAntalyaIlMudurlugu.add(calisanVedat);
        Mudurlukler AntalyaIlMudurluk=new Mudurlukler("Antalya Il Mudurlugu", arrayAntalyaIlMudurlugu);
        
        
        
        
        AkdenızBolgeMudurluk.MudurlukEkle(AntalyaIlMudurluk);
        EgeBolgeMudurluk.MudurlukEkle(IzmırIlMudurluk);
        GenelMudurluk.MudurlukEkle(AkdenızBolgeMudurluk);
        GenelMudurluk.MudurlukEkle(EgeBolgeMudurluk);
        
        System.out.println("Ege Mudurluk :"+EgeBolgeMudurluk.maliyet());
        System.out.println("Akdeniz Mudurluk :"+AkdenızBolgeMudurluk.maliyet());
        System.out.println("Genel Mudurluk :"+GenelMudurluk.maliyet());
    }
    
}
