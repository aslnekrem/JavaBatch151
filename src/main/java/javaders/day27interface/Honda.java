package javaders.day27interface;

public class Honda implements Engine, Brake{//Bir Interface'den sonra virgül yazip digerinin ismini yazabiliriz

    @Override
    public void start() {
        System.out.println("Start...");
    }

    @Override
    public void payment() {//Farkli interface'lere ayni isimde method olusturmak sorun olmaz ama tavsiye de edilmez
        System.out.println("Pay the break...");
        System.out.println("Pay the engine...");
    }


    @Override
    public void slow() {
        System.out.println("Be slow...");
    }
}
