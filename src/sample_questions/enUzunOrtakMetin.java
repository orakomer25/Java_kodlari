package sample_questions;

public class enUzunOrtakMetin {
    /*
    İki dize verildiğinde, en uzun ortak alt sırayı bulan bir yöntem yazın.
    örnek
    String dize1="ama kine eviyorum seni seviyorum ben ";
     String dize2="ben seni çok seviyorum be";
     çıktı :  seviyorum be
     */
    public static void main(String[] args) {
        String dize1 = "ama kine eviyorum seni seviyorum ben ";
        String dize2 = "ben seni çok seviyorum be";
        System.out.println(enUzunMetin(dize1, dize2));

    }

    public static String enUzunMetin(String dize1, String dize2) {

        String ortakMetin = "";
        String metin = "";
        for (int i = 0; i <= dize1.length(); i++) {
            for (int j = 0; j <= dize1.length(); j++) {
                if (i + j <= dize1.length()) {
                    if (dize2.contains(dize1.substring(i, i + j))) {
                        metin = dize1.substring(i, i + j);
                        if (metin.length() > ortakMetin.length()) {
                            ortakMetin = metin;
                        }
                    }
                }
            }
        }
       return  "Ortak metin : " + ortakMetin;


    }


    public static String enUzunMetin2(String dize1, String dize2) {
        String result = "";
        for (int length = dize1.length(); length > 0; length--) {
            int startIndex = 0;
            while (startIndex + length <= dize1.length()) {
                String current = dize1.substring(startIndex, startIndex + length);
                if (dize2.contains(current)) {
                    result = current;
                    break;
                }
                startIndex++;
            }
            if (result.length() != 0) {
                break;
            }


        }
        return result;
    }
}