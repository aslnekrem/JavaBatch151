package practices.day_05_looparrays;

import java.util.Scanner;

public class C01_cdenOncekia {
    /*
      Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
   'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
   
   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1.Way
        System.out.println("Lutfen 'c' ve 'a' harflerini iceren bir kelime giriniz");
        String str = input.nextLine().toLowerCase();

        int counter =0 ;  // default deger + ve - sifirdir0           * ya da / default==> 1     String datalar icin  "";
// 1.Yol
        for (int i = 0; i <str.indexOf("c") ; i++) {
            if(str.charAt(i)=='a'){
                counter++;
            }//if body
        }//for body
        System.out.println("c'den once "+counter+" a vardir");

        System.out.println("************************************************");

        //2.Way
        int sayac = 0;
        if (str.contains("c") && str.contains("a")){
            for (int i = 0; i <str.length() ; i++) {
                if (str.charAt(i)=='c'){
                    break;
                }else if (str.charAt(i)=='a'){
                    sayac++;
                }
            }//for loop
            System.out.println("c'den once "+sayac+" a vardir");
        }else {
            System.out.println("Lutfen a ve c harfleri iceren bir kelime giriniz");
        }






        /*
        Benim yazdigim kod asagidaki

        String str = input.nextLine();

        int counter = 0;

        for (int i=0; i<str.length(); i++){

            if (str.charAt(i)=='c'){
                break;
            }else if (str.charAt(i)=='a'){
                counter++;
            }

        }//for loop

        System.out.println("c'den once "+counter+" a vardir.");
        */







    }//main
}//class
