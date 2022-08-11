package C02_scanner;

public class Q09_ZamaniSaniyeyeCevirme {
    public static void main(String[] args) {
        /*
        Girilen zamanı saniyeye çeviren bir program yazınız.
        Örnek Çıktı:
        1 saat 10 dakika 50 saniye ==>
        4250 saniye
         */

        int saat=1;
        int dk=10;
        int sn=50;

        saat = (saat*60)*60;
        dk = dk*60;

        System.out.println((saat+dk+sn) + " saniye" );
    }
}
