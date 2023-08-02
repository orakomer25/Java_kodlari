package day29_passByValue;

public class C03_passByValue {
    public static void main(String[] args) {
        int sayi= 10;
        /*
        verilen sayiyi aşağıdaki kriterlere göre değiştiren bir method oluşturun
        eğer sayi çift ise 2 katına çıkarın
         eğer sayi tek ise 5 ekleyin.
         */
        System.out.println("method call dan önce sayı : "+sayi);
        sayi=sayiyiDegistir(sayi);
        System.out.println("method call dan sonra sayi : "+sayi);
    }
    public static int sayiyiDegistir(int sayi){
        if (sayi%2==0){
            return 2*sayi;

        }else {
            return 5+sayi;
        }

    }

}
