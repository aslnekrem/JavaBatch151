package javaders.day37exceptionsenums;

public class IllegalAgeException extends RuntimeException{

    /*

        Eger Runtime Custom Exception uretmek isterseniz RunTimeException Class'a extend etmelisiniz.
            Bu hatayi kodu calistirdiktan sonra aliyoruz.



     */





    public IllegalAgeException() {
        super();
    }

    public IllegalAgeException(String message) {
        super(message);
    }


}
