package C07_conditionalStatement;

public class Q09 {
    public static void main(String[] args) {
        //Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
        //Test Data:
        //Yarım elmas uzunluğu : 7
        //Beklenen Çıktı:
        //      *
        //     ***
        //    *****
        //   *******
        //  *********
        // ***********
        //*************
        // ***********
        //  *********
        //   *******
        //    *****
        //     ***
        //      *


        for (int i = 1; i <=7 ; i++) {
            for (int j = 7; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Elmasin alt kismi icin

        for (int i = 1; i <= 7 ; i++) {

            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int j = 7; j >i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
