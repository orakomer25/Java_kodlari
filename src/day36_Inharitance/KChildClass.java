package day36_Inharitance;

public class KChildClass extends JParentClass {
    public void method1(){
        System.out.println("child class method1");
    }

    @Override
    public void method2() {
        super.method2();
    }

    /*
    override notasyonu overridden method ile
    overridding method u birbirinw bağlar
    eğer overridden silinirse CTE verir
    kullnmak zorunda değiliz ama iki  method u bağımlı yapmak istityorsak
    kullanılabilir.

    overridding method varken
    overrridden method calışmaz


    EGER her iki methodu çalıştırmak istersek
    child class taki overridding method a
    super.method2(); ekleyebiliriz
     */
}
