package day10_swiitchStatements;

public class C05_equals {
    public static void main(String[] args) {
        String str1="Mehmet";
        String str2="MEHMET";
        String str3="mehmet";
        String str4="MEHmet";
        System.out.println(str1==str2);
        System.out.println(str3==str4.toLowerCase());
        System.out.println(str2==str3.toUpperCase());

        System.out.println(str1.equals(str2));
        System.out.println(str1.toUpperCase().equals(str2));

        System.out.println(str1.equalsIgnoreCase(str4));
        System.out.println(str3.equalsIgnoreCase(str4));


    }

}
