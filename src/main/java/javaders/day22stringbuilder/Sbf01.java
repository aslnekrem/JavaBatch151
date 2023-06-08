package javaders.day22stringbuilder;

public class Sbf01 {
    /*
        1) StringBuffer Java'da String ureten bir Class'dir
        2) StringBuffer, StringBuilder'a cok benzer, yani ikisi de "mutable" String uretir
        3) StringBuffer "multi-thread" dir ama StringBuilder "multi-thread" deggildir. multi-thread (coklu is)
        4) Java StringBuffer'i, StringBuilder'dan once olusturdu
        5) StringBuilder multi-thread olmadigi icin StrinBuffer'dan daha hizli calisir
            //Multi-thread kullanmayacaksan StringBuilder kullan cunku app yavas calisir

            3 tane String olusturan Class ogrendik:
                1)immutable string lazimsa String Class
                2)mutable string lazimsa; String Builder veya StringBuffer
                                        1)StringBuilder'i multi-thread gerekmezse kullaniriz
                                        2)StringBuffer'i multi-thread gerekirse kullaniriz

        6)"multi-thread yapilirken yapilan islerin siralamasi onem arzeder, yapilan isleri mantikli bir
          siraya koymak "synchronization" olarak adlandirilir.
          Corba 40 salata 15 tatli 30 ... Corbdan baslriz yapmaya en uzun o oldugu icin o arada digerleri de biter
          StringBuffer "multi-thread" oldugu icin ayni zamanda "synchronized"dir.

     */

    public static void main(String[] args) {

        StringBuffer sbf1 = new StringBuffer("Java");














    }//main
}//class
