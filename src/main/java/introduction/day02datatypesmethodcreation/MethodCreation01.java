package introduction.day02datatypesmethodcreation;

public class MethodCreation01 {
    
    public static void main(String[] args) {

        int sonuc = toplamaYap(3,5); //burada method'dan geleni atadik int icerisine
        System.out.println(sonuc);
        


        

        long sonuc2 = multiply(3,6); //a ve b'yi Intellij yaziyor biz degil
        

        System.out.println(sonuc2);

        int sonuc3 = firstTwoMultiplyThirdAdd(2,3,4);
        System.out.println(sonuc3);
        
        System.out.println(getCube(3.4));// küp alma method'una 3' u gonderdik

        print("Helloworld"); // DIKKAT!!!! Bu method'u incele cok onemli
    }

    

    public static int toplamaYap (int a, int b) { //Buraya static ekledik cunku static olmazsa main methoduna giremez

        return a+b;  //a ve b'yi toplayip int olarak gonderiyor.

    }

   

    protected static long multiply (int a, int b){
        //Burada Access Modifier olarak protected kullandik.
        //Access Modifier : public, protected, default, private
        return a*b;

    }

    //Example3: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan methodu olusturunuz

    private static int firstTwoMultiplyThirdAdd (int a, int b, int c){

    ;
    return a*b+c;

    }
    //Example : Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz
    static double getCube(double a){ // Burada bir sey yazmamak default oldugu anlamina geliyor
       
        return a*a*a;

       

    }
    
    public static void print (String str){ //Buraya void yazdik

        
       System.out.println(str);
      
    }
}
