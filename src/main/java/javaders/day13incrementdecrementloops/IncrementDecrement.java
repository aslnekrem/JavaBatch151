package javaders.day13incrementdecrementloops;

public class IncrementDecrement {
    public static void main(String[] args) {
        //Increment  : anlami arttirmak
        int a = 5;
        System.out.println(a);//5
        a = a + 2;
        System.out.println(a);//7
        a += 2;

        //Example 1: Bir tane integer variable olusturun ve onu iki sekilde 5 arttirin
        int b = 0;
        b = b + 5;
        b += 5;

        //Decrement

        int c = 8;
        System.out.println("c = " + c);//8
        c = c - 3;
        System.out.println("c = " + c);//5
        c-=3;
        System.out.println("c = " + c);//2

        //Increment2

        int d = 6;
        System.out.println("d = " + d);//6
        d = d*2;
        System.out.println("d = " + d);//12
        d*=2;
        System.out.println("d = " + d);//24

        int e = 24;
        System.out.println("e = " + e);
        e = e/2;
        System.out.println("e = " + e);
        e/=2;
        System.out.println("e = " + e);

        //"1" ile increment

        int f = 12;
        System.out.println("f = " + f);//12
        f = f+1;
        System.out.println("f = " + f);//13
        f+=1;
        System.out.println("f = " + f);//14
        f++;
        System.out.println("f = " + f);//15

        //"1" ile decrement

        int h = 10;
        System.out.println("h = " + h);//10
        h = h-1;
        System.out.println("h = " + h);//9
        h-=1;
        System.out.println("h = " + h);//8
        h--;
        System.out.println("h = " + h);//7

        //post-increment  ve   pre-increment

        int i = 10;
        int k = i++;    //Post increment
        System.out.println("k = " + k);//10  Once atamayi yapip sonra increment yapiyor bu yuzden k 10 oldu
        //Post increment de once atamayi yapiyor sonra arttiriyor ama arttirmadan atadigi icin arttirilmamis hali
        //ataniyor
        System.out.println("i = " + i);//11  Yukarida arttirma yaptigi icin simdi 11 oldu



        int j = 50;
        int l= ++j;     //Pre-increment
        System.out.println("l = " + l);//51 Once arttirip sonra atama yaptigi icin 51 cikti
        //Pre increment de once arttirip sonra atamayi yapiyor

        int p = 17;
        int r = p--;
        System.out.println("p = " + p);//16
        System.out.println("r = " + r);//17

        int s = 20;
        int t = --s;
        System.out.println("s = " + s);//19
        System.out.println("t = " + t);//19

        /*
        * 1) Increment arttirmak demektir. Decrement azaltmak demektir
        * 2) Increment toplama ve carpma ile Decrement cikarma ya da bolme ile yapilabilir
        * 3) Increment ve Decrement 3 yolla yapilabilir
        *       a) int i = 12; ==> i = i+5;
        *       b) int i = 12; ==> i +=5;
        *       c) int i = 12; ==> i++;
        *           Note: 3. yol sadece 1 arttirmak icin kullanilabilir
        *
         */




    }//main
}//class
