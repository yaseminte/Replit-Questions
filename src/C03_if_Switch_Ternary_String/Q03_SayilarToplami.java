package C03_if_Switch_Ternary_String;

import java.util.Scanner;

public class Q03_SayilarToplami {
    public static void main(String[] args) {
        /*
        Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın. Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.
        Ornek:
        INPUT :
        25
        46
        OUTPUT :
        Numaralarin Toplami:
        71
         */

        Scanner scan = new Scanner(System.in);
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        if (sayi1>=0 && sayi2>=0){
            int toplam = sayi1+sayi2;
            System.out.println("Numaralarin Toplami :" + toplam);
        }
    }
}
