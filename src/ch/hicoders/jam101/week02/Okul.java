package ch.hicoders.jam101.week02;

import  ch.hicoders.jam101.week02.kisi.*;
import java.util.ArrayList;

public class Okul {
    static ArrayList<Object>okul = new ArrayList<>();
    static ArrayList<Object>matematiktenGecenler = new ArrayList<>();
    static ArrayList<Object>matematiktenKalanlar = new ArrayList<>();
    static ArrayList<Object>almancadanGecenler = new ArrayList<>();
    static ArrayList<Object>almancadanKalanlar = new ArrayList<>();
    static ArrayList<Double> matematikDizi = new ArrayList<>();
    static ArrayList<Double> almancaDizi = new ArrayList<>();
    static ArrayList<Object> maxMatematik = new ArrayList<>();
    static ArrayList<Object> minMatematik = new ArrayList<>();
    static ArrayList<Object> maxAlmanca = new ArrayList<>();
    static ArrayList<Object> minAlmanca = new ArrayList<>();
    static double matematikToplam;
    static double almancaToplam;
    static double maxMatematikValue;
    static double minMatematikValue;
    static double maxAlmancaValue;
    static double minAlmancaValue;

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

        for(int i=0; i < matematikDizi.toArray().length;i++){
            maxMatematikValue = matematikDizi.get(0);
            if(matematikDizi.get(i) > maxMatematikValue){
                maxMatematikValue = matematikDizi.get(i);
            }
        }

        for(int i=0; i < matematikDizi.toArray().length;i++){
            minMatematikValue = matematikDizi.get(0);
            if(matematikDizi.get(i) < minMatematikValue){
                minMatematikValue = matematikDizi.get(i);
            }
        }

        for(int i=0; i < almancaDizi.toArray().length;i++){
            maxAlmancaValue = almancaDizi.get(0);
            if(almancaDizi.get(i) > maxAlmancaValue){
                maxAlmancaValue = almancaDizi.get(i);
            }
        }

        for(int i=0; i < almancaDizi.toArray().length;i++){
            minAlmancaValue = almancaDizi.get(0);
            if(almancaDizi.get(i) < minAlmancaValue){
                minAlmancaValue = almancaDizi.get(i);
            }
        }

        for (int i = 0; i < okul.toArray().length; i++) {
            ArrayList array = (ArrayList) okul.get(i);
            if ((double) array.get(1) == maxMatematikValue){
                maxMatematik.add(array.get(0));
            }
            if ((double) array.get(2) >= maxAlmancaValue){
                maxAlmanca.add(array.get(0));
            }
        }

        for (int i = 0; i < okul.toArray().length; i++) {
            ArrayList array = (ArrayList) okul.get(i);
            if ((double) array.get(1) == minMatematikValue){
                minMatematik.add(array.get(0));
            }
            if ((double) array.get(2) >= minAlmancaValue){
                minAlmanca.add(array.get(0));
            }
        }

        System.out.println("Okulumuz " + okul);
        System.out.println("Matematik Ortalama " + ortalamaMatematik);
        System.out.println("Almanca Ortalama " + ortalamaAlmanca);
        System.out.println("matematiktenGecenler " + matematiktenGecenler);
        System.out.println("matematiktenKalanlar " + matematiktenKalanlar);
        System.out.println("almancadanGecenler " + almancadanGecenler);
        System.out.println("almancadanKalanlar " + almancadanKalanlar);
        System.out.println("maxMatematik " + maxMatematik);
        System.out.println("minMatematik " + minMatematik);
        System.out.println("maxAlmanca " + maxAlmanca);
        System.out.println("minAlmanca " + minAlmanca);
    }
}
