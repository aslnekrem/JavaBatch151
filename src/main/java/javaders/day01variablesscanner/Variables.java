package javaders.day01variablesscanner;

public class Variables {
   

    public static void main(String[] args) {
        byte byteMax = Byte.MAX_VALUE; // byte in max degerini gosterir
        byte byteMin = Byte.MIN_VALUE; //byte'in min degerini yazdirir
        short shortMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;
        float floatMax = Float.MAX_VALUE; // float floatMax = Float.MAX_VALUE bu sekilde yazdiginda mesela hata veriyo
        float floatMin = Float.MIN_VALUE;
        System.out.println("byteMax = " + byteMax);
        System.out.println("byteMin = " + byteMin);
        System.out.println("longMax = " + longMax);
        System.out.println("longMin = " + longMin);
        System.out.println("doubleMax = " + doubleMax);
        System.out.println("doubleMin = " + doubleMin); //E ifadesi exponential
        System.out.println("floatMax = " + floatMax);
        System.out.println("floatMin = " + floatMin);



    }//main


}//class body
