package javaders.day37exceptionsenums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionRunner {

    

    
    
    
    /*
        1)try kullandigimizda her senaryo icin calismasini istedigimiz kodlari finally block icine koyariz
        2)IWQ: "final", "finally" ve "finalize" aciklar misiniz?
            "final" aciklandi.
            "finally" aciklandi"
            "finalize" : Garbage Collector memory'i temiz tutmak icin surekli memory'i tarar ve silinmesi gerekenleri siler
                       : "Garbage Collector" silmeden once silecegi data'lari "finalize" eder sonra siler
                        My Notes:finalize:  Memory'e lazim olanlari koymaliyiz. Ucuz televizyon bulduk diye 10
                        televizyon alip eve koymayiz. Java, memory'i temiz tutar. Surekli olarak memory'i tarar ve
                        fazlalik bulursa onu siler. "Garbage Collector" bu isi yapar. Java silinmesi gerekenleri once
                        bir posete koyar, onu baglar ve cope atar gibi bir islem yapar.  Iste bu isleme finalize denir.
     */

    //Example 1: Ogrenci notlarini bir List'e ekleyen methodu olusturunuz


    public static void main(String[] args) throws IllegalGradeException {

        //System.out.println(getGrades());
        try {
            printAge(-45);
        }catch (IllegalAgeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I always work");
        }


    }//main

    public static List<String> getGrades() throws IllegalGradeException {

        List<String> grades = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        String grade;

        do {
            System.out.println("Please enter the grade. To stop entering press q.");
            grade = input.next();

            int intGrade = 0;

            if (!grade.equals("q")){
                intGrade = Integer.valueOf(grade);
            }

            if (grade.equals("q")){
                break;
            } else if(intGrade>=0 && intGrade<=100){
                grades.add(grade);
            }else{
                throw new IllegalGradeException("Grades less than zero and greater than 100 are not valid.");
            }

            //Bizim yaptigimiz Exception CTE. Bu yuzden altini kirmizi cizdi.
                //Sonradan More'dan method signature'i sectik ve method'a throw yazdi.

        }while(!grade.equals("q"));

        return grades;
    }

    //Example 2: Kullanicinin yasini console'a yazdiran method'u olusturunuz.

    public static void printAge(int age){
        if (age<0){
            throw new IllegalAgeException("Ages cannot be negative..");
        }
        System.out.println(age);
    }











}
