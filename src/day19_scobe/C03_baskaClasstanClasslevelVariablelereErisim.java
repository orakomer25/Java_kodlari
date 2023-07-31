package day19_scobe;

public class C03_baskaClasstanClasslevelVariablelereErisim {
    public static void main(String[] args) {
        System.out.println(C02_classLevelVariables.bls);
        System.out.println(C02_classLevelVariables.strs);
        System.out.println(C02_classLevelVariables.sayis);
        System.out.println(C02_classLevelVariables.chrs);

        C02_classLevelVariables obj= new C02_classLevelVariables();
        System.out.println(obj.bli);
        System.out.println(obj.stri);
        System.out.println(obj.sayii);
        System.out.println(obj.chri);
    }
}
