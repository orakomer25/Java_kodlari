package day15_NestedForLoops_Methodolusturma;

public class carpimTablosu {
    public static void main(String[] args) {
        /*SORU: Nested for loop kullanarak 1-9 a kadar bir
        Çarpım tablosu yapalım.
        not sütun ve satırlar aynı hizada olsun.
        örnek:
        1*1=1  2*1=2  3*1=3  4*1=4
        1*2=2  2*2=4  3*3=9  4*2=8
        1*3=3  2*3=6  3*4=12 4*3=12


         */
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <10 ; j++) {
                int sonuc=i*j;
                if (sonuc%100<10){
                    System.out.print(j+"*"+i+"="+(i*j)+"   ");
                }else  System.out.print(j+"*"+i+"="+(i*j)+"  ");


            }
            System.out.println();
        }
    }
}
