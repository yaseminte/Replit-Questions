package C07_conditionalStatement;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        //Girilen sayının pozitif, negatif veya sıfır olup olmadığını yazdırın Java Kodunu yazınız.
        //Test data :21
        //Beklenen Çıktı:
        //Sayı Pozitif
        //Test data :-15
        //Beklenen Çıktı:
        //Sayı Negatif
        //Test data :0
        //Beklenen Çıktı:
        //Sayı Sıfır

        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        if (sayi>0){
            System.out.println("Sayi Pozitif");
        }else if(sayi<0){
            System.out.println("Sayi Negatif");
        }else System.out.println("Sayi Sifir");

    }
}
