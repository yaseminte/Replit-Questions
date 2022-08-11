package C05_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01_Sort {
    public static void main(String[] args) {
        //Karışık verilen sayıları ve kelimeleri sıralayan Java kodunun yazınız.
        //not: Test datadaki değerleri kullanınız.

        //Test Data:
        //[1232, 1134,2345,1022]

        //Beklenen Çıktı:
        //[1022,1134,1232,2345]

        int[] sayilar = {1232, 1134, 2345, 1022};

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));
    }
}
