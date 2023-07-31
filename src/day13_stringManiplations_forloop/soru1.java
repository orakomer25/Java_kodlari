package day13_stringManiplations_forloop;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {

        /*
        Soru 1 : Kullanicidan bir cumle alin
- cumlede ev geciyorsa, "home home sweet home" yazdirin
- cumlede is geciyorsa, "calismak guzeldir"
- ikisini de iceriyorsa "Hem ev lazim hem is"
- hicbirini icermiyorsa "cok calisman lazim" yazdirin
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("LÜTFEN BİR CÜMLE GİRİNİZ");
        String girilencumle=scanner.nextLine();
        if (girilencumle.contains("ev")&&girilencumle.contains("is")){
            System.out.println("Hem ev lazim hem is");

        } else if (girilencumle.contains("is")) {
            System.out.println("calısmak guzeldir");

        } else if (girilencumle.contains("ev")) {
            System.out.println("home home sweet home");

        } else {
            System.out.println("cok calısman lazım");
        }
    }
}
