package javaders.day06typecastingstringmanipulation;

public class TypeCasting {
    public static void main(String[] args) {

       
        short num = 260;
        byte numByte = (byte) num;
        System.out.println("numByte = " + numByte); //4

        //  -128 < byte <+127 .. Byte konteyniri icerisinde 256 sayi var
        //yukaridaki ornekte short'dan gelen 260 sayisini 256'ya boluyor 4 kaliyor onu yazdiriyor
        //bunu sonrasinda tekrar short newShort = numByte; yapsakta yine 4 olur. Bu yuzden bu yontem tehlikeli


        short num2 = 1023;
        byte num2Byte = (byte) num2;
        System.out.println("num2Byte = " + num2Byte);//-1
        ////Kalan sayi bolenin yarisindan fazlaysa bolunen sayinin son sayisini bir arttirir Java

        short num3 = 1000;
        byte num3Byte = (byte) num3;
        System.out.println("num3Byte = " + num3Byte); //-24
        //1000/256=232 (kalan). Burada bolum 3'dur. Bu yontemde ise bolumu 1 arttirir yani 3'u 4 yapar

        int intSayi = 8880;
        short shortSayi = (short) intSayi;
        System.out.println("shortSayi = " + shortSayi);//8880


                /*
                Explicit Narrowing yaparken dikkat edilmeli .
                Cunku Cok Ciddi Data kaybi hatta Datanin degismesine neden olabilir.
                Eger sayimiz donusturmeye calistigimiz variable'in sinirlari
                disinda ise; Java sayiyi mod islemine alir ve kalani yazdirir.
                Kalan bolenin yarisindan fazlaysa kalan sayiyi Java kucultmek ister ve
                bolumu 1 buyuterek kalani (-)isaretli olacak sekilde yazdirir


*/

    }
}
