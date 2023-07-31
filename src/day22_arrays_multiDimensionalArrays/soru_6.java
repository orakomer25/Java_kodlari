package day22_arrays_multiDimensionalArrays;

public class soru_6 {
    public static void main(String[] args) {
        /*
        Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
olusturun
         */
        String[] isimler={"Ahmet","Mehmet","Öznur","Bahar Sena"};
        enKisaVeUzunIsimleriBul(isimler);
    }

    public static void enKisaVeUzunIsimleriBul(String[] isimler) {
        String enKisa=isimler[0];
        String enUzun=isimler[0];
        for (int i = 0; i < isimler.length ; i++) {
            if (isimler[i].length()>enUzun.length()){
                enUzun=isimler[i];
            } else if (isimler[i].length()<enKisa.length()) {

                enKisa=isimler[i];
            }

        }
        System.out.println("En Uzun İsim :"+enUzun);
        System.out.println("En Kısa İsim :"+enKisa);
    }
}
