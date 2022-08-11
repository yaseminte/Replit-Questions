package C05_arrays;

public class Q08_MaxIkinciSayi {
    public static void main(String[] args) {

        //Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.
        //Array: [1232,2345,5467,678,3454,2312,3451]

        int[] arr = {1232,2345,5467,678,3454,2312,3451};

        int maxSayi = 0;
        int maxSayi2 = 0;

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i]>arr[i+1]){
                maxSayi = arr[i];
                break;
            }
            if (arr.length-1>maxSayi){
                maxSayi=arr.length-1;
            }

        }


        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]<maxSayi && arr[i]>arr[i+1]){
                maxSayi2 = arr[i];
                break;
            }
            if (arr.length-1>maxSayi2){
                maxSayi2= arr.length-1;
            }
        }
        System.out.println(maxSayi2);
    }
}
