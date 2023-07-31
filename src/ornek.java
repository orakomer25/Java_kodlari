import java.util.Scanner;

public class ornek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen ay numarasi girin :");
        int ayNumarasi = scanner.nextInt();
        System.out.print("Lutfen yil girin :");
        int yil = scanner.nextInt();
        switch (ayNumarasi) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Gun sayisi 31 ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Gun sayisi 30 ");
                break;

            case 2: {
                if ((yil % 4 == 0) && (yil % 100 != 0) || (yil % 100 == 0 && yil % 400 == 0)) {
                    System.out.println(yil + " yili artik yildir." + " Subat " + yil + " yilinda 29 gun vardir.");
                } else {
                    System.out.println(yil + " yili subat ayinda 28 gun vardir.");
                }
            }
        }
    }
}