package day15_NestedForLoops_Methodolusturma;

public class C06_KendiSubStringimiz {
    public static void main(String[] args) {
        String str ="Java Candir";
        int baslangic=3;
        int bitis=7;
        if (baslangic>bitis){
            System.out.println("baslangıc degeri bitiş değerinden büyük olamaz.");
        } else if (baslangic<0||bitis<0||baslangic>=str.length()||bitis>=str.length()) {

        }else System.out.println("baş");
    }
}
