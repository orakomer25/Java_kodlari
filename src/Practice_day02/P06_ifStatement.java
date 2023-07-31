package Practice_day02;

import java.util.Scanner;

public class P06_ifStatement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("lütfen adınızı giriniz");
        String name=scanner.nextLine();
        System.out.println("lütfen soyadınızı giriniz");
        String surname=scanner.nextLine();
        System.out.println("vize1:");
        double vize1=scanner.nextDouble();
        System.out.println("vize:");
        double vize2=scanner.nextDouble();
        System.out.println("final:");
        double finalnotu=scanner.nextDouble();
        double yılsonu=(((vize1+vize2)/2)*40/100+finalnotu*60/100);
        System.out.println(yılsonu);
        if (yılsonu>=50){
            System.out.println("geçtiniz tebrikler");
        }
        if (yılsonu<50){
            System.out.println("malesef kaldınız");
        }
    }
}
