package practices.day_05_looparrays;

public class Butce {

    
    // Tum aile uyelerinin birikiminin
    // bulundugu ortak ihtiyaclar icin
    // kullanildigi bir butce ile kisisel
    // harcamalarin yapildigi
    // harclik'larin oldugu basit bir ev bütçesi kodu yazınız.

    public static int butce;
    public int harclik;

    public void maasAl(int alinanMaas){
        butce+=alinanMaas;  //butce = butce+alinanMaas
    }

    public void harclikAl(int alinanHarclik){
        butce-=alinanHarclik; //ortak hesaptan Harclik cikarilir
        harclik+=alinanHarclik;
    }

    public void butcedenHarca(int harcanacakPara){
        butce-=harcanacakPara;
    }

    public void harcliktanHarca(int harclikHarcamasi){
        harclik-=harclikHarcamasi;
    }


}//class
