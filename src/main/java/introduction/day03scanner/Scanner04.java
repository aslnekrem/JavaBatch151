package introduction.day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz
        System.out.println("Lütfen iki sayi giriniz: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
    }
}
