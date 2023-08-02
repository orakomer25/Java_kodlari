package sample_questions;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class soru_33 {
    public static void main(String[] args) {


    /*
    Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın
     (boşluklar ve özel karakterler dahil).
    Örnek:
    String str=''Kodlama harika.''
    String arr[]: ".etaerg si gnidoC"
    İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın

     */
        String str = "Kodlama harika.";
        String[] strArr = new String[str.length()];
        strArr = str.split("");
        System.out.println(Arrays.toString(strArr));
        String[] tersStr = new String[strArr.length];
        String tersMetin = "";
        int sayac = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr[sayac] = strArr[i];
            tersMetin += strArr[i];
            sayac++;
        }
        System.out.println(Arrays.toString(tersStr));
        System.out.println("String arr[] : " + "\"" + tersMetin + "\"");
    }
}
