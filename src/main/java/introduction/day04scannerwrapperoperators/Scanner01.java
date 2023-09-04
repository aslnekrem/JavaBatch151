package introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz: ");
        int number = input.nextInt();
        
    
        
        int lastDigit = number % 10;

        number = number / 10;

        int lastSecondDigitnumber = number % 10;

        number = number / 10;

        int lastThirdDigit = number % 10;

        number = number / 10;

        int lastFourthDigit = number%10;

        number=number/10;

        int lastFifthDigit = number%10;
        number=number/10;
        System.out.println(lastDigit+lastSecondDigitnumber+lastFourthDigit+lastFifthDigit);
       



    }

}
