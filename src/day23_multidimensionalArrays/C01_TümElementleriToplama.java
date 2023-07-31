package day23_multidimensionalArrays;

public class C01_TümElementleriToplama {
    public static void main(String[] args) {
        int[] arrTek={3,7,1,9};
        // bu arrayın tüm elementlerini toplayın
        int toplam =0;
        for (int i = 0; i <arrTek.length ; i++) {
            toplam+=arrTek[i];
        }
        System.out.println("arrTek'in Elementleri Toplamı: "+toplam);
        int toplam2=0;
        int[][] sayilar={{1,2,5},{7,4},{9},{3,0,1}};
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
               toplam2+= sayilar[i][j];
            }
        }
        System.out.println("sayilar Array'in elementleri toplami: "+toplam2);
    }
}
