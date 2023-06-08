package javaders.day14loops;

public class Loops {
    public static void main(String[] args) {
        //Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A

        String s = "Pwd12?Ab";

        for (int i = 0; i < s.length(); i++) {
            char ch =s.charAt(i);
            if (!(ch>'a'&& ch<'z')){
                System.out.print(ch);
            }
        }



    }//main
}//class
