package C07_conditionalStatement;

import java.time.LocalDate;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // 1 ile 12 arasında girilen sayıdan ve yıldan
        // yılın hangi ayı olduğunun ve
        // o yıl bu ayın kaç gün olduğunu hesaplayan Java kodunu yazınız.
        // Test Data
        // 2
        // 2016
        // Beklenen Cikti
        // 2016 yili Subat ayi 29 gun
        // Test Data
        // 4
        // 1998
        // Beklenen Cikti
        // 1998 yili Nisan ayi 30 gun

        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int year = input.nextInt();
        boolean artikYil = true;

        switch (month) {
            case 1:
                System.out.println(year + " yili Ocak ayi 31 gun");
                break;
            case 2:
                if (year%4 != 0){
                    artikYil=false;
                } else if(year%100 !=0){
                    artikYil=true;
                } else if (year%400 !=0){
                    artikYil=false;
                } else {
                    artikYil=true;
                }

                if (artikYil){
                    System.out.println(year + " yili Subat ayi 29 gun");
                }else
                    System.out.println(year + " yili Subat ayi 28 gun");
                break;

            case 3:
                System.out.println(year + " yili Mart ayi 31 gun");
                break;
            case 4:
                System.out.println(year + " yili Nisan ayi 30 gun");
                break;
            case 5:
                System.out.println(year + " yili Mayis ayi 31 gun");
                break;
            case 6:
                System.out.println(year + " yili Haziran ayi 30 gun");
                break;
            case 7:
                System.out.println(year + " yili Temmuz ayi 31 gun");
                break;
            case 8:
                System.out.println(year + " yili Agustos ayi 31 gun");
                break;
            case 9:
                System.out.println(year + " yili Eylul ayi 30 gun");
                break;
            case 10:
                System.out.println(year + " yili Ekim ayi 31 gun");
                break;
            case 11:
                System.out.println(year + " yili Kasim ayi 30 gun");
                break;
            case 12:
                System.out.println(year + " yili Aralik ayi 31 gun");
                break;
            default:
                System.out.println("Hatali ay numarasi girdiniz!");
        }
    }
}
