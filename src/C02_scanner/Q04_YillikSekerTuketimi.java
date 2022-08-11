package C02_scanner;

import java.util.Scanner;

public class Q04_YillikSekerTuketimi {
    public static void main(String[] args) {
        /*
        Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
        1 şeker = 1.7 gr
        Örnek Çıktı:
        Yılda 12.41 kg şeker kullanıyor.
         */

        Scanner scan = new Scanner(System.in);

        int cay = scan.nextInt();
        cay=10;
        int seker=scan.nextInt();
        seker=2;
        double birSeker=1.7;

        double gunlukSekerTuketimi=(cay*seker)*birSeker;
        double yillikSekerTuketimi=gunlukSekerTuketimi*365/1000;

        System.out.println("Yilda " + yillikSekerTuketimi + " kg seker kullaniyor.");

    }
}
