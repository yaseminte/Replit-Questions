package C02_scanner;

import java.util.Scanner;

public class Q02_KareninAlaniVeCevresi {
    public static void main(String[] args) {
        /*
        Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.
        Ornek Cikti :
        Alan: 9
        Cevre: 12
         */
        Scanner scan = new Scanner(System.in);

        int uzunluk = scan.nextInt();

        System.out.println("Alan: " +uzunluk*uzunluk);
        System.out.println("Cevre: "+ (uzunluk*4));

    }
}
