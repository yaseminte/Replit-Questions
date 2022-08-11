package C02_scanner;

import java.util.Scanner;

public class Q07_DataCasting {
    public static void main(String[] args) {
        /*
        Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Double bir deger giriniz : ");
        double sayi = scanner.nextDouble();

        int deger= (int)  sayi;
        System.out.println(deger);
    }
}
