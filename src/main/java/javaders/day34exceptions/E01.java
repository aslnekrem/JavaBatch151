package javaders.day34exceptions;

public class E01 {
    public static void main(String[] args) {

    /*
    1)"Exception" beklenmedik problem demektir
    2)"Exception"i hallebilmek icin iki temel yol vardir
        i)"Exception"a uygun cozumler uretebilirsiniz "Exception Handling" denir
       ii)"Exception" olustugunda bunu ilan eder ve geri cekilirsiniz. Buna da "Throw Exception" denir.
    3)"Exception"a uygun cozumler uretmede "try-catch" kullanilir
        "try block" da yapilmasi gereken islemi Java'dan yapmasi istenir.
        Java islemi problemsiz bir sekilde yaparsa "catch block" java tarafindan okunmaz
        "try block" da islem yapilirken Exception olusursa "catch block" devreye girer ve "catch block" icindeki kodlar
        calisit.
    4)"try block" da islem yapilirken "Exception" olusursa "try block" icindeki Exception'dan sonraki kodlar
        calistirilmaz.

 */
        System.out.println(divide1(12,3));
        System.out.println(divide1(6,0));

        System.out.println(divide2(12,3));
        System.out.println(divide2(6,0));




    }//main

    // Method'lar aksiyon olabilmesi icin eylem seklinde olmali

    //1.Way: Exception'i
    //1.Way: Exception'i handle etmede ilk yol
    public static int divide1(int a, int b){
        if(b==0){
            return 0;
        }else{
            return a/b;
        }
    }

    //2.Way: Exception'i handle etmede harika yol
    public static int divide2(int a, int b){

        int result = 0;
        //toplama-cikarma-carpma islemlerinde try-catch yapmaya gerek yoktur.
        try {
            result = a/b;
            System.out.println("I am here");

        }catch (ArithmeticException e){ //ArithmeticException matematik ile ilgili olan butun problemleri yakalar

            System.out.println("there is an issue in division");

        }
        return result;
    }



}//class
