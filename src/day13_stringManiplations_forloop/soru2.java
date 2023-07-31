package day13_stringManiplations_forloop;

import java.text.DecimalFormat;

public class soru2 {
    public static void main(String[] args) {
        /*
        Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
input1 : “15.30 €” , input2 : “11.40 €”
output : 26.70 €
         */
        String input1 = "15.30 €";
        String input2 = "11.40 €";
        System.out.println("input1: "+input1);
        System.out.println("input2: "+input2);

        input1 = input1.replaceAll(" €", "");
        input2 = input2.replaceAll(" €", "");

        double doubleInput1 = Double.parseDouble(input1);
        double doubleInput2 = Double.parseDouble(input2);
        double toplam = doubleInput1 + doubleInput2;
        System.out.println(toplam);


        DecimalFormat df = new DecimalFormat("0.00");
        String formatliSayi = df.format(toplam);

        System.out.println("TOPLAM: "+formatliSayi.concat(" €"));

    }
}
