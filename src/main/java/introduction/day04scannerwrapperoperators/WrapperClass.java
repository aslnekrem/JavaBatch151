package introduction.day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {

        //Primitive ve Non-Primitive arasindaki en büyük fark method'dur
        //Primitive     : char      - boolean - short - int    - long - float - double
        //Wrapper Class : Character - Boolean - Short - Integer -Long - Float - Double

        //Wrapper Class'lar non-primitive'dir. O yuzden memory'de cok yer kaplarlar
        //O yuzden sart degilse wrapper class kullanmayi tercih etmeyiz
        //boyle bir imkanin varligindan da haberdar olmaliyiz.

        //"n" yazip "nokta" koyarsaniz hic method goremezsiniz, cunku primitive'ler method icermez
        int n = 12;
        //"m" yazip "nokta" koyarsaniz bircok method gorebilirsiniz, cunku wrapper class'lar method icerir
        Integer m = 12;

        byte p = 13;
        Byte r = 13;

        //Ornek1: short data type'inin minimum ve maximum degerlerini kod yazarak bulunuz

        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);

        //Ornek 2: int data type;inin minimum degeri ile byte data type'inin maximum degerini bulunuz

        int intMinumum = Integer.MIN_VALUE;
        byte byteMaximum = Byte.MAX_VALUE;
        System.out.println(intMinumum+byteMaximum); //-2147483521

        //Ornek 3: i) Primitive int'i wrapper Integer'a ceviriniz
        int num = 13;
        Integer wrapperNum = num;

        /*
        Primitive yani method bulunmayan bir kutudaki degeri alarak icinde bazi methodlar bulunan wrapper kutuya atama
        yaparsak bu isleme autoboxing denir
         */

        //Yukarida autoboxing yaptik
        //DIKKAT!!!  Interview sorusu : Autoboxing unboxing

        //ii) Wrapper Byte'i primitive byte'a ceviriniz

        Byte k = 33;
        byte primitiveK = k;        //Burada unboxing yaptik.

        /*
        wrapper bir kutu icinde bazi method'larla birlikte bulunan degeri alarak primitive yani method bulunmayan
        bir kutuya atama yaparsak bu isleme unboxing denir
         */

        //Ornek 4: i) primitive char'i wrapper Character'e ceviriniz

        char initial = 'T';
        Character initialWrapper = initial;  //autoboxing

        //ii) Wrapper Boolean'i primitive boolean'a ceviriniz.

        Boolean isOld = true;               //boolean ile kullanilan seylerin isminin basina genelde is gelir
        boolean isOldpr = isOld;            //Unboxing




    }

}
