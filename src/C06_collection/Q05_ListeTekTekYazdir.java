package C06_collection;

import java.util.ArrayList;

public class Q05_ListeTekTekYazdir {
    public static void main(String[] args) {

        //Bir ArrayList oluşturum ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.
        //ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu
        //Beklenen Çıktı:
        //Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
        //siyah
        //mavi
        //kirmizi
        //yesil
        //mor
        //turuncu

        ArrayList<String>liste = new ArrayList<>();
        liste.add("siyah");
        liste.add("mavi");
        liste.add("kirmizi");
        liste.add("yesil");
        liste.add("mor");
        liste.add("turuncu");

        System.out.println(liste);
        System.out.println(liste.get(0));
        System.out.println(liste.get(1));
        System.out.println(liste.get(2));
        System.out.println(liste.get(3));
        System.out.println(liste.get(4));
        System.out.println(liste.get(5));
    }
}
