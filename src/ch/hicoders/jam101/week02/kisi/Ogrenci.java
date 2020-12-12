package ch.hicoders.jam101.week02.kisi;

public class Ogrenci {
    public String name;
    public static int number = 0;
    public static double matematik;
    public static double almanca;

    public Ogrenci(String pName) {
        this.name = pName;
        if (pName == null) name = "Ogrenci " + number++;
        matematik = (double) Math.floor(Math.random() * 6);
        almanca = (double) Math.floor(Math.random() * 6);
    }
}