package advanced_practice.day02;

import java.util.Scanner;

public class C02_Kronometre {

    //2023 QA IWQ

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kac kez islem yapilacagini giriniz ");
        int numTasks = input.nextInt(); //numTasks gorev sayisi

        long startTime = System.currentTimeMillis();//currentTimeMillis(); milisaniye olarak ani verir.

        System.out.println("**********************************");
        for (int i = 1; i <=numTasks ; i++) {
            int numbers[] = {1,2,3,4,5};
            int sum = 0;

            for (int number:numbers) {
                sum += number;
            }
            System.out.println("sum = " + sum);
            System.out.println("Islem "+i+" tamamlandi");
            System.out.println("**********************************");
        }//fori

        long endTime = System.currentTimeMillis();

        long islemSuresi = endTime-startTime;
        System.out.println("***************************");
        System.out.println("islemSuresi = " + islemSuresi);
        System.out.println("OrtalamaSure : " + ((double)islemSuresi/numTasks) + "milisaniye");

    }
}
