package sample_questions;

public class soru_38IkinciCozum {
    public static void main(String[] args) {
    /*
        Soru-38)
        Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve
        verilen bu (Arrayden) diziden minimum ve maksimum sayıları yazdıran bir yöntem yazın
Örnek:
Input : {3,2,5,4,1,6}
Output :
min: 1
max: 6
Ipucu: sort yöntemni kullanabilirsiniz.
         */
        int [] arr ={3,2,5,96,87,96,35,44,12,36};
        maxveMinimumDegerYazdır(arr);


    }

    public static void maxveMinimumDegerYazdır(int[] arr) {
        int minimumDeger =arr[0];
        int maxDeger =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxDeger){
                maxDeger=arr[i];
            }
            if (arr[i]<minimumDeger){
                minimumDeger=arr[i];
            }

        }
        System.out.println("Minimum değer : "+minimumDeger);
        System.out.println("Maximum değer : "+maxDeger);
    }
}
