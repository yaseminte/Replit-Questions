package C04_for_While;

public class Q04_Faktoriyel {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yaziniz.
        Input : 6
        Output: 6!=65432*1=720
         */

        int input = 6;
        int faktoriyel = 1;

        for (int i = 1; i <= input ; i++) {
            faktoriyel*=i;
        }
        for (int i = input; i >=1 ; i--) {
            if (i==input){
                System.out.print(input + "!=" + input + "*");
            }else if (i>1){
                System.out.print(i+"*");
            }else System.out.print(i+"=");
        }

        System.out.println(faktoriyel);

    }
}
