package day33_encapsulation_inheritance;

public class C08_Okul {
    private String ogrenci = "ömer orak";
    private int sinav1 = 100;
    private int sinav2 = 80;
    private double ortalama =0;

    public int setSinav1(String ogrenciAdi, int yeniNot) {
        this.ogrenci = ogrenciAdi;
        this.sinav1 = yeniNot;
        return sinav1;
    }

    public int setSinav2(String ogrenciAdi, int yeniNot) {
        this.ogrenci = ogrenciAdi;
        this.sinav2 = yeniNot;
        return sinav2;
    }

    public void getOrtalama() {
       this.ortalama=(double)(sinav1+sinav2)/2;
        System.out.println("Öğrenci Adı : " + this.ogrenci);
        System.out.println("Ortalama    : " + this.ortalama);
    }


}
