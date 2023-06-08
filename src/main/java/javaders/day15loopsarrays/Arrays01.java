package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    /*
        1)Array, Java'nin "ayni data tipi"nde "coklu data" depolamak icin olusturdugu bir yapidir.
        2)Array ler primitive data type lariyla veya reference lar ile calisir
        3)Array'ler "super fast"dir ve "memory de cok az yer kaplarlar.
     */


    public static void main(String[] args) {
        //Array nasil olusturulur
        String studentNames[] = new String[5];

        //Array nasil yazdirilir
        System.out.println(studentNames); //[Ljava.lang.String;@19dfb72a
        //Bu sekilde referansi yazdirir elemanlari degil
        //Referanslar slack memory de bulunur. Array ler heap memory de bulunur

        System.out.println(Arrays.toString(studentNames));//[null, null, null, null, null]
        //Eger icerisine deger atamazsak default deger yazdirir

        //Array'e nasil eleman eklenir?
        studentNames[0]="Ajda";
        studentNames[3]="Cuneyt";
        studentNames[2]="Kemal";
        studentNames[1]="Ayhan";
        studentNames[4]="Filiz";
        System.out.println(Arrays.toString(studentNames));

        //Array deki specific bir elemani nasil alabiliriz?
        System.out.println(studentNames[3]);

        //Example 1: studentNames array indeki her ismin sonuna yildiz koyarak consol a yazdiriniz
        //1.Way:
        for (int i=0; i<studentNames.length; i++){//length String'lerde parantezli, array lerde
            // parantezsiz(method degil) kullanilir. Buradaki lengt mamntiken variable oluyor
            //Mesela String lerde length() kullandigimizda Java uzunlugu hesapliyor ama arraylerde biz zaten elemanlari
            //yazdigimizda uzunluk belli oluyor
            System.out.println(studentNames[i]+"*");
        }
        //2.Way: for-each loop ==> Enhanced(Zenginlestirilmis) Loop
        //Mümkünse hep for each loop kullanilir, yeterli olmazsa diger Loop'lar kullanilir

        for (String w:studentNames) { //for eacc Loop'da genelde w yazilir
            //Burada her elemani sirayla w'nün icine koyuyor.
            //for each loop bastan baslayip sona kadar gider, bu yuzden degistirilebilir oldugu icin genelde normal for
            //for each Loop array'lerde kullanilir simdilik.
            System.out.println(w+"*");
            //Yukaridaki kod ile bu kod ayni islevi goruyor.

        }

        //Example 2: Bir int array olusturunuz 5 eleman ekleyiniz elemanlarin toplamini bulup
        int arr[]=new int[5];
        arr[0]=12;
        arr[1]=23;
        arr[2]=9;
        arr[3]=38;
        arr[4]=27;
        int sum =0;

        for (int w:arr) {
            sum = w+sum;

        }
        System.out.println(sum);//109


        int toplam=0;

        for (int g=0; g< arr.length; g++){
            toplam+=arr[g];
        }
        System.out.println(toplam);



        //initials ilk har demek
        int carpma=1;
        char initials[]= new char[3];
        initials[0]='J';//74
        initials[1]='P';//80
        initials[2]='A';//65
        for (char w:initials) {
            carpma*=w;
        }
        System.out.println(carpma);//384800


    }//main
}//class
