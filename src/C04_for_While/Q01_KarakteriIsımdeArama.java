package C04_for_While;

import java.util.Scanner;

public class Q01_KarakteriIsımdeArama {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

        char ch1= 'a' ;
        String name =“John came late"
        Expected Output:
        Number of a = 2
         */

        Scanner scan = new Scanner(System.in);
        String isim = scan.nextLine();
        char karakter = scan.next().charAt(0);
        int tekrar = 0;

        for (int i = 0; i < isim.length(); i++) {
            if (karakter == isim.charAt(i)) {
                tekrar++;
            }
        }
        System.out.println("Number of " + karakter + " = " + tekrar);

    }
}

