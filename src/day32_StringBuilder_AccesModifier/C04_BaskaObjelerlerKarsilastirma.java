package day32_StringBuilder_AccesModifier;

public class C04_BaskaObjelerlerKarsilastirma {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        System.out.println(sb1==sb2);//false
        System.out.println(sb1.equals(sb2));//false

        //SB da equals methodu yerine CompareTo() kullanılır.
        System.out.println(sb1.compareTo(sb2));//0
        // asci tablosundaki değerlere göre karşılaştırma yapar.
       // System.out.println(sb1 == str); //karşılaştırma yapmaz.
        System.out.println(sb1.equals(sb2));// itiraz etmez ama false döner.
        // equals sadece objenin kendisi ile karşılaştırıldığında True döner.



    }
}
