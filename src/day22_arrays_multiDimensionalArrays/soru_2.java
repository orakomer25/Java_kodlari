package day22_arrays_multiDimensionalArrays;

public class soru_2 {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
method yaziniz.
         */
        int[] arr = {3, -5, 7, 9};
        pozitifSayilariTopla(arr);
    }

    public static void pozitifSayilariTopla(int[] arr) {
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                toplam+=arr[i];
            }


        }
        System.out.println("POZİTİF TAMSAYILAR TOPLAMI :"+toplam);
    }
}
