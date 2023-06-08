package javaders.day38enumsiterators;

public class EnumRunner {
    public static void main(String[] args) {

        String capitalOfIllinois = UsStatesEnum.ILLINOIS.getCapital();
        //UsStatesEnum.ILLINOIS.getCapital(); Enum'lari static gibi bu sekilde kullanabiliyoruz
        System.out.println(capitalOfIllinois);//Springfield

        String abbreviationOfFlorida = UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbreviationOfFlorida);//FL

        //Asagida state variable'inin data type'ini String yapinca hata aldik. Cunku bu UsStatesEnum.ALASKA bir enum
        //Enum'lar data type olarak da kullanildigi icin, asagidaki gibi yazdik.
        UsStatesEnum state = UsStatesEnum.ALASKA;
        System.out.println(state);//ALASKA (Bize enum'in adini dondurdu)
        //Enum'daki data'yi get method olmadan kullanirsaniz, data type'ini Enum yap
        // (Daha dogrusu direkt Enum'i kullanirsaniz olacak)

        String stateName = UsStatesEnum.getStateNameByUsingAbbreviation("AK");
        System.out.println(stateName);//Alaska

        String abbreviationOfAlaska = UsStatesEnum.getAbbreviationForStateName("Alaska");
        System.out.println(abbreviationOfAlaska);//AK

    }

}
