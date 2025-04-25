package kiosk4;

import java.util.List;

public class Menu {

    // 1. 속성
    private String menuName;
    private List<MenuItem> items;

    // 2. 생성자

    public Menu(String menuName, List<MenuItem> items) {
        this.menuName = menuName;
        this.items = items;
    }
    // 3. 기능
    public String getMenuName() {
        return menuName;
    }

    public List<MenuItem> getItems() {
        return items;

    }
}