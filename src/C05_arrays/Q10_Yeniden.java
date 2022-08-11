package C05_arrays;

public class Q10_Yeniden {
    public static void main(String[] args) {


        //Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve
        // tersine ters çevrilmiş String'e atayın.
        //Test Data:
        //sentence -> "Java is fun"
        //reversed **-> "nuf si avaJ"

        String sentence = "Java is fun";
        String reversed = "";

        for (int i = sentence.length()-1; i >= 0; i--) {
            reversed+=sentence.substring(i,i+1);
        }
        System.out.println(reversed);
    }
}
