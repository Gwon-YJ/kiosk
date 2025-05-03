package kiosk6;

public class CartItem {

    // 1. 속성
    private MenuItem menuItem;
    private int quantity;

    // 2. 생성자
    public CartItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    // 3. 기능
    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return menuItem.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return menuItem.getName() + " | 수량: " + quantity + " | 가격: W " + getTotalPrice();
    }
}