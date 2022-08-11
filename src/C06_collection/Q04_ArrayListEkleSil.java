package C06_collection;

import java.util.ArrayList;

public class Q04_ArrayListEkleSil {
    public static void main(String[] args) {

        //Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.
        //Array Elemanları: sari,yesil,mavi,pembe
        //mavi rengini turuncu ile değiştirelim.
        //Beklene Çıktı:
        //[sari,yesil,mavi,pembe]
        //[sari,yesil,turuncu,pembe]

        ArrayList<String> liste = new ArrayList<>();
        liste.add("sari");
        liste.add("yesil");
        liste.add("mavi");
        liste.add("pembe");

        String silinecekRenk = "mavi";
        String eklenecekRenk = "turuncu";

        liste.set(liste.indexOf(silinecekRenk),eklenecekRenk);

        System.out.println(liste);
    }
}
