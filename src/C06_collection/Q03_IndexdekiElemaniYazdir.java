package C06_collection;

import java.util.ArrayList;
import java.util.List;

public class Q03_IndexdekiElemaniYazdir {
    public static <ArrayListList> void main(String[] args) {
        //Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.
        //ArrayList elemanları: beyaz,siyah,sari,kirmizi,turuncu
        //Beklenen Çıktı:
        //Arrayin 1. elemani: beyaz
        //Arrayin 3. elemani: sari

       ArrayList<String> liste = new ArrayList<>();

       liste.add("beyaz");
       liste.add("siyah");
       liste.add("sari");
       liste.add("kirmizi");
       liste.add("turuncu");

        System.out.println(liste.get(0));
        System.out.println(liste.get(2));
    }
}
