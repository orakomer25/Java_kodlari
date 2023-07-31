package Practice_day02;

import java.util.Scanner;

public class P05_ifStattements {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("bugün günlerden hangisi");
        String gun=scanner.next().toLowerCase();
        if (gun.equals("pazartesi")||gun.equals("salı")||gun.equals("çarşamba")||gun.equals("perşembe")||gun.equals("cuma")){
            System.out.println("hafta içi");
        } else if (gun.equals("cumartesi")||gun.equals("pazar")) {
            System.out.println("hafta sonu");

        }else{
            System.out.println("lütfen günü doğru giriniz");
        }
    }
}
