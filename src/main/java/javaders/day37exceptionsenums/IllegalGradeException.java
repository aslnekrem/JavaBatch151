package javaders.day37exceptionsenums;

public class IllegalGradeException extends Exception{

    /*
        Eger bir seyi biz olusturuyorsak ona Custom deriz

        1)Custom Exception Class olusturmak icin Exception Class'a extend etmeliyiz. Exception Class'a extend ederek
            olusturdugunuz Exception, Compile Time Exception olur.

        2)Custom Exception Class olustururken "constructor" olusturmalisiniz. Bu Constructor Parent'daki Constructor'i
            cagirmalidir. Parent'daki Constructor, mesaj verecek veya vermeyecek sekilde olusturulabilir.

        3)Custom Exception Class olusturdugunuzda ismin sonunda "Exception" kelimesini kullanmalisiniz,
            IllegalGradeException'da oldugu gibi.



     */






    //Exception Class'daki butun ozellikleri kullanmasi icin Exception Class'in Cgild'i yaptik.

    public IllegalGradeException(String message){
        super(message);
    }

    public IllegalGradeException(){
        super();
    }
}
