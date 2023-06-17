package javaders.day09stringmanipulationsifstatement;

public class C02_IfStatement {

    public static void main(String[] args) {

        

        // Bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz
        //   String y ="abbccdc"

        String y ="aac";//c   SORU COZUMU COK UZAMAMSI ICIN  BU SEKILDE ALINDI
        char ch = y.charAt(0);
        if(y.indexOf(ch) == y.lastIndexOf(ch)){
            System.out.println(ch);
        }//if body iki curly braces arasi
        char ch1 = y.charAt(1);
        if(y.indexOf(ch1) == y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }//if body
        char ch2 = y.charAt(2);
        if(y.indexOf(ch2)== y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        // Ex : Verilen sayi pozitif ise ekrana "Sayi Pozitif " yazdiran kodu yaziniz
        int num =-65;

        if (num > 0) {
            System.out.println("Sayi Pozitif");
        }

        // Ex : Sayi -1 ile 10 arasinda ise ekrana "Verilen Data Rakamdir" yazdiran kodu yaziniz
        int rakam = 13;
        //Rakamlar 0 1 2 3 4 5 6 7 8 9

        if (rakam>-1 && rakam<10){
            System.out.println("Verilen data rakamdır");
        }
        System.out.println("*********** **************");

        // Ex : Sayi 3 basamakli ise "Verilen Data 3 Basamaklidir" yazdiran kodu yaziniz
        int sayi= -100;// Ekrana "Verilen Data 3 Basamaklidir"

        sayi = Math.abs(sayi);
        if(sayi>99 && sayi<1000){
            System.out.println("Verilen Data 3 Basamaklidir");
        }
//      Eger Math classindan abs() kullanmak istemez iseniz
//      asagidaki gibi iki kez if statement yazabilirsiniz

        int data=-999;

        if(data>99 && data<1000){
            System.out.println("Verilen Data 3 Basamaklidir");
        }
        if(data>-1000 && data<-99){
            System.out.println("Sayi Negatifte Olsa 3 Basamaklidir");
        }





    }//main

}
