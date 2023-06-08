package javaders.day13incrementdecrementloops;



public class ForLoop01 {
    public static void main(String[] args) {

        //Example 1: 21'Den 181'e kadar hem 4 hem de 6 ile bolunebilen tamsayilari ekrana yazdiran kodu yazdiriniz

        int a=0;
        for (int i=21; i<181; i++){
            if (i%4==0 && i %6==0){
                System.out.print(i+" ");

            }
        }
        System.out.println();

        //Example 2 : Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
//             ankara ==> AKR

        //Note : Bir string'de son index her zaman length()-1
        //Note : Yazdiginiz kod belli senaryolar icin calisiyor ancak tüm senaryolar icin calismiyorsa;
        //bu tarz koda ==> hard-code denir ==> ve mutlaka düzeltilmelidir

        String s = "ankara";

        for(int i =0; i<s.length();    i++){
            String ch =  s.substring(i,i+1);
            if(i%2==0){
                System.out.print(ch.toUpperCase());
            }

        }
    //Yukarida dongude memory'de  bir yer acar ve surekli onu gunceller. Her defasinda yeni yer acmaz

        /*

        Asagidaki gibi de yapabilirsin.
        String s = "ankara";

        for (int i =0; i<s.length(); i++){
            if (i%2==0){
                System.out.print(s.toUpperCase().charAt(i));
            }
        }
         */




    }//main
}//class
