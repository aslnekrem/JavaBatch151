package practices.day_02_practice;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen 100 üzerinden notunuzu giriniz: ");
        int not = scan.nextInt();

        String harfNotu = (not > 100) ? "100 den büyük not giremezsiniz"
                : (not > 89) ? "A"
                : (not > 79) ? "B"
                : (not > 69) ? "C"
                : (not > 59) ? "D"
                : (not > 49) ? "E"
                : (not >= 0) ? "F"
                : "Negatif not giremezsiniz";

        System.out.println(harfNotu);



    }//main
}//class
