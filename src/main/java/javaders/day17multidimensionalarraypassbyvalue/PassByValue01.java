package javaders.day17multidimensionalarraypassbyvalue;

public class PassByValue01 { /*
        Method olusturmak icin asagidaki 5 adimi takip ediniz;
        1)Access Modifier
        2)Return Type
        3)Method ismi
        4)Method Parantez
        5){ } parantezleri method body'si icin
        

        Note: "main method" un icindeki tum method'lar static olmalidir.
        //Main method icerisinde kullanacagimiz tüm methodlar static olmalidir
              Bir method'u static yapmak icin "access modifier" ile "return type"
              arasina "static" yazmak yeterlidir.

       Pas by Value:
        1)Java "Pass by Value" kullanir.
        2)Yani; Java method'larin orjinal degeri degistirmesine musaade etmez
        3)Java method'lara deger yollarken orjinal degerin kopyasini olusturur ve o kopyayi method'a yollar.
          Method kopya deger uzerinde degisiklik yapar, boylece orjinal deger korunmus olur.
        4)Java esnek bir dil'dir. Istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebiliriz.
        Bakiniz line 32

      Pass by Reference:
        1)Pass by Reference da method'a reference yollanir.
        2)Reference adres demektir. Adres yollaninca method adresi kullanarak orjinal degere ulasir ve
          orjinal degeri degistirir.
          Bu yuzden "C#" gibi Pass by Reference kullanan dillerde method variable'in orjinal degerini degistirir.
     */

    public static void main(String[] args) {

        int shirtPrice = 200;
        System.out.println(discount("student", shirtPrice));//Static oldugu icin main method'u kullanabiliyoruz
        System.out.println(shirtPrice);

        shirtPrice = discount("veteran", shirtPrice);//Static oldugu icin main method'u kullanabiliyoruz
        System.out.println(shirtPrice);

    }
    //Discount Method'u olusturunuz
    public static int discount(String type, int price){//Static olmasaydi main method icerisinde kullanamazdik
        switch(type){
            case "student":
                price = price - 20;
                break;
            case "veteran":
                price = price - 40;
                break;
            case "senior":
                price = price - 30;
                break;
            default:
                price = price;
        }
        return price;
    }

}
