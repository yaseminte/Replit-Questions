package C05_arrays;

import java.util.Scanner;

public class Q06_ArananDegerKacinciEleman {
    public static void main(String[] args) {
        //Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
        //Array: [12,15,43,23,56,76,78,90,77,43]
        //Aranan değer:56
        //Beklenen Çıktı:
        //56 sayısı arrayin 4. elemanı

        int[] arr = {12,15,43,23,56,76,78,90,77,43};
        Scanner scan = new Scanner(System.in);
        int arananDeger = scan.nextInt();

        boolean varMi = false;
        int index = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arananDeger){
                varMi=true;
                index = i;
                break;
            }
        }
        System.out.println(arananDeger + " sayisi arrayin " + index + ". elemani");

    }
}
