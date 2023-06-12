package introduction.day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {

        

       
        int n = 12;
        Integer m = 12;

        byte p = 13;
        Byte r = 13;


        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);


        int intMinumum = Integer.MIN_VALUE;
        byte byteMaximum = Byte.MAX_VALUE;
        System.out.println(intMinumum+byteMaximum); //-2147483521

        int num = 13;
        Integer wrapperNum = num;

       

        
        Byte k = 33;
        byte primitiveK = k;        //Burada unboxing yaptik.

      

       
        char initial = 'T';
        Character initialWrapper = initial;  //autoboxing


        Boolean isOld = true;               //boolean ile kullanilan seylerin isminin basina genelde is gelir
        boolean isOldpr = isOld;            //Unboxing




    }

}
