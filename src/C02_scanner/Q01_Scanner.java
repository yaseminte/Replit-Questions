package C02_scanner;

import java.util.Scanner;

public class Q01_Scanner {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.

        Scanner scan = new Scanner(System.in);

        int sayi= scan.nextInt();

        int sayininKupu= (sayi*sayi*sayi)/2;
        System.out.println(sayininKupu);

    }
}
