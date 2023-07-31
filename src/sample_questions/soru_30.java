package sample_questions;

import java.util.Arrays;

public class soru_30 {
    public static void main(String[] args) {
        /*
        Soru 30-)
Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
( mülakat sorusu )
Örnek:
String str="Javacokkolay"
Yinelenen karakterler : [a, o, k]
İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
         */
        String metin="Javacokkolay";

        String[] arr=metin.split("");
        System.out.println(Arrays.toString(arr));
        String tekrarEdenKarakterler="";

        for (int i = 0; i < arr.length ; i++) {


            if (!tekrarEdenKarakterler.contains(arr[i])&&metin.substring(i+1).contains(arr[i])){
                tekrarEdenKarakterler+=arr[i];
            }

        }
        System.out.println(tekrarEdenKarakterler);
        String[] yinelenenKarakterler=tekrarEdenKarakterler.split("");
        System.out.println(Arrays.toString(yinelenenKarakterler));


    }
}
