package advanced_practice.day06;

public class MenuItem {

    //Yiyeceklerin kodu ismi ve ucreti olsun

    private int code;
    private String name;
    private double price;

    public MenuItem() {
    }

    public MenuItem(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
