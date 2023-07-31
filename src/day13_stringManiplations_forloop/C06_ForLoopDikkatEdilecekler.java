package day13_stringManiplations_forloop;

public class C06_ForLoopDikkatEdilecekler {

    public static void main(String[] args) {

        for (int i = 0; i >10 ; i++) {

            System.out.println(i);

        }

        int baslangic=201;
        int bitis=237;
        int aranansayi=43;
        for (int i = baslangic; i <bitis ; i++) {
            if (i%aranansayi==0){
                System.out.println("istenen aralıkta bir deger var");
                break;

            }

        }
    }
}
