package day23_multidimensionalArrays;

public class C03_ArraydekienbüyükenkücüksayilariYazdirma {
    public static void main(String[] args) {
        /*
        verilen iki katlı int bir array deki
        en büyük ve enküçük sayiyi bulup yazdıran methodu oluşturun

         */
        int[][] arr = {{3, 6, 8}, {2, 5, 9}, {1, 3}, {12, 23, 34}};
        enbuyukenkucukYazdir(arr);

    }

    public static void enbuyukenkucukYazdir(int[][] arr) {
        int enbuyuk = arr[0][0];
        int enkucuk = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > enbuyuk) {
                    enbuyuk = arr[i][j];

                }
                if (arr[i][j] < enkucuk) {
                    enkucuk = arr[i][j];

                }

            }
        }
        System.out.println("En Buyuk Sayi : " + enbuyuk);
        System.out.println("En Küçük Sayi : " + enkucuk);
    }


}
