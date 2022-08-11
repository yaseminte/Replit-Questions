package C06_collection;

import java.util.ArrayList;

public class Q02_ListeElemanEkleYazdir {
    public static void main(String[] args) {
        //Array list oluşturun daha sonra aşağıda belirtilen yerlere yeni array elemanlarını ekleyen
        // java kodunu yazınız.
        //Array List: siyah,mavi,kirmizi,beyaz
        //en başa: pembe
        //mavi-kirmizi arasına yesil renk eklenecek.
        //Beklenen Çıktı:
        //[pembe,siyah,mavi,yesil,kirmizi,beyaz]

        ArrayList<String> renkler = new ArrayList<>();

        renkler.add("siyah");
        renkler.add("mavi");
        renkler.add("kirmizi");
        renkler.add("beyaz");

        System.out.println(renkler);

        renkler.add(0,"pembe");
        renkler.add(3,"yesil");

        System.out.println(renkler);
    }
}
