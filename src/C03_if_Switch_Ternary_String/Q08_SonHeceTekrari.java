package C03_if_Switch_Ternary_String;

import java.util.Scanner;

public class Q08_SonHeceTekrari {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
        Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
        INPUT : Mustafa
        OUTPUT : fafafa
         */

        Scanner input = new Scanner(System.in);
        String isim = input.next();

        if (isim.length()>=2){
            String sonHece = isim.substring(isim.length()-2);
            String sonuc = sonHece.concat(sonHece).concat(sonHece);
            System.out.println(sonuc);
        }

    }
}
