package javaders.day05typecastingasciivaluestringmanupulations;

public class C03_TypeCasting {
    public static void main(String[] args) {

        /*

        Numeric data type'larinin birbirine donusturulmesine Type Casting denir.
        Numeric data Type'lari ==>  byte<short<int<long<float<double

        Kucuk Data Type'larinin buyuk data type'larina donusturulmesine Auto Widening (Otomatik Genisletme) == Kucuk
        Kutunun Buyuk Kutu icerisine yerlesttirilmesi


        Buyuk Kutu nun Kucuk Kutu'ya donusturulmesinde Java sorumlulugu kabul etmez. Data kaybi olabilecegi icin
        kodu yazanlara birakir bu sorumlulugu. Buna Explicit Narrowing (Aciktan Daraltma) denir.

         */

        byte age = 13;
        int ageInt = age;  //Auto Widening. Bu kadar basit.

        //long data type'ini short'a cevirelim

        long population = 1234;
        short newPopulation = (short) population; //Explicit Narrowing

        //int data type'ini float data type'ina ceviriniz
        int boy = 170;
        float boyFloat =boy; //Auto Widening





    }//main
}//class
