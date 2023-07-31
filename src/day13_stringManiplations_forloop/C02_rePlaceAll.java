package day13_stringManiplations_forloop;

public class C02_rePlaceAll {
    public static void main(String[] args) {

        String str = "1Ja4va 8C9a2n5d1i1r";
        str=str.replaceAll("1","");
        System.out.println(str);
        // sayıların tamamından kurtulmak istersek
        //replace() methodu yeterli olmaz.
        // java da sayilar , özel karakterler, alfabetik karakterlere
        // tümüyle işlem yapmak istersel replaceAll(istenenGrup,
        str=str.replaceAll("\\d","");
        System.out.println(str);
    }
}
