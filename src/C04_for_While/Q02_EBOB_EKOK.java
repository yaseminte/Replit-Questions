package C04_for_While;

import java.util.Scanner;

public class Q02_EBOB_EKOK {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve
        LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

        Input :
        30
        40
        Beklenen Cikti:
        30 ve 40 icin GCD = 10
        30 ve 40 icin LCM = 120
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("2 tamsayi giriniz :");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int EBOB = 0;
        int EKOK = 1;
        int max = sayi1 * sayi2;

        //EBOB icin
        for (int i = 1; i <= sayi2; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                EBOB = i;
            }
        }
        System.out.println("30 ve 40 icin GCD = " + EBOB);


        //EKOK icin
        for (int i = max; i > 0; i--) {
            if (i % sayi1 == 0 && i % sayi2 == 0) {
                EKOK = i;
            }
        }
        System.out.println("30 ve 40 icin LCM = " + EKOK);
        System.out.println("EKOK : " + max / EBOB); //EKOK bulma kısayolu


    }
}
