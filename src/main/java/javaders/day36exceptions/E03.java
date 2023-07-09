package javaders.day36exceptions;

public class E03 {

    /*
        IWQ:
        1)"throws" methods signatures satirinda kullanilir. "throw" ise method body icinde kullanilir
        2)"throws" method signature satirinda bir veya birden fazla exception ile bir kere kullanilir. Yani method
            signature'da bir kere throws yazar. "throw" ise method body icerisinde bir tane exception ile tekrar tekrar
            kullanilabilir.
        3)"throws" dan sonra sadece Exception Class isimleri yazilir
            "throw" dan sonra ise Exception Class'dan obje olusturulur

     */

    public static void main(String[] args) {
        printAge(23);

        try {
            printAge(-12);
        }catch (IllegalArgumentException e){
            System.out.println("Negative ages are not valid");
        }

        printAge(-9);//IllegalArgumentException


    }//main

    private static void printAge(int age) {
        if (age<0){
            throw new IllegalArgumentException("Used negative integers for ages");
            //Firlattigimiz hatanin icerisine boyle bir mesaj yazabiliyoruz.
            // Ve hatanin yaninda boyle teknik izah da yapabiliyoruz
        } //Signature'da throws yaziyor, bizim yazdigimizda throw yaziyor.

        System.out.println(age);
    }
}
