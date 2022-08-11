package C05_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q10_Split {
    public static void main(String[] args) {

        //Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve
        // tersine ters çevrilmiş String'e atayın.
        //Test Data:
        //sentence -> "Java is fun"
        //reversed **-> "**fun is Java**"**
        
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] cumle = sentence.split(" ");

        String reversed = "";


        for (int i = cumle.length-1; i >=0 ; i--) {
            reversed += cumle[i] + " ";
        }
        System.out.println("***" + reversed + "***");
    }
}
