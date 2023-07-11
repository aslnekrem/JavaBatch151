package javaders.day14loops;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {

        //1.Way
        for (int i = 3; i < 9; i++) {
            System.out.print(i + " ");
        }

        //2.Way
        //Baslangic degerini while'in ustune yaziyoruz main icine degil. Main icine condition yaziyoruz
        //Increment Decrement body nin sonuna yazilir..
        //While ile for mantigi ayni. Her soru hem while hem de for ile cozulebilir
        //For'un okunmasi while'a gore daha zordur.

        int i = 3;
        while (i < 9) {
            System.out.println(i);
            i++;
        }

        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI

        String s = "miami";
        int m = 0;
        while (m < s.length()) {
            String ch = s.substring(m, m + 1);
            if (m % 2 == 0) {
                System.out.print(ch.toUpperCase());
            } else {
                System.out.print(ch);
            }
            m++;

        }
        System.out.println();

        //Sie verilen tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz.

        int r = -578;
        r = Math.abs(r); //Negatif ve pozitif verilmesini onemsizlestiriyor. + -  ifadesi kalkiyor ortadan

        int sum2 = 0;
        while (r > 0) {
            sum2 += r % 10;
            r = r / 10;
        }
        System.out.println(sum2);//20

        //Kullanicidan aldiginiz sayi icin carpim tablosu olusturan kodu yaziniz
        //3X1=3  3X2=6 .... 3X10=30

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");

        double n = input.nextDouble();

        int u = 1;
        while (u < 11) {
            System.out.println(n + "x" + u + "=" + (n * u));

            u++;
        }

        //Example: Kullanicidan aldiginiz String'deki sessiz harfleri konsola yazdiran kodu yaziniz

        String x = "Alabama";
        System.out.println("Please enter a word");
        String y = input.next();//Hello
        int z = 0;
        while (z < y.length()) {
            char ch = y.charAt(z);
            boolean l = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'U' || ch == 'O';

            if (l) {
                //Parantezin icerisine bu kadar uzun kod yazmak tavsiye edilmez.
                z++;
                continue; //Burada continue yazmasaydin Hl yazardi
                //Istersen z++ ve continue silip sessiz harfse hicbir sey yapma diyebilirsin
            } else {
                System.out.print(ch);
            }
            z++;
        }

        //Asagidaki daha iyi bir kullanim

        while (z < y.length()) {
            char ch = y.charAt(z);
            boolean l = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'U' || ch == 'O';

            if (!l) {
                System.out.println(ch);
            }
            z++;
        }

        //Parantezin icini kisa tutmak daha okunabilir bir kod sunar ve tavsiye edilen budur



    }//main
}//class
