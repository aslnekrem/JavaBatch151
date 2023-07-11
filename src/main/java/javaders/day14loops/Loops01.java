package javaders.day14loops;

import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {

        //IvO;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer..");
        String s = input.next();
        int sum = 0;
        for (int i=0; i<s.length(); i++){
            String d = s.substring(i,i+1);
            if (s.indexOf(d) == s.lastIndexOf(d)){
                sum+=Integer.valueOf(d); //Buraya dikkat et
            }
        }
        System.out.println(sum);

        //Bir String'deki tekrarli character'leri ekrana yazdiran kodu yaziniz?
        //Alabala==>la

        String t = "Alabala";
        String sonuc = "";

        for (int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if (t.indexOf(ch) != t.lastIndexOf(ch) && !sonuc.contains(""+ch)){//sonuc ch yi icermiyorsa dedik & den
                //sonra ve contains methodu char calistimayacagi icin concatination yaptik "" ile birlestirdik
                //Amaci tekrar eden ifadelerin  sonucunda  tekrar eden ifadeleri yazdirmadi
                sonuc+=ch;
            }
        }
        System.out.println(sonuc);

        /*
        *What?
        * Why?
        * Simple Implementation
        * Mid level Implementation
        * Advanced Implementation
        * Mini Project
         */



    }//main
}//class
