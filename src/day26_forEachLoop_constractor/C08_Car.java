package day26_forEachLoop_constractor;

public class C08_Car {
    String marka="Marka belirtilmemiş";
    String model="Model belirtilmemiş";
    int yil=1900;
    int fiyat;
    String renk="Renk belirtilmemiş";


    public String toString() {
        return "Araba Bilgileri{" +
                "marka:'" + marka + '\'' +
                ", model:'" + model + '\'' +
                ", yil:" + yil +
                ", fiyat:" + fiyat +
                ", renk:'" + renk + '\'' +
                '}';
    }
}
