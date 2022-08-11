package C05_arrays;

public class Q03_ArraydekiSayilarinOrtalamasi {
    public static void main(String[] args) {
        /*
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
        Array = [20, 30, 25, 35, -16, 60, -100 ]
        Beklenen Çıktı:
        Array Sayılarının ortalaması: 7.0
         */

        double[] sayilar = {20, 30, 25, 35, -16, 60, -100};

        int toplam = 0;
        int sayac = 0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
            sayac++;
        }

        double ortalama = toplam/sayac;
        System.out.println("Array Sayilarinin ortalamasi : " + ortalama);

    }
}
