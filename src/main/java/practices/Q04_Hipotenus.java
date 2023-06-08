package practices;

public class Q04_Hipotenus {
    public static void main(String[] args) {



        double hipotenushesapla = hipotenushesapla(3,4);
        System.out.println(hipotenushesapla);
        //Method void oldugunda donen sey ile islem yapamazsin. Cunku void veri uretmez
    }
            /* Asagidaki method void olsaydi eger, return olmayacagi icin donen degerleri
            main methodu icinde kullanamazdin. Ama void method'u yani asagida istersen yazdirabilirdin
            sadece geriye veri donmez

             */
    public static double hipotenushesapla (double dikkenar1, double dikkenar2) {

     return Math.sqrt(dikkenar1*dikkenar1+dikkenar2*dikkenar2);
        // Math.sqrt() //Bu method karekok alma method'u

    }
}
