package ch.hicoders.jam101.week02;

import  ch.hicoders.jam101.week02.kisi.*;
import java.util.ArrayList;

public class Okul {
    static ArrayList<Object>okul = new ArrayList<Object>();
    static ArrayList<Object>matematiktenGecenler = new ArrayList<Object>();
    static ArrayList<Object>matematiktenKalanlar = new ArrayList<Object>();
    static ArrayList<Object>almancadanGecenler = new ArrayList<Object>();
    static ArrayList<Object>almancadanKalanlar = new ArrayList<Object>();
    static ArrayList<Double> matematikDizi = new ArrayList<Double>();
    static ArrayList<Double> almancaDizi = new ArrayList<Double>();
    static double matematikToplam;
    static double almancaToplam;

    public static void main(String[] args) {
        for (int i = 1; i < Math.floor(Math.random() * 50); i++) {
            ArrayList<Object>person = new ArrayList<Object>();
            Ogrenci ogrenci = new Ogrenci("Ogrenci " + i);
            String name = ogrenci.name;
            double matematik = Ogrenci.matematik;
            double almanca = Ogrenci.almanca;
            person.add(name);
            person.add(matematik);
            person.add(almanca);
            okul.add(person);
            double matematikNotu = Ogrenci.matematik;
            double almancaNotu = Ogrenci.almanca;
            matematikDizi.add(matematikNotu);
            almancaDizi.add(almancaNotu);
            matematikToplam = (matematikToplam + Ogrenci.matematik);
            almancaToplam = (almancaToplam + Ogrenci.almanca);
        }

        double ortalamaMatematik = matematikToplam / matematikDizi.toArray().length;
        double ortalamaAlmanca = almancaToplam / almancaDizi.toArray().length;

        for (int i = 0; i < okul.toArray().length; i++) {
            ArrayList array = (ArrayList) okul.get(i);
            if ((double) array.get(1) >= ortalamaMatematik){
                matematiktenGecenler.add(array.get(0));
            } else{
                matematiktenKalanlar.add(array.get(0));
            }
            if ((double) array.get(2) >= ortalamaAlmanca){
                almancadanGecenler.add(array.get(0));
            } else{
                almancadanKalanlar.add(array.get(0));
            }
            System.out.println(array);
        }

        System.out.println("Okulumuz " + okul);
        System.out.println("Matematik Ortalama " + ortalamaMatematik);
        System.out.println("Almanca Ortalama " + ortalamaAlmanca);
        System.out.println("matematiktenGecenler " + matematiktenGecenler);
        System.out.println("matematiktenKalanlar " + matematiktenKalanlar);
        System.out.println("almancadanGecenler " + almancadanGecenler);
        System.out.println("almancadanKalanlar " + almancadanKalanlar);
    }
}
