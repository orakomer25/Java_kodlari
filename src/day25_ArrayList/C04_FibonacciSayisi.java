package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_FibonacciSayisi {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen pozitif bir n tamsayisini alarak,
        bize ilk n tane tane Fibonacci sayisini bir list olarak donduren bir method olusturun.
         Fibonacci serisi: 0 1 1 2 3 5 8 13 21 34 55 89 144 233
         */
        int fibonacciSayiAdedi=1
                ;
        System.out.println(fibonacciOlustur(fibonacciSayiAdedi));

    }

    public static List<Integer> fibonacciOlustur(int fibonacciSayiAdedi) {
        List<Integer> fibonacci = new ArrayList<>();
       if (fibonacciSayiAdedi==0){
           System.out.println("lütfen gıcıklık yapmayınız");
           fibonacci.add(0);
           return fibonacci;
       } else if (fibonacciSayiAdedi==1) {
           fibonacci.add(0);
           fibonacci.add(1);

           return fibonacci;
       }else {
           fibonacci.add(0);
           fibonacci.add(1);

        for (int i = 0; i < fibonacciSayiAdedi - 2; i++) {

                fibonacci.add(fibonacci.get(i) + fibonacci.get(i + 1));

            }

       }

        return fibonacci;
    }

}
