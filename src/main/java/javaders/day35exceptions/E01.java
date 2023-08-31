package javaders.day35exceptions;

public class E01 {
    public static void main(String[] args) {

        System.out.println(convertStringToInt("123") + 2);

        
        System.out.println(convertStringToInt("12ab") + 2);//NumberFormatException : For input string: "12ab"
        

    }//main

    //Bir String'i Integer'a ceviren method olusturunuz
    public static int convertStringToInt(String str){

        try {
            return Integer.valueOf(str);
        }catch (NumberFormatException e){
            //NumberFormatException valueOf() method'u non-digit bir karakter iceren bir String ile kullanildiginda atilir
            str = str.replaceAll("[^0-9]","");
            return Integer.valueOf(str);
        }



    }
}
