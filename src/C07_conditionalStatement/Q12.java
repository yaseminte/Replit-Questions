package C07_conditionalStatement;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        //Ugly Number:
        //Girilen bir sayının ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
        //Sayı sisteminde, ugly number sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır.
        // İlk 10 ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
        //Test Data:
        //13
        //Beklenen çıktı:
        //ugly number  degildir
        //Test Data:
        //25
        //Beklenen Çıktı:
        //ugly number

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0 || num%3==0 || num%5==0){
            System.out.println("ugly number");
        }else
            System.out.println("ugly number degil");



       /*

         String sonuc = "";
         for (int i = 2; i < 6 && num > 0; i++) {
            if (num % i == 0) {
                sonuc = "ugly number";
            } else
                sonuc = "ugly number degildir";

        }

        System.out.println(sonuc);

        */

    }
}
