package day12_indexOf;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        String str="Javayı Öğreneceğiz, baska yolu yok";
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.indexOf("J"));
        System.out.println(str.lastIndexOf("J"));

        int ilkIndex=str.indexOf("e");
        int sonIndex=str.lastIndexOf("e");
        if (ilkIndex==-1){
            System.out.println("hiç kullanılmamış");
        } else if (sonIndex==ilkIndex) {
            System.out.println("sadece 1 kere kullanılmış");

        }else {
            System.out.println("e harfi 2 kere veya daha fazla kullanılmış");
        }
        System.out.println(str.lastIndexOf("o"));

        System.out.println(str.lastIndexOf("o", 31));
        System.out.println(str.lastIndexOf('k'));


    }
}
