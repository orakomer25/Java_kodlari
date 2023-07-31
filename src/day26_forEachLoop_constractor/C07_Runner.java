package day26_forEachLoop_constractor;

public class C07_Runner {
    public static void main(String[] args) {
        C04 obj;
        // deklarasyon vardır. ete kemiğe bürünmüş bir obje yoktur
        new C04();
        // obje var ama sonraki satırlarda kullanmak mümkün değil
        // atama yok

        System.out.println(new C04().sayi);
        C04 obj2 = new C04();
    }

}
