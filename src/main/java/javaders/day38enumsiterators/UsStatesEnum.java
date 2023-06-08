package javaders.day38enumsiterators;

import java.util.Arrays;

public enum UsStatesEnum {
    /*

    Enum'lar degisme ihtimali olmayan sabit data'lari depolamak icin kullanilir. Mesela gun isimleri.

    Application'lar Stand alone olmalidir. Yani degismeyen data'lar Application'in icinde bulunmalidir.

    Enum'in icindeki data'lar degismez sabit datalar oldugu icin buyuk harfle yazilir.

    Sabit Data'yi koydugumuzda onunla ilgili detaylari parantez icinde yazabiliriz. Bu detaylari parantez icine
    yazdiginizda her bir detay icin variable olusturmamiz lazim. Cunku bu detaylar bir data'dir ve bu data'lari bir
    conteyner'a koymamiz gerekir. Private yapiyoruz cunku Enum'uzerinden ulasacagiz, final yapiyoruz cunku sabir bir
    data. Sonra Constructor olusturmaliyiz Getter'lari olusturmaliyiz, bunlar mutlaka olmasi gereken seyler. Sonra
    ihtiyac duydugumuz merhod'lari ekleyebiliriz. Proje'de ihtiyacin varsa ekstra method'a ekle yoksa eklemene gerek yok.



    */

    ALABAMA("Alabama", "AL", "Montgomery"),
    ALASKA("Alaska", "AK", "Juneau"),
    AMERICAN_SAMOA("American Samoa", "AS", "Pago Pago"),
    ARIZONA("Arizona", "AZ", "Phoenix"),
    ARKANSAS("Arkansas", "AR", "Little Rock"),
    CALIFORNIA("California", "CA", "Sacramento"),
    COLORADO("Colorado", "CO", "Denver"),
    CONNECTICUT("Connecticut", "CT", "Hartford"),
    DELAWARE("Delaware", "DE", "Dover"),
    DISTRICT_OF_COLUMBIA("District of Columbia", "DC", "Washington"),
    FLORIDA("Florida", "FL", "Tallahassee"),
    GEORGIA("Georgia", "GA", "Atlanta"),
    GUAM("Guam", "GU", "Hagatna"),
    HAWAII("Hawaii", "HI", "Honolulu"),
    IDAHO("Idaho", "ID", "Boise"),
    ILLINOIS("Illinois", "IL", "Springfield"),
    INDIANA("Indiana", "IN", "Indianapolis"),
    IOWA("Iowa", "IA", "Des Moines"),
    KANSAS("Kansas", "KS", "Topeka"),
    KENTUCKY("Kentucky", "KY", "Frankfort"),
    LOUISIANA("Louisiana", "LA", "Baton Rouge"),
    MAINE("Maine", "ME", "Augusta"),
    MARSHALL_ISLANDS("Marshall Islands", "", "Majuro"),
    MARYLAND("Maryland", "MD", "Annapolis"),
    MASSACHUSETTS("Massachusetts", "MA", "Boston"),
    MICHIGAN("Michigan", "MI", "Lansing"),
    MINNESOTA("Minnesota", "MN", "Saint Paul"),
    MISSISSIPPI("Mississippi", "MS", "Jackson"),
    MISSOURI("Missouri", "MO", "Jefferson City"),
    MONTANA("Montana", "MT", "Helena"),
    NEBRASKA("Nebraska", "NE", "Lincoln"),
    NEVADA("Nevada", "NV", "Carson City"),
    NEW_HAMPSHIRE("New Hampshire", "NH", "Concord"),
    NEW_JERSEY("New Jersey", "NJ", "Trenton"),
    NEW_MEXICO("New Mexico", "NM", "Santa Fe"),
    NEW_YORK("New York", "NY", "Albany"),
    NORTH_CAROLINA("North Carolina", "NC", "Raleigh"),
    NORTH_DAKOTA("North Dakota", "ND", "Bismarck"),
    NORTHERN_MARIANA_ISLANDS("Northern Mariana Islands", "MP", "Saipan"),
    OHIO("Ohio", "OH", "Columbus"),
    OKLAHOMA("Oklahoma", "OK", "Oklahoma City"),
    OREGON("Oregon", "OR", "Salem"),
    PENNSYLVANIA("Pennsylvania", "PA", "Harrisburg"),
    PUERTO_RICO("Puerto Rico", "PR", "San Juan"),
    RHODE_ISLAND("Rhode Island", "RI","Providence"),
    SOUTH_CAROLINA("South Carolina", "SC", "Columbia"),
    SOUTH_DAKOTA("South Dakota", "SD", "Pierre"),
    TENNESSEE("Tennessee", "TN", "Nashville"),
    TEXAS("Texas", "TX", "Austin"),
    US_VIRGIN_ISLANDS("US Virgin Islands", "VI", "Charlotte Amalie"),
    UTAH("Utah", "UT", "Salt Lake City"),
    VERMONT("Vermont", "VT", "Montpelier"),
    VIRGINIA("Virginia", "VA", "Richmond"),
    WASHINGTON("Washington", "WA", "Olympia"),
    WEST_VIRGINIA("West Virginia", "WV", "Charleston"),
    WISCONSIN("Wisconsin", "WI", "Madison"),
    WYOMING("Wyoming", "WY", "Cheyenne");

    private final String stateName;
    private final String abbreviation;//abbreviation kisaltma demek
    private final String capital;

    //My Notes: Sanirim final'lara disaridan ulasamadigimiz icin constructor olusturmak zorunda kaldik. Constructor'i
                //olusturduktan sonra, 3 tane final variable olusturmustuk bu final'leri sirasiyla Enun'larin  icine
                //silik bir sekilde yazdi.

    UsStatesEnum(String stateName, String abbreviation, String capital) {
        this.stateName = stateName;
        this.abbreviation = abbreviation;
        this.capital = capital;
    }

    public String getStateName() {
        return stateName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getCapital() {
        return capital;
    }

    //State kisaltmasini verince state'in ismini veren method
    public static String getStateNameByUsingAbbreviation(String abbreviation){
        return Arrays.stream(values())
                .filter(usState -> usState.getAbbreviation().equals(abbreviation))
                .findFirst().get().getStateName();
    }

    //State ismini verince state'in kisaltmasini veren method
    public static String getAbbreviationForStateName(String stateName) {
        return Arrays.stream(values())
                .filter(usState -> usState.getStateName().equals(stateName))
                .findFirst().get().getAbbreviation();
    }




}//enum
