package C02_scanner;

import java.util.Scanner;

public class Q06_ExplicitNarrowing {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün
        ve konsolda yazdırın.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Float bir deger giriniz : ");
        float floatDeger = scanner.nextFloat();

        short shortdeger= (short) floatDeger;
        System.out.println(shortdeger);
    }
}
