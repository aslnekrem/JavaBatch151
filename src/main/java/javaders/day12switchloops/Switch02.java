package javaders.day12switchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        //Example 1: Kullanicidaniki sayi ve yapilacak islemi alan ve +,-,*,/,% islemlerini yapan kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen iki sayi giriniz: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("Lutfen yapilacak islemi giriniz: +,-,*,/,% den birini seciniz");
        char opr = input.next().charAt(0);//nextchar olmadigi icin char bir ifade almak istiyorsak bu sekilde kullaniriz

        switch (opr){
            case '+' :
                System.out.println(a+" + "+b+" = "+(a+b));
                break;
            case '-' :
                System.out.println(a+" - "+b+" = "+(a-b));
                break;
            case '*' :
                System.out.println(a+" * "+b+" = "+(a*b));
                break;
            case '/' :
                System.out.println(a+" / "+b+" = "+(a/b));
                break;
            case '%' :
                System.out.println(a+" % "+b+" = "+(a*b/100));
                break;
            default:
                System.out.println("Bu islem tanimlanmamisir");

        }







    }//main
}//class
