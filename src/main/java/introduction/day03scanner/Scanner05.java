package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      

        System.out.print("Lütfen dikdorgenin kisa kenarini giriniz: ");
        int shortSide = input.nextInt();
        System.out.print("Lutfen dikdortgenin uzun kenarini giriniz: ");
        int longSide = input.nextInt();
        int alan = shortSide*longSide;
        int cevre = 2*shortSide+2*longSide;
        System.out.println("Verilerini girmis oldugunuz dikdortgenin alani: "+alan+"\nCevresi: "+cevre);

        



    }
}
