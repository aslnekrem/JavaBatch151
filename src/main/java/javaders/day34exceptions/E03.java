package javaders.day34exceptions;

public class E03 {
    public static void main(String[] args) {


        System.out.println(getNumOfChars("Java"));//4
        System.out.println(getNumOfChars("Money"));//5
        System.out.println(getNumOfChars(""));

        System.out.println(getNumOfChars(null));//NullPointerException
        /*
        Method olusturduktan sonra bir string olusturacagiz. s isimli String sayesinde length
methodunu kullanabildik. String'imiz "Java" idi. length 4'u verdi. String "Money" oldugunda
length methodu ile 5'i aldik. Bos String'de "", 0 verdi. sout icine String olarak null
koyunca hata verdi, ekranda exception gorduk. Cunku bazi String methodlari null ile calismaz.
         */




    }


    //Bir String'deki eleman sayisini veren method olusturunuz

    public static  int getNumOfChars(String s){
        int result = 0;
        try {
            result = s.length();
        }catch (NullPointerException e){//NullPointerException String Class'da null ile uyumlu olmayan method'lar
                                        // kullanildiginda atilir.
            System.out.println("Some String methods do not work with null...");
            System.out.println(e.getMessage());//Java'nin Exception icin urettigi teknik mesaji varsa verir

        }

        return result;
    }

}
