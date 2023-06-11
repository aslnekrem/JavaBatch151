package introduction.day03scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ilk isminizi giriniz: ");
        String firstname = input.next();
        System.out.println("Soyisminizi giriniz: ");
        String lastname = input.next();

        System.out.println(firstname+" "+lastname);
       



    }
}
