package C04_for_While;

public class Q03_TekrarEdenKarakter {
    public static void main(String[] args) {
        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        Input :
        String str=“Javaisalsoeasy”
        Output: a s
         */

        String str = "Javaisalsoeasy";
        String tekrarEden = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.substring(i,i+1)) != str.lastIndexOf(str.substring(i,i+1))){
               if (!tekrarEden.contains(str.substring(i,i+1))){
                   tekrarEden +=str.substring(i,i+1)+ " ";
               }
            }
        }
        System.out.println(tekrarEden);



        /*  for (int i = 0; i < str.length(); i++) {
            String ilkHarf = str.substring(i,i+1);
            for (int j = i+1; j < str.length() ; j++) {
                String ikinciHarf = str.substring(j,j+1);

                if (ilkHarf.equals(ikinciHarf) && !tekrarEden.contains(ikinciHarf)){
                    tekrarEden += ikinciHarf + " ";
                }
            }

        }
        System.out.println(tekrarEden);

       */
    }
}
