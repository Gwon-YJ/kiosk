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

    // 메뉴 바 출력
    public String getmenuBar() {
        if (menuName.contains("Burgers")) {
            return "BURGERS MENU";
        } else if (menuName.contains("Drinks")) {
            return "DRINK MENU";
        } else if (menuName.contains("Desserts")) {
            return "DESSERT MENU";
        } else {
            return menuName;
        }
    }
}
