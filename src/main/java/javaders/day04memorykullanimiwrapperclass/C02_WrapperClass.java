package javaders.day04memorykullanimiwrapperclass;

public class C02_WrapperClass {
   

    public static void main(String[] args) {


        byte primitiveByte = 12;
        Byte wrapperByte = 12;

        System.out.println(Byte.MAX_VALUE);//127
        System.out.println(Byte.MIN_VALUE);//-128

        int intMax = Integer.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("toplam = " + (intMax+byteMin));   //2147483519


        float primitiveFloat = 12.33F;

        Float wrapperFloat = primitiveFloat;//kucuk kutuyu buyuk kutuya aktardik buna Autoboxing denir.


        Character wrapperchar = 'a';
        char primitiveChar = wrapperchar; //Unboxing kucuk kutuyu buyuk kutudan cikarma Java bunuda otomatik yapar


        String str1 = "12345";
        String str2 = "678";
        System.out.println(str1+str2); //12345678    resim gibi algiladigi icin ciktisi bu olur
        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));  //Bu sekilde sayiya cevirdik ve toplamam yapar
        
       

        String harf = "A";
        int sayi = 7;
       
        String a="K";
        int b=3, c=5,d=2;
        System.out.println(a+b*c/d);//K7






    }




}
