package day12_indexOf;

public class ornek1 {
    public static void main(String[] args) {
        String str = "Ali topu at, topu at ali";
        // ilk top metin parcasinin index'ini yazdirin

        System.out.println(str.indexOf("top"));

        System.out.println(str.indexOf("top")); // 4
        // ikinci top metin parcasinin index'ini yazdirin
        int ilkindex=str.indexOf("top");
        System.out.println(str.indexOf("top",ilkindex+1));
        // at kelimesinin 2 kere kullanilip kullanilmadigini metne bakmadan bulun

        int ilkAT=str.indexOf("at");
        int ikinciAT=str.indexOf("at",ilkAT+1);
        if (ilkAT==-1){
            System.out.println("at kelimesi hiç kullanılmamış");
        } else if (ilkAT>0&&ikinciAT==-1) {
            System.out.println("at bir kere kullanılmış");



        } else {
            System.out.println("at kelimesi en az 2 kere kullanılmış");


        }

    }
}
