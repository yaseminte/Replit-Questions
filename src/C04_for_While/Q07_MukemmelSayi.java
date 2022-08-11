package C04_for_While;

public class Q07_MukemmelSayi {
    public static void main(String[] args) {
        /*
        Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
        Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse,
        herhangi bir sayı Mükemmel Sayı olarak bilinir.
        Input :
        6
        Output:
        6 Mukemmel Sayidir.
        ======================
        Input
        7
        Output:
        7 Mukemmel Sayidir degildir.
         */

        int input = 28;
        int tamBolenlerToplami = 0;
        int mukemmelSayi = 0;

        for (int i = input; i > 0; i--) {
            if (input % i == 0) {
                tamBolenlerToplami += i;
                mukemmelSayi = tamBolenlerToplami / 2;
            }
        }
        if (mukemmelSayi==input){
            System.out.println(input + " Mukemmel Sayidir");
        }else System.out.println(input + " Mukemmel Sayi Degildir");
    }
}