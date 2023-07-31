package day23_multidimensionalArrays;

public class soru_5 {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
toplaminini yazdiran bir method olusturun.

         */
        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        sonElementleriToplami(arr);
    }

    public static void sonElementleriToplami(int[][] arr) {
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (j==arr[i].length-1){
                    toplam +=arr[i][j];


                }

            }

        }
        System.out.println("Son Elementlerin Toplamı : "+toplam);
    }
}
