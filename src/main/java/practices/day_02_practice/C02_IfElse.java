package practices.day_02_practice;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {
        /*
        Kullanicidan ucgenin a, b ve c kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        Girilen uzunlukların, bir dik ucgenin kenar uzunlukları olup olmadıgını konsola yazdırınız

        Örnek Ekran Çıktısı:

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz:  4
        üçüncü kenarı giriniz:  5
        Bu bir dik üçgendir
     */
        Scanner scan = new Scanner(System.in);


        System.out.println("Ucgenin a Kenarini Giriniz");
        int a = scan.nextInt();


        System.out.println("Ucgenin b Kenarini Giriniz");
        int b = scan.nextInt();


        System.out.println("Ucgenin c Kenarini Giriniz");
        int c = scan.nextInt();


        if(a*a + b*b == c*c){
            System.out.println("Bu Bir Dik Ucgendir");
        }else if(a*a + c*c == b*b){
            System.out.println("Bu Bir Dik Ucgendir");
        }else if(c*c + b*b == a*a){
            System.out.println("Bu Bir Dik Ucgendir");
        }else{
            System.out.println("Bu Bir Dik Ucgen Degildir");
        }



    }
}
