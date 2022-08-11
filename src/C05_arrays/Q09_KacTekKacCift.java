package C05_arrays;

public class Q09_KacTekKacCift {
    public static void main(String[] args) {

        //Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
        //Array: [1,2,3,4,5,6,7,8,9]
        //Beklenen Çıktı:
        //Tek Sayilar: 5
        //Cift Sayilar: 4

        int[] sayilar = {1,2,3,4,5,6,7,8,9};
        int ciftSayilarSayac = 0;
        int tekSayilarSayac = 0;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]%2==1){
                tekSayilarSayac++;
            } else if (sayilar[i]%2==0){
                ciftSayilarSayac++;
            }
        }
        System.out.println("Tek Sayilar : " + tekSayilarSayac);
        System.out.println("Cift Sayilar : " + ciftSayilarSayac);

    }
}
