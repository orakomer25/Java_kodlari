package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_KullanıcıdanDegerAlarakListOlusturma {
    public static void main(String[] args) {
        System.out.println(ListOlustur());

    }
    public static  List<String> ListOlustur(){
        Scanner scanner=new Scanner(System.in);
       List<String> isimList=new ArrayList<>();
        String girilenIsim;
        do {
            scanner=new Scanner(System.in);
            System.out.println("listeye eklemek için isim giriniz.\nBitirmek için Q ya basınız.");
            girilenIsim= scanner.nextLine();
            if (!girilenIsim.equalsIgnoreCase("q")){
                isimList.add(girilenIsim);
            }

        }while(!girilenIsim.equalsIgnoreCase("q"));
        return  isimList;
    }
}
