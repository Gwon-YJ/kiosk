package kiosk7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // 1. 속성

    // 2. 생성자

    // 3. 기능
    public static void main(String[] args) {
        // 각 메뉴 항목을 생성
        Menu burgerMenu = new Menu("Burgers", Enums.BURGERS);
        Menu drinkMenu = new Menu("Drinks", Enums.DRINKS);
        Menu dessertMenu = new Menu("Desserts", Enums.DESSERTS);

        // Kiosk에 메뉴 리스트 전달
        List<Menu> menus = new ArrayList<>();
        menus.add(burgerMenu);
        menus.add(drinkMenu);
        menus.add(dessertMenu);

        // Kiosk 실행
        Kiosk kiosk = new Kiosk(menus);
        kiosk.start();
    }
}
