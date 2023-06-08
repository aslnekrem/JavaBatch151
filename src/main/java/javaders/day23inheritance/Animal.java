package javaders.day23inheritance;

public class Animal {
    /*
        1)eat method'u gibi bir cok class'in kullanmasi gereken method'lari her class'a ayri ayri yazarsak;
            i)Tekrar yapmis oluruz, tekrar ideal code'da olmamalidir
            ii)Ayni method'u tekrar tekrar yazmak zaman kaybidir
            iii)Tekrar tekrar yazilan method'un tamiri cok zaman alir.
            iv)Tekrar tekrar yazilan method'un gelistirilmesi cok zaman alir
            v)Method'u tekrar tekrar yazmak "atomic yapi"ya terstir.
        2)Private class member'lar child class'lar tarafindan kullanilamaz
          Public class member'lar child class'lar tarafindan kullanilabilir
          Default class member'lar ayni package'de  child class'lar tarafindan kullanilabilir
          Protected class member'lar farkli package'de de olsalar child class'lar tarafindan kullanilabilir
     */
    protected void eat (){
        System.out.println("Animals eat...");
    }
    public void drink (){
    System.out.println("Animals drink...");
    }






}//class
