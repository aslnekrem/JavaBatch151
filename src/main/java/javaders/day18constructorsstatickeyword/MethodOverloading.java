package javaders.day18constructorsstatickeyword;

public class MethodOverloading {
     /*
        1)Bir method "ayni isim" ve "farkli parametre"lerle olusturulursa buna "Method Overloading" denir.
        2)"Method Overloading" Java da "iyi organizasyon" icindir.
        3)Method Overloading yaparken parametre 3 sekilde degistirilebilir;
            i)Parametrelerin sayilari degistirilebilir.
            ii)Parametrelerin data type'larini degistirebilirsiniz.
            iii)Parametrelerin data type'lari farkli ise yerleri degistirilebilir.
        4)"Method Overloading" bir class'in icinde olusur bu yuzden "private" method'lar da overload edilebilir.
          "Method Overloading" butun access modifier'larda kullanilabilir.
        5)"static" method'lar "overload" edilebilirler.

     */

    public static void main(String[] args) {

        System.out.println(add(3, 5));

    }

    private static int add(int a, int b){
        return a+b;
    }

    private static int add(int a, int b, int c){
        return a+b+c;
    }

    private static double add(double a, int b){
        return a+b;
    }

    private static double add(int a, double b){
        return a+b;
    }


}
