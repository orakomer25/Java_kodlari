package day36_Inharitance;

public
class HRunner {
    public static void main(String[] args) {
        GavciKuslar avciKusKartal=new GavciKuslar();
        avciKusKartal.hareket();//G uçarlar
        avciKusKartal.beslenme();//G et yer
        avciKusKartal.pence();// G pencelidir
        avciKusKartal.gaga();//G sivri gagalidir
        avciKusKartal.kanat();//F kanatlidir
        avciKusKartal.solunum();//F Akciğer
        avciKusKartal.cogalma();//F Yumurtayla
        avciKusKartal.omur();// E yasar ve olurler


        Fkuslar KusKartal=new GavciKuslar();
        // constructor ve data turu aynı değil ise
        //aramaya data turu olan classstan başlanır vr bulunamazsa CTE veri
        //bulunursa bulunan class tan constructor ın olduğu class a kadar
        //bu özelliğin daha günceli var mı diye kontrol edilir
        //ve varsa en güncel hali yazılır
        KusKartal.hareket();//G uçarlar
        KusKartal.beslenme();//G et yer
        //KusKartal.pence();// F veya E da yok CTE
        KusKartal.gaga();//G sivri gagalidir
        KusKartal.kanat();//F kanatlidir
        KusKartal.solunum();//F Akciğer
        KusKartal.cogalma();//F Yumurtayla
        KusKartal.omur();// E yasar ve olurler

        Ehayvanlar hayvanKartal=new GavciKuslar();

        hayvanKartal.hareket();//G uçarlar
        hayvanKartal.beslenme();//G et yer
        //hayvanKartal.pence();// E de olmadığı için CTE
        //hayvanKartal.gaga();// E de olmadığı için CTE
        //hayvanKartal.kanat();// E de olmadığı için CTE
        hayvanKartal.solunum();//F Akciğer
        hayvanKartal.cogalma();//F Yumurtayla
        hayvanKartal.omur();// E yasar ve olurler



    }
}
