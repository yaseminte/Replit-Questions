package C05_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_ArananDegerVarMi {
    public static void main(String[] args) {
        //yazılan değerin array içerisinde arayan Java Kodu yazınız.
        //
        //Array: [1551,1223,1443,1267,1789,1023,2020]
        //
        //Aranan Değer:2020
        //Beklenen Çıktı:**True**
        //Aranan Değer:2010
        //Beklenen Çıktı :**False**

        int[] arr = {1551,1223,1443,1267,1789,1023,2020};

        Scanner scan = new Scanner(System.in);
        int arananDeger = scan.nextInt();

        boolean varMi = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arananDeger){
                varMi = true;
                break;
            }
        }
        if (varMi){
            System.out.println("**True**");
        }else
            System.out.println("**False**");



       //  int [] arr2={1551,1223,1443,1267,1789,1023,2020};
       //  Arrays.sort(arr);
       //  if(Arrays.binarySearch(arr2,2020)>=0){
       //      System.out.println("**True**");
       //  }
       //  if(Arrays.binarySearch(arr2,2010)<0){
       //      System.out.println("**False**");
       //  }

    }
}
