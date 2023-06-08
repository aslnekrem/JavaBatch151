package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {
     /*
        Kullanicidan bir sayi aliniz, o sayi pozitif ise ekrana "Pozitif" yazdirin, degilse ekrana "Pozitif degil" yazdirin
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        int num = input.nextInt();

        String result = num>0 ? "Pozitif" : "Pozitif degil";
        System.out.println(result);
    }
}
