package C02_scanner;

import java.util.Scanner;

public class Q03_DikdortgeninAlaniVeCevresi {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.
        Örnek Çıktı:
        Alan: 32
        Çevre: 24
         */

        Scanner scan=new Scanner(System.in);

        int kisaKenar=scan.nextInt();

        int uzunKenar=scan.nextInt();

        System.out.println("Alan: "+ (kisaKenar*uzunKenar));
        System.out.println("Cevre: " + (kisaKenar+uzunKenar)*2);
    }
}
