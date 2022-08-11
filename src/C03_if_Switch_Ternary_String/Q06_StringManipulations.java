package C03_if_Switch_Ternary_String;

import java.util.Scanner;

public class Q06_StringManipulations{
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
        Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
        Eger aynı karakterlere sahipse
        "isim ayni karakterlere sahiptir." yazdirin.
        Eger ayni karakterlere sahip degilse
        "Dizenin benzersiz karakterleri var" yazdirin.
        Ternary kullanin.
         */

        Scanner input = new Scanner(System.in);
        String isim = input.next().substring(0,3);
        int uzunluk = isim.length();

        String sonuc = isim.substring(0,1).equals(isim.substring(1,2))
                || isim.substring(0,1).equals(isim.substring(2))
                || isim.substring(1,2).equals(isim.substring(2))
                ? "isim ayni karakterlere sahiptir." :
                  "Dizenin benzersiz karakterleri var";

        System.out.println(sonuc);




      /*

        if(isim.substring(0,1).equals(isim.substring(1,2))){

            if (isim.substring(0,1).equals(isim.substring(2))){
                if (isim.substring(1,2).equals(isim.substring(2))){
                    System.out.println( "isim ayni karakterlere sahiptir.");
                }

            }
        }else  System.out.println("Dizenin benzersiz karakterleri var");

       */

    }
}
