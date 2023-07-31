package day13_stringManiplations_forloop;

public class C04_replaceFirst {
    public static void main(String[] args) {

        String str="Java Candir, kendisini çok seviyoruz123.";

        System.out.println(str.replaceFirst("a","A"));
        System.out.println(str.replaceFirst(" ","  "));
        System.out.println(str.replaceFirst("\\d", " "));
        System.out.println(str.replaceFirst("\\W","*"));


    }
}
