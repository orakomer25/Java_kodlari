package day15_NestedForLoops_Methodolusturma;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        int satir=5;
        int sutun=7;
        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {

                System.out.print(i+","+j+"  ");

            }
            System.out.println();
        }
    }
}
