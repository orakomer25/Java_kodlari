package day04_datacasting;

public class C05_WrapperClasses {

    public static void main(String[] args) {

        String str ="Java Candir";
        System.out.println(str.charAt(3));
        int sayi=20;
        /*
        java primitive data türleri için hazır method oluşturamaz.
        ANCAK
        primitive data türleri için hazır methodlar kullanabilecek
        Wrapper class lar oluşturmuştur.
        int == Integer gibi

         */
        int sayi2 = 5;
        Integer sayi3=sayi2;
        int sayi4=sayi3;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // içinde sadece sayısal ifadeler bulunan bir String verildiğinde
        // matematiksel işlem yapmamız gerekirse
        String str1="22";
        String str2="33";
        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));

        char ch1='7';
        System.out.println(Character.isDigit(ch1));
        System.out.println(Character.isLetter(ch1));
        System.out.println(Character.isWhitespace(ch1));


    }
}
