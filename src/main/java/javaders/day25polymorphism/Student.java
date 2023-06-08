package javaders.day25polymorphism;

public class Student {
    /*
    *Encapsulation nedir? Data saklamaktir. (Data hiding)
    *Data'yi nasil saklarsin? Access Modifier'ini "private" yaparak.
    *Encapsulation yaptigimiz Data'yi istersek diger Class'lardan okuyabiliriz.
    *Nasil okuruz? "get method" olusturarak Encapsulate edilmis data'nin degerini okuyabiliriz
        i) get method'lari hep public olur
        ii)get method bir boolean variable icin olusturulduysa ismi "is" ile baslar

      */
    private String stdId = "AC2023102T";
    public String sdtName = "Tom Hanks";
    public int age = 23;
    private double gpa = 3.87;
    private boolean successful = false;
    //Encapsulation yapilan variable'in data type'i "boolean" ise method ismi "is" ile baslar
    public boolean isSuccessful() {//boolean getter larin ismi is ile baslar. Cunku mi mi sorusu oluyor.
        return successful;
    }

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }
    /*
    *Encapsulation yaptigimiz data'yi istersek diger class'lardan nasil degistiririz.
    *Nasil degistirebiliriz? "set method" olusturarak Encapsulate edilmis data'nin degerini degistirebiliriz
       i)set method'lari hep "public" olur
       ii)set method'un "return type"i hep "void" olur.
       iii)set method parametre kullanir ve parametrenin data type'i variable ile ayni olur.
       iv)set method kullanarak varolan object uzerinde degisiklikler yaparak o object'i sanki yeni bir object'mis gibi kullanabiliriz
    *Get method larin diger adi getter, set method larin diger adi setter.
    */

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}//class
