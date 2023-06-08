package javaders.day13incrementdecrementloops;

public class ForLoop02 {
    public static void main(String[] args) {


        String s = "I love Java";

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='a'){
                break;
            }
            System.out.print(s.charAt(i));
        }
        System.out.println();

        /*

        Asagidaki code daha guzel cunku yukaridaki kod method lari cok kullandigi icin yoruyor

         for (int i=0; i<s.length(); i++){
         char ch = s.charAt(i);
            if (ch=='a'){
                break;
            }
            System.out.print(ch);
        }
         */

        //Example 2: Verilen bir String de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz

        String t = "Germany";

        for (int i =t.length()-1; i>=0; i--){
            char ch = t.charAt(i); //Boyle yaparak daha hizli yaptik kodu. Az method kullandik.
            if (ch=='a'){
                break;
            }
            System.out.print(ch);
        }
        System.out.println();

        //DIKKAT!! Char' larda String methodlari uygulayamazsin mesela yukaridaki ornekte ch.toUppercase() yazamazsin

    }//main
}//class
