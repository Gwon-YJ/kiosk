package kiosk4;

public class MenuItem {

    // 1. 속성
    private String name;
    private double price;
    private String explanation;

    // 2. 생성자
    public MenuItem(String name, double price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }

    // 3. 기능
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getExplanation() {
        return explanation;
    }
}