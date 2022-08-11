package C04_for_While;

import java.util.Scanner;

public class Q09_RakamiTerstenYazdirma {
    public static void main(String[] args) {
        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

        Input :1238
        Output :Girilen Numananin Tersi: 8321
         */

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int birlerBasamagi = 0;
        String tersNumber = "";


        while (input!=0){
            birlerBasamagi=input%10;
            input/=10;
            tersNumber += birlerBasamagi;
        }
        System.out.println("Girilen Numaranin Tersi : " + tersNumber);

        /*
        FARKLI ÇÖZÜM

        int sayi=1238;
        String tersSayi=String.valueOf(sayi);

        for (int i = tersSayi.length()-1; i >=0 ; i--) {

            System.out.print(tersSayi.substring(i,i+1));

         */
    }
}
