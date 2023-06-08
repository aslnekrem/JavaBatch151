package javaders.day15loopsarrays;

import java.util.Scanner;

public class NestedLoop01 {
    public static void main(String[] args) {
        /*
        1.Example:Type code to get the output like
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */
        for (int i=1; i<5; i++){
            System.out.println("Week: "+i);


            for (int j=1; j<8; j++) {
                System.out.println("   Day: " + j);
            }
        }
        //Nested if'i kullanmak zorda kalmadikca tercih edilmez. Genel olarak Nested sart degilse kullanilmaz
        //Cunku uygulamayi yavaslatir
        System.out.println("***************************************************");
        //Nested while-loop
        int i=1;
        while(i<3){
            System.out.println("Week: "+i);
            int k=1;
            while (k<4){
                System.out.println("\tDay: "+k);
                k++;
            }
            i++;
        }

        /*
        2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                        ****
                        ****
                        ****
            Note: Get the number of the rows and the columns from user
         */
        System.out.println("*********************");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of rows");
        int rows = input.nextInt();
        System.out.println("Please enter number of columns");
        int column = input.nextInt();
        for (int j=0; j<rows; j++){
            for (int k=0; k<column; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("*******************************");
        System.out.println("Please enter row number: ");
        int row= input.nextInt();
        for (int l=1; l<=row; l++){
            for (int k=1; k<=l; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        //Nested lar cogunlukla for larla yapilir




    }//main
}//class
