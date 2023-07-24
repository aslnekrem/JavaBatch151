package javaders.day21datetime;

public class Varargs01 {
    public static void main(String[] args) {


        System.out.println(add(5,4,3,2,6));//20
        System.out.println(add(5,6));//11
        System.out.println(add(5));//5
        System.out.println();//0

        getInitials("Ali Can" , "Kemal Han" , "Tuncay Cinar" , "Ibrahim Catal");


        


    }//main

    //Toplama islemi yapan bir method olustur

    //Asagidaki gibi farkli method'lar olusturarak is yapamayiz. Cunku kullanici farkli sayidaki sayilari toplamak
    //isteyebilir, her ihtimal icin bir method olusturmak mumkun degildir
    /*
    public int add(int a, int b){

        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
    */

    //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu. bu yapiya "Varargs" denir
    //"Varargs" arkada "Array" yapisini kullanir.

    /*
        1) Bir method parantezinde birden fazla varargs kullanilamaz
        2) Bir method parantezinde birden fazla parametre kullanilacaksa varargs en sonda olmalidir
     */

    public static int add(int... a){//int... a  bu yapinin adi Varargs, ne kadar yollarsan veya hic yollamasan da calisir
        //Yukarida int...a nin yanina int...b yazamazsin cunku zaten sinirsiz gonderebiliryoruz.
        //Bu varargs method istedigimiz kadar parametreyle calisiyor
        //Ve yukaridaki method a gonderdigimiz parametreler list gibi calistigi icin list icine atiyor gibi dusun


        int sum = 0;
        for (int w : a) {
            sum = sum + w;

        }
        return sum;
    }

    //Example 2: Verilen isimlerin ilk harflerini console'a yazdiran method'u olusturunuz
    //          Ali Can ==> AC      Kemal Han ====> KH

    public static void getInitials(String...s){
        String initials = "";
        for (String w : s){
            initials = initials + w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials = "";
        }
    }



}//class
