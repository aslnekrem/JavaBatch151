package practices.day_11_practice;

public class C04_Constructor {
    // marka, model, yil, yakit  seklinde dort tane instance variable olusturalım.
    // Bu variable'lara parametreli constructor kullanarak, farli bir class'dan deger ataması yapınız ve yazdırınız

    String marka;
    String model;
    int yil;
    String yakit;
    

    public C04_Constructor(String marka, String model, int yil, String yakit) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.yakit = yakit;
    }
}
