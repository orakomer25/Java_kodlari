package day10_swiitchStatements;

import java.util.Locale;

public class C04_toUpperCase_toLowerCase {
    public static void main(String[] args) {
        String str="Java Candır";
        System.out.println(str.toUpperCase());// Java Candır
        str=str.toUpperCase();//JAVA CANDIR

        System.out.println(str.toLowerCase());
        System.out.println(str.toLowerCase(Locale.ENGLISH));
        str=str.toLowerCase(Locale.ENGLISH);
        str="JAVA CANDIR";
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));


    }
}
