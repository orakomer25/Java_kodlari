package day26_forEachLoop_constractor;

import com.sun.tools.javac.Main;

public class C09_Carrunner {
    public static void main(String[] args) {
        C08_Car car1 = new C08_Car();
        System.out.println(car1.marka);
        System.out.println(car1.model);
        System.out.println(car1);
        car1.marka = "toyota";
        car1.model = "corolla";
        car1.yil = 2011;
        car1.fiyat = 7000;
        car1.renk = "Kırmızı";
        System.out.println(car1);

        C08_Car car2 = new C08_Car();
        System.out.println(car2);
        car2.marka = "honda";
        car2.renk = "mavi";
        car2.fiyat = 8000;
        System.out.println(car2);

        C08_Car car3 = new C08_Car();
        System.out.println(car3);


    }
}
