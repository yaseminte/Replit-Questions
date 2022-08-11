package C07_conditionalStatement;

public class Q10 {
    public static void main(String[] args) {
        //5 satırlık paskal üçgenini yazdıran Java kodunu yazınız.
        //Beklenen Çıktı:
        //      1
        //     1 1
        //    1 2 1
        //   1 3 3 1
        //  1 4 6 4 1

        for (int i = 1; i <=5 ; i++) {
            for (int j = 5; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("1"+ " ");
            }
            System.out.println();
        }

    }
}
