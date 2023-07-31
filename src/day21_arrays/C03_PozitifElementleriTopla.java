package day21_arrays;

public class C03_PozitifElementleriTopla {
    public static void main(String[] args) {
        /*
        Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
method yaziniz
         */
        int[] arr={-4,5,2,0,3};
        System.out.println(pozitifTamsayilariTopla(arr));

    }
    public static int pozitifTamsayilariTopla(int[] arr){
        int toplam =0;
        for (int i = 0; i <arr.length ; i++) {
            if (i>0){
                toplam+=i;
            }

        }
        return toplam;
    }
}
