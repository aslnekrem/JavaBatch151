package javaders.day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {

        int i = 1;

        //While Loop
        while (i<1){//While Loop'Da Loop body'nin hic calismamasi mumkundur. (Zero execution is possible)
            System.out.println(i);
            i++;
        }

        //Do While Loop
        int k = 1;
        do {
            System.out.println(k);
            k++;
        }while (k<1);

        //Kullanici bir sayi girsin sayi 100'den kucuk ise kullanici kazandiniz mesaji alsin
        //diger durumlarda kaybettiniz mesaji alsin

        Scanner input = new Scanner(System.in);


        do {
            System.out.println("Please enter an integer: ");
            int n = input.nextInt();
            if (n<100){
                System.out.println("Won!");
            }else {
                System.out.println("lost!");
            break;
            }
        }while (true); //While icine true yazarsak sonsuz dongu olur. Icine break yazmamiz lazim kirmak icin

        //Kullanicidan alinan bir cümlenin büyük harf ile baslayip nokta ile bittigini kontrol eden kodu yaziniz

        do {
            System.out.println("Please enter a Word: ");
            String s = input.next();
            if (s.endsWith(".") && (s.charAt(0)>='A' && s.charAt(0)<='Z')){
                System.out.println("Your Word is correct grammatically");
            }else {
                System.out.println("Your Word has a grammatical mistake");
                break;
            }

        }while (true);



    }//main
}//class
