package C04_for_While;

public class Q05_CiftSayilariYazdir {
    public static void main(String[] args) {
        /*
        100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.

        OUTPUT : 100 98 96 94 92 … … … … 2 0
         */

        int sayi1 = 100;
        int sayi2 = 0;

        for (int i = sayi1; i >= sayi2; i-=2) {
            System.out.print(i + " ");
        }
    }
}
