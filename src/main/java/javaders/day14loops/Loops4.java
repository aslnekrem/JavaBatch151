package javaders.day14loops;

import java.util.Scanner;

public class Loops4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //hesabınız bloke olmuştur mesajı alsın
        //yanlış girerse yanlış girdiniz tekrar deneyiniz yazsın
        //doüru girerse hesabınıza hoşgeldiniz yazsın
        int counter = 0;
        do {

            System.out.println("Please Enter User Name...");
            String userName = input.next();

            System.out.println("Please Enter Your Password...");
            String password = input.next();

            if(counter==3) {
                System.out.println("Your account has been blocked.");
                break;

            }else if (userName.equals("Erdem") && password.equals("12345")) {
                System.out.println("Welcome to your account.");
                break;
            } else {
                System.out.println("Wrong user name or password try again");
            }



            counter++;
        }while(counter<4);
    }
}
