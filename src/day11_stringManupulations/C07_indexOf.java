package day11_stringManupulations;

public class C07_indexOf {
    public static void main(String[] args) {
        String str="Ali topu at,at ali at";
        System.out.println(str.indexOf("Ali"));
        System.out.println(str.indexOf("at"));
        System.out.println(str.indexOf('a'));

        System.out.println(str.indexOf("a", 10
        ));
        System.out.println(str.indexOf("yusuf"));
        // -1 görürsek yok oldugunu anlayalım

    }
}
