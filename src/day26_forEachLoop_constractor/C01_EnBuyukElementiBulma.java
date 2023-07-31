package day26_forEachLoop_constractor;

public class C01_EnBuyukElementiBulma {
    public static void main(String[] args) {
        int[] arr={0,10,2,5,6,98,54,63,35,24,65};
        int enBuyukElement=arr[0];
        for (int w:arr) {
            if (w>enBuyukElement){
                enBuyukElement=w;
            }

        }
        System.out.println("Array deki En Büyük Element: "+enBuyukElement);

        }
    }

