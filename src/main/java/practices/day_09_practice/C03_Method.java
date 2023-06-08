package practices.day_09_practice;

import java.util.Scanner;

public class C03_Method {
    public static void main(String[] args) {
         /*
   kullanıcıdan bir cumle sisteme girmesini isteyiniz.
   method olusturarak cumlede gecen sesli harfleri konsola yazdırınız
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = input.nextLine();
        String arr[] = cumle.split("");
        sesliHarfleriYazdir(arr);

    }//main

    public static void sesliHarfleriYazdir(String[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].equalsIgnoreCase("a") ||
                arr[i].equalsIgnoreCase("e") ||
                arr[i].equalsIgnoreCase("i") ||
                arr[i].equalsIgnoreCase("o") ||
                arr[i].equalsIgnoreCase("u")){
                System.out.print(arr[i] + " / ");

            }
        }
    }

    /*
    Alttakini ben yaptim
    public static void sesliHarf(String cumle){
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)=='a' || cumle.charAt(i)=='e' || cumle.charAt(i)=='i' || cumle.charAt(i)=='o'
            || cumle.charAt(i)=='A' || cumle.charAt(i)=='E' || cumle.charAt(i)=='I' || cumle.charAt(i)=='O'){
                System.out.print(cumle.charAt(i)+" / ");
            }
        }
    }

     */

}//class
