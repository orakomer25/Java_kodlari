package sample_questions;

public class Soru_41 {
    public static void main(String[] args) {
        /*
        Soru 41-)
Parametre olarak birden fazla tamsayı (integer) kabul eden ve bu integer sayıların toplamını yazdıran bir dönüş methodu (void) yazın
Method name=sum
eğer metodu bu şekilde çağırırsanız

     toplam(1,2,3) çıktı =6
	 toplam(1,2,3,4,5) çıktı =15
	 sum(1,2) output=3
Ipucu:  varargs sorusu, varargs olusturalım
         */
        tamsayilariTopla(1,2,3,5,6,9,7,8,20,54,65,98);
    }
    public static void tamsayilariTopla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        System.out.println(toplam);
    }
}
