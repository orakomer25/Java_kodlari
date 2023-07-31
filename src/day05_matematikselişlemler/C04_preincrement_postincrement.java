package day05_matematikselişlemler;

public class C04_preincrement_postincrement {
    public static void main(String[] args) {

        // java da bir önceki class da yaptığımız gibi
        // artırma ve atama beraber olabilir.

        int a = 20;
        int b=10;
        System.out.println(b=2*a);
        System.out.println(a=b-5);

        a=10;

        // önce a nın degerini b ye atayın sonra a yı artırın
        b= a++;
        System.out.println(b);
        System.out.println(a);

        // önce a nın degerini bir artırın sonra b ye atayın
        a=10;
        b=++a;
        System.out.println("a:"+a+"b:"+b);
        /* artırma önce ise ++a
        artırma sonra ise a++
         */
        a=20;
        System.out.println(a++);//önce yazdır sonra artır demek
        System.out.println(a);

        a=20;

        System.out.println(--a);// önce azalt sonra yazdır. 19
        System.out.println(a);//19

    }
}
