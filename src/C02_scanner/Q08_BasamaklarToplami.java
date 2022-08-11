package C02_scanner;

import java.util.Scanner;

public class Q08_BasamaklarToplami {
    public static void main(String[] args) {
        /*
        Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.
        Örnek Çıktı:
        Verilen tamsayının rakamları toplamı 10'dur.
         */

        Scanner scan = new Scanner(System.in);

        int sayi = scan.nextInt();
        sayi=352;
        int rakam=0;
        int rakamlarToplami=0;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        System.out.println("Verilen tamsayinin rakamlari toplami " + rakamlarToplami+"\'dur.");

    }
}
