package C05_arrays;

public class Q04_GridSekli {
    public static void main(String[] args) {
        //Aşağıdaki grid şeklini yazan Java Kodunu yazınız.

        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0
        // 0  0  0  0  0  0  0  0  0  0

        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10 ; j++) {
                System.out.print("0" + " ");
            }
        }

    }
}
