package day23_multidimensionalArrays;

public class soru_1 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
method olusturun.
         */
        int[][] sayilar={{1,4,8},{6,8,4},{5,7,6},{10,12,8},{4,8}};
        ciftSayilariToplaYazdir(sayilar);
    }

    public static void ciftSayilariToplaYazdir(int[][] sayilar) {
        int toplam=0;
        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                if (sayilar[i][j]%2==0){
                    toplam +=sayilar[i][j];
                }

            }
        }
        System.out.println("Çift Sayilarin Toplami: "+toplam);
    }
}
