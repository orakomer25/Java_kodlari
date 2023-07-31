package day07_ifStatements;

public class C02_BagımsızIfCumleleri {
    public static void main(String[] args) {

        int a= 20;
        int b= 30;

        if (a<b){

            System.out.println("a b' den küçük 1");
            System.out.println("a b' den küçük 2");
            System.out.println("a b' den küçük 3");

        }
        if (a%2==0) {
            System.out.println("a 2 ile tam bolunuyor 1");
            System.out.println("a 2 ile tam bolunuyor 2");
            System.out.println("a 2 ile tam bolunuyor 3");
        }
    }
}
