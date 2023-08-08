package sample_questions;

import java.util.Scanner;

public class Student {
    String ogrenciAdi="default";
    String ogrenciSoyAdi="default";
    int ogrenciYasi;
    String okul="default";
    String cinsiyet="default";


    public String toString() {
        return
                "ÖgrenciAdi    =" + ogrenciAdi + "\n" +
                "ÖgrenciSoyAdi =" + ogrenciSoyAdi + "\n" +
                "ÖgrenciYasi   =" + ogrenciYasi +"\n"+
                "Okulu         =" + okul + "\n" +
                "Cinsiyet      =" + cinsiyet;
    }

    public Student(String ogrenciAdi, String ogrenciSoyAdi, int ogrenciYasi, String okul, String cinsiyet) {
        this.ogrenciAdi = ogrenciAdi;
        this.ogrenciSoyAdi = ogrenciSoyAdi;
        this.ogrenciYasi = ogrenciYasi;
        this.okul = okul;
        this.cinsiyet = cinsiyet;

    }
    public Student(){

    }

}
