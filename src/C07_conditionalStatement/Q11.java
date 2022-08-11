package C07_conditionalStatement;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        //Kullanıcıdan bir harf girmesini isteyiniz.
        // Girilen harf sesli ise Sesli harf olduğunu,
        // değilse sessiz harf olduğunu ekrana yazdırsın.
        // Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı göstersin.
        // (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
        //
        //Sesli harfler: a,e,i,o,u
        //Test Data:
        //a
        //Beklenen Cikti
        //a harfi sesli harfdir.
        //Beklenen Çıktı:
        //d harfi sesiz harftir.
        //we  yada %
        //Yanlis karakter girdiniz!

        Scanner in = new Scanner(System.in);
        String harf = in.next().toLowerCase();

        String sesliHarfler = "a,e,i,o,u";
        String sessizHarfler = "b,c,d,f,g,h,j,k,l,m,n,p,r,s,t,w,x,v,z";

        if (sesliHarfler.contains(harf)) {
            System.out.println(harf + " harfi sesli harftir");

        } else if (sessizHarfler.contains(harf)) {
            System.out.println(harf + " harfi sessiz harftir");

        } else if (harf.length() > 1) {
            System.out.println("Yanlis karakter girdiniz!");

        } else {
            System.out.println("Yanlis karakter girdiniz!");
        }
    }
}
