package javaders.day43lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {
        

        Course turkishDay = new Course("Turkish Daytime QA", 213, "Spring", 97);
        Course turkishNight = new Course("Turkish Nighttime QA", 245, "Winter", 98);
        Course englishDay = new Course("English Daytime Java Dev", 121, "Spring", 91);
        Course englishNight = new Course("English Nighttime Java Dev", 137, "Winter", 95);

        List<Course> courseList = new ArrayList<>();
        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englishDay);
        courseList.add(englishNight);

        System.out.println(isAvgScoreGreaterThanANumber(courseList, 90));
        System.out.println();

        System.out.println(isAnyCourseNameContainsQa(courseList,"QA"));
        System.out.println();

        System.out.println(getCourseNameWhoseAvgMax(courseList));
        System.out.println();

        System.out.println(getCourseBetterThanLastTwo(courseList));
        System.out.println();

        System.out.println(getHighestThird(courseList));
        System.out.println();

        System.out.println(getCourseWhoseRegisteredStdLessThanANumber(courseList, 150));
        System.out.println();
    }//main

    //Example 1: Tum avarage score'larin 90'dan buyuk olup olmadigini kontrol eden method'u olusturunuz

    public static boolean isAvgScoreGreaterThanANumber (List<Course> courseList, int avg){
        return courseList.stream().allMatch(t->t.getAverageScore()>avg);
    }

    //Example 2: En az bir kurs isminin QA icerip icermedigini kontrol eden method'u olusturunuz

    public static boolean isAnyCourseNameContainsQa (List<Course> courseList, String word){
        return courseList.stream().anyMatch(t->t.getCourseName().contains(word));
    }

    //Example 3: En yuksek average score'a sahip kurs ismini veren code'u yaziniz.

    public static String getCourseNameWhoseAvgMax (List<Course> courseList){

        Course course = courseList.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get();

        /*
            Asagidaki sekilde de yapabilirsin
            return courseList.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get().getCourseName();
         */
        return course.getCourseName();

    }

    //Example 4: Avarage Score'u en dusuk olan ilk iki course disindaki tum kurslari return eden method'u olusturunuz

    public static List<Course> getCourseBetterThanLastTwo (List<Course> courseList){

        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2). // 2 tanesini atladedik bu method'da. Yani iki taneyi es gec
                collect(Collectors.toList()); //2 taneyi es gectikten sonra kalanlari list'e atadik bu method'lar

    }

    //Example 5: Avarage score'u ustten ucuncu olan course'u veren method'u olusturunuz

    public static Course getHighestThird (List<Course> courseList){

        return  courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()). //Yuksekten dusuge siraladdik
                skip(2). //Ilk ikisini atla dedik
                limit(1). //Sadece bir tane dondur (Geriye kalnalarin ilkini dondur)
                collect(Collectors.toList()).//list'e cevir
                get(0);//ilk elemani getir

    }

    //Example 6 : Ogrenci sayisi 150'den az olan kurslari return eden mehod'u olusturunuz.

    public static List<Course> getCourseWhoseRegisteredStdLessThanANumber(List<Course> courseList, int numOfStd){

        return courseList.stream().filter(t->t.getNumOfStudents()<numOfStd).collect(Collectors.toList());

    }









}//class
