package day26_forEachLoop_constractor;

public class C02_HarfKullanimAdedi {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin,
         harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
         kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
         */
        String cumle = "Java her gecen gün daha zevkli geliyor.";
        String harf="e";
        String[] cumleArr=cumle.split("");
        int sayac=0;
        for (String each:cumleArr
             ) {
            if (each.equals(harf)){
                sayac++;
            }

        }
        if (sayac==0){
            System.out.println("Aradığınız harf cümlede hiç Kullanılmamılır.");
        }else
        System.out.println("Aradığınız harf cümlede "+sayac+" kere kullanılmıştır.");


    }
}
