package javaders.day04memorykullanimiwrapperclass;

public class C03_MantikOperatorleri {
    public static void main(String[] args) {
       

        System.out.println(5+2 ==8);//false

        boolean sonuc1 =5>4 && 7<9 && 6+3 == 9 && 5+2 !=8;
        System.out.println("sonuc1 = " + sonuc1);//true

        boolean sonuc2 =5>4 && 7>9 && 6+3 == 9 && 5+2 != 7;
        System.out.println("sonuc2 = " + sonuc2);//false

        int sayi1 = 15;
        System.out.println(10< sayi1 || sayi1<20);//true

        int sayi2=5;

        System.out.println(sayi2<10 || sayi2>20);//true


        short a= 1000;
        System.out.println(a<15000 || a>28000|| a < -23);//true

        System.out.println(a<=1000 && a==1000 && a<12);//false


    }
}
