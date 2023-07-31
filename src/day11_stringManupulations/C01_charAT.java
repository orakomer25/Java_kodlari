package day11_stringManupulations;

public class C01_charAT {
    public static void main(String[] args) {
        String str ="Java Candır";
        System.out.println(str.charAt(0));//J
        System.out.println(str.charAt(6));//a

        System.out.println(str.charAt(10));
        System.out.println(str.charAt(11-3));

        //eger sondan başa doğru gelecek şekilde bir
        // char isteniyorsa charAt(uzunluk-sondanKacıncıKarakter)
        System.out.println(str.charAt(9));
        System.out.println(str.toUpperCase().charAt(3));

  }
}
