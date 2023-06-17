package javaders.day09stringmanipulationsifstatement;

public class C01_StringManipulations {
    public static void main(String[] args) {

        

        /*
        isEmpty () bos mu dolu mu diye bakar
         */

        //EX: Bir String hic karakter icermedigini gosteren kodu yaziniz

        String str = "";
        // 1. Yol length()
        boolean bosMu = str.length() == 0;
        System.out.println("bosMu = " + bosMu);
        // 2. Yol isEmpty ()
        boolean bosMu2 = str.isEmpty();
        System.out.println("bosMu2 = " + bosMu2);
        //IsEmpty best practise cunku daha az islem

        // Ex: Bir String'in bosluk haric hicbir karakter icermedigini kontrol eden kodu yaziniz

        //1.Yol
        String str2 = "  ";
        boolean result = str2.replace(" ", "").length() == 0;
        System.out.println("result str2 = " + result);

        //2.Yol
        boolean result2 = str2.replaceAll(" ", "").isEmpty();
        System.out.println("result2 = " + result2);

        //isEmpty bos mu dolu mu diye bakar bize boolean bir deger dondurur. Sadece hiclikte true dondurur.

        //****************************      isBlank     ****************************

        /*
        isBlank method'u String bir datada space + hiclik icin true dondurur. Bos mu dolu mu oldugunu kontrol eder.
        Boolean bir deger dondurur. isEmpty'den farki variable'da sadece space varsa bos mu dolu mu diye soruldugunda
        isBlank bos der isEmpty dolu der.

         */

        boolean result3 = str2.isBlank();
        System.out.println("result3 = " + result3);//True
        boolean result4 = str2.isEmpty();
        System.out.println("result4 = " + result4);//false
        //str2'de sadece bosluk var bu yüzden isEmpty false isBlank ise true dondurur


        //******************        indexOf()       ************

        /*
        indexOf() verilen karakter veya karakterlerin ilk gorunumunun incex'ini verir.
        Tekli karakter icinde coklu karakter icinde kullanilabilir
        Coklu datalarda String ifadenin ilk gorunumunun ilk karakterinin indexini dondurur
        Olmayan bir karakteri sorarsak bize -1 dondurur
         */

        //Ex: Bir String de a, i ,e karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz

        String r = "Java is easy to Learn";
        int aIdx = r.indexOf('a');
        System.out.println("aIdx = " + aIdx);//1
        int eIdx = r.indexOf('e');
        System.out.println("eIdx = " + eIdx);//8
        int iIdx = r.indexOf('i');
        System.out.println("iIdx = " + iIdx);//5
        int toplam = aIdx + eIdx + iIdx;
        System.out.println("toplam = " + toplam);

        //Ex: Bir String'de "Java" kelimesinin ilk olarak kacinci index'de oldugunu bulunuz
        String u = "Ah Java vah Java sen ne guzel seysin Java";
        int idxJava = u.indexOf("Java");
        System.out.println("idxJava = " + idxJava);//3  //siralamayi yine har harf aliyor yani 0=A, 1=h vs..

        int idxPhyton = u.indexOf("Phyton");
        System.out.println("idxPhyton = " + idxPhyton);


        //*********************** lastIndexOf () ***********************\\
        /*
        lastIndexOf() Verilen bir datada karakter ya da karakterlerin
        son gorunumunun indexlerini verir
        Olmayan bir datanin kacinci indexde oldugunu sorgulatirsak bize -1 dondurur
         */

        // Ex : Bir String de a ,i ,e karakterlerinin son gorunumlerinin
        //      indexleri toplamini ekrana yazdiriniz
        String v = "Java is easy to Learn";

        int aLastIdx = v.lastIndexOf('a');
        System.out.println("aLastIdx = " + aLastIdx);

        int iLastIdx = v.lastIndexOf('i');
        System.out.println("iLastIdx = " + iLastIdx);

        int eLastIdx = v.lastIndexOf('e');
        System.out.println("eLastIdx = " + eLastIdx);

        System.out.println("aLastIdx+iLastIdx+eLastIdx : = " +
                (aLastIdx + iLastIdx + eLastIdx));//aLastIdx+iLastIdx+eLastIdx : = 40

        /*
        int ikinciKullanım=cumle.indexOf(kelime,ilkKullanım+1);
        Bunu farkli bir kaynaktan aldim. IndexOf u bu sekilde kullandiginda, ikinci yazdigin parametreden basliyor
        bakmaya. Mesela   indexOf(kelime,25)  burada kelime'ye 25'inci index'den itaberen baslayacak bakmaya.
         */

    }//main
}//class
