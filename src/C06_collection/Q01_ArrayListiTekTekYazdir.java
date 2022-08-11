package C06_collection;

import java.util.ArrayList;
import java.util.List;

public class Q01_ArrayListiTekTekYazdir {
    public static void main(String[] args) {
        //Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.
        //Array elemanları: siyah,sari,mavi,turuncu
        //Beklenen Çıktı:
        //siyah
        //sari
        //mavi
        //turuncu

        ArrayList<String> renkler = new ArrayList<>();

        renkler.add("siyah");
        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("turuncu");

        System.out.println(renkler.get(0));
        System.out.println(renkler.get(1));
        System.out.println(renkler.get(2));
        System.out.println(renkler.get(3));

    }
}
