package day12_indexOf;

public class C01_indexOf {
    public static void main(String[] args) {
        String str ="Ali topu at, topu at ali";

        System.out.println(str.indexOf("top"));//4
        System.out.println(str.indexOf("top",5));
        System.out.println(str.indexOf("top",str.indexOf("top")+1));

        int ilkindex=str.indexOf("at");
        System.out.println(ilkindex);
        if (ilkindex==-1){
            System.out.println("hiç kullanılmamış");

        }else {
            int ikinciindex=str.indexOf("at",ilkindex+1);
            if (ikinciindex==-1){
                System.out.println("sadece 1 kere kullanılmış");
            }else{
                System.out.println("en az 2 kere kullanılmış");



            }
        }

    }
}
