package C03_if_Switch_Ternary_String;

import java.util.Scanner;

public class Q01_BMIHesaplama {
    /*
    7Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
    IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
    BMI 18,5'in altındaysa zayıfsınız
    BMI 18,5 ile 25 arasında ise kilonuz idealdir
    BMI 25-30 arasındaysa şişmansınız
    BMI 30'dan büyük veya eşitse, obez
    Input:
    Output:
    Agirlik : 71
    Boy : 1,72
    BMI : 23.99945916711736
    Zayifsiniz.
     */
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        double kilo=scan.nextDouble();
        double boy=scan.nextDouble();

        double bMI=(kilo/(boy*boy));

        if (bMI<18.5){
            System.out.println("Agirlik : " + kilo +
                    "\nBoy : " + boy + " \nBMI : " + bMI +
                    "\nZayifsiniz");

        }else if (bMI<25){
            System.out.println("Agirlik : " + kilo +
                    "\nBoy : " + boy + "\nBMI : " + bMI +
                    "\nKilonuz idealdir");

        }else if (bMI<30){
            System.out.println("Agirlik : " + kilo +
                    "\nBoy : " + boy + "\nBMI : " + bMI +
                    "\nSismansiniz");

        }else{
            System.out.println("Agirlik : " + kilo +            "\nBoy : " + boy + "\nBMI : " + bMI +
                    "\nobez");
        }
    }
}
