package advanced_practice.day02;

public class C01_EnUzunPalindrom {


    /*
    Verilen str data'daki en uzun palindrome'i yaziniz.
    //String str = "hellosannasmith";


    (Palindrome ==> Tersten okunusu ayni olan. "ey edip adanada pide ye")
     */

    public static void main(String[] args) {


        /*
        Verilen str datadaki en uzun palindrome 'u veren kodu yaziniz
         String str = "hellosannasmith";
         nalan==> nalan
         ey edip adanada pide ye
         ey edip adanada pide ye
         */
        String str = "hellosannasmith";
        System.out.println(enUzunPalindrome(str));

    }

    public static String enUzunPalindrome(String str) {
        String longestPalindrome= "";

        for (int i = 0;   i <str.length() ;    i++) {
            for (int j = i+1; j <= str.length(); j++) {// "hellosannasmith";

                String currentString = str.substring(i,j);//currentString=gecerliString

                if(isPalindrome(currentString) && currentString.length()>longestPalindrome.length()){
                    longestPalindrome = currentString;
                }
            }
        }
        return longestPalindrome;
    }

    public static boolean isPalindrome(String currentString) {//"hellosannasmith";
        int leftIndex=0;
        int rightIndex = currentString.length()-1;
        while(leftIndex<rightIndex){
            if(currentString.charAt(leftIndex)!= currentString.charAt(rightIndex)){
                return false;
            }//if
            leftIndex++;
            rightIndex--;
        }
        return true;
    }


}
