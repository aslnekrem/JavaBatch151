package javaders.day22stringbuilder;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println("sb1 = " + sb1);// Java is easy

        sb1.reverse();//String'in ters cevirilmesi loop'lar ile de yapilir, bu kisa bir yoldur.
        System.out.println("sb1 = " + sb1);//ysae si avaJ

        sb1.deleteCharAt(6);//Veirlen index'deki karakteri siler
        System.out.println("sb1 = " + sb1);//ysae s avaJ

        sb1.delete(4,7);//Baslangic index'i dahil bitis index'i dahil degil, verdigimiz araligi siler
        System.out.println("sb1 = " + sb1);//ysaeavaJ

        sb1.replace(2,5,"*");
        //replace(2,5,"*") o arayi istedigimiz seyle degistiriyoruz
        System.out.println("sb1 = " + sb1);
        //ys*vaJ     //3 karakter yerine burada 1 karakter koyduk. istersek daha fazla ya da daha az da koyabiliriz

        sb1.insert(3,"2023");
        //sb1.insert(3,"2023"); ilk 3 karakteri gec araya 2023 yerlestir demek. Buradaki 3 index degil.
        System.out.println("sb1 = " + sb1);

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");

        int r1 = sb2.compareTo(sb3);//0 (Aralarinda fark yok anlaminda 0, alfabetik olarak ayni sirada "Java"lar.
        //Ikinciyi "Kava yapsaydik -1 olurdu. "-" once demek sayi kac tane once demek. Sonra olsaydi + ve yaninda sayi
        //Sonuc 0 ise alfabetik olarak ayni siradalar demektir
        //Sonuc mesela -3 ise sb2, sb3 den alfabetik olarak 3 onde demektir
        //Sonuc mesela +3 ise sb2, sb3 den alfabetik olarak 3 sonra demektir
        //Butun kucuk harfler kucuk harflerden 32 fazladir. Yani buyuk kucuk harfler de Ascii table'a gore bakiyor siralamaya

        System.out.println("r1 = " + r1);//0
        sb2.toString(); //StringBuilder'i String'e cevirir. String'de method cok oldugu icin, o method'lari kullanmak
                            //String'e cevirebiliriz mesela toUpperCase, toLowerCase methodlari icin

        String str = sb1.toString().toUpperCase();
        System.out.println("str = " + str);//String ==> str = YS*2023VAJ

        StringBuilder newSb1 = new StringBuilder(str);
        System.out.println("newSb1 = " + newSb1);//StringBuilder ==> newSb1 = YS*2023VAJ
        //Bu sekilde StringBuilder'i String' ve String'i StringBuilder'a cevirebiliriz









    }//main
}//class
