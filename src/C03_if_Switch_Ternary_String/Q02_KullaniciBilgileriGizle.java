package C03_if_Switch_Ternary_String;

import java.util.Scanner;

public class Q02_KullaniciBilgileriGizle {
    public static void main(String[] args) {
        /*
        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
        Input :
        John White
        1234234534561478
        Output : Name :
        J*** W****
        CCN : **** **** **** 1478
        Ilk Harfler Buyuk harf ile baslamalidir.
         */
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine().toUpperCase();
        String surname=scan.nextLine().toUpperCase();
        String cCNo=scan.nextLine();

        String newName=name.substring(0,1) +
                name.replaceAll("\\S", "*");
        String newSurname=surname.substring(0,1)+
                surname.replaceAll("\\S", "*");
        String newCCNo= "**** **** **** " +cCNo.substring(12);


        System.out.print(newName);
        System.out.println(" " + newSurname);
        System.out.println("CCN : " + newCCNo);

    }
}
