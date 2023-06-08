package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i) Alanini hesaplayiniz
        //ii)Cevresini hesaplayiniz

        System.out.print("Lütfen dikdorgenin kisa kenarini giriniz: ");
        int shortSide = input.nextInt();
        System.out.print("Lutfen dikdortgenin uzun kenarini giriniz: ");
        int longSide = input.nextInt();
        int alan = shortSide*longSide;
        int cevre = 2*shortSide+2*longSide;
        System.out.println("Verilerini girmis oldugunuz dikdortgenin alani: "+alan+"\nCevresi: "+cevre);

        //input.nextInt();  Eger bu sekilde yazarsan kullanicidan veri alir ama bir yere paketlemedigin icin bir ise yaramaz
        //Bu yuzden yukaridaki gibi yap
        //KISAYOL!!! alan.soutv yazarsan direkt System.out.println("alan = " + alan); bunu yazdirir



    }
}
