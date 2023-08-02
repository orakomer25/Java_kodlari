package day29_passByValue;

public class C01_staticBlocks {
    C01_staticBlocks() {
        System.out.println("parametresiz constructor çalıştı.");
    }

    public static void main(String[] args) {
        System.out.println("main method çalıştı.");
        C01_staticBlocks obj = new C01_staticBlocks();
        System.out.println("obje oluşturuldu.");
    }

    static {
        System.out.println("static blok 1 çalıştı.");
    }

    static {
        System.out.println("static blok 2 çalıştı");
    }
    {
        System.out.println("static olmayan blok çalıştı.");
        //sadece obje oluşturulduğunda çalışır.
    }
}
