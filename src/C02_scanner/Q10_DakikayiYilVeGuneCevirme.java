package C02_scanner;

import java.util.Scanner;

public class Q10_DakikayiYilVeGuneCevirme {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
        INPUT:
        Dakika sayısı: 3456789
        OUTPUT :
        3456789 dakika yaklaşık 6 yıl 210 gündür
         */

        Scanner scan= new Scanner(System.in);
        int inputMinute=3456789;
        int sumOfMinutesInaDay=24*60;
        int numberOfDays=inputMinute/sumOfMinutesInaDay;
        int numberOfYears=numberOfDays/365;
        int restOfDays=numberOfDays%365;
        System.out.println("3456789 dakika yaklasik "+
                numberOfYears+" yil "+restOfDays+" gundur");

    }
}
