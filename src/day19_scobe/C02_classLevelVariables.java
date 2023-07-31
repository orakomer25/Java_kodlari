package day19_scobe;

public class C02_classLevelVariables {
    static boolean bls;
    boolean bli;
    static String strs="java";
    String stri;
    static int sayis;
    int sayii=23;
    static  char chrs='a';
    char chri;

    public static void main(String[] args) {
        System.out.println(bls);
        System.out.println(strs);
        System.out.println(sayis);
        System.out.println(chrs);

        C02_classLevelVariables obj=new C02_classLevelVariables();


        System.out.println(obj.bli);
        System.out.println(obj.stri);
        System.out.println(obj.sayii);
        System.out.println(obj.chri);

    }
}
