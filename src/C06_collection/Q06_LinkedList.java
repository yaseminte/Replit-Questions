package C06_collection;
import java.util.LinkedList;
public class Q06_LinkedList {
    public static void main(String[] args) {

        //Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.
        //
        //LinkedList elemanları: sari,mavi,mor,yesil,beyaz
        //Beklenen Çıktı:
        //sari
        //mavi
        //mor
        //yesil
        //beyaz

        LinkedList<String> liste = new LinkedList<>();
        liste.add("sari");
        liste.add("mavi");
        liste.add("mor");
        liste.add("yesil");
        liste.add("beyaz");

        System.out.println(liste.get(0)+"\n"+liste.get(1)+"\n"+liste.get(2)+"\n"+
                           liste.get(3)+"\n"+liste.get(4));

    }
}
