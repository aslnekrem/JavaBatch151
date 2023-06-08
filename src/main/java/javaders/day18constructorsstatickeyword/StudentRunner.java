package javaders.day18constructorsstatickeyword;

import java.util.Arrays;

public class StudentRunner {
    public static void main(String[] args) {
        //static olan "numOfRegisteredStd" variable'ini cagirmak icin sadece class ismini kullandik, object olusturmadik
        System.out.println(Student.numOfRegisteredStd);//0

        //static olmayan "num" variable'ini cagirmak icin object olusturduk
        Student s1  = new Student();
        System.out.println(s1.num);//1

        //static olan "numOfRegisteredStd" variable'ina object uzerinden de ulasabilirsiniz ama bu hatadir
        System.out.println(s1.numOfRegisteredStd);



    }
}
