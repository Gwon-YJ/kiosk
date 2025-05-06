package kiosk7;

import java.util.*;

public class Menu {

    // 1. 속성
    private String name;
    private Map<Integer, MenuItem> menuMap;


    // 2. 생성자
    public Menu(String name, Enums.Menus category) {
        this.name = name;
        this.menuMap = new HashMap<>();

        // 메뉴 항목을 Map으로 처리
        switch (category) {
            case BURGERS -> {
                menuMap.put(0, new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
                menuMap.put(1, new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
                menuMap.put(2, new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
                menuMap.put(3, new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
            }
            case DRINKS -> {
                menuMap.put(0, new MenuItem("Coke", 2.5, "콜라"));
                menuMap.put(1, new MenuItem("Lemonade", 3.0, "레모네이드"));
                menuMap.put(2, new MenuItem("ChocolateLatte", 3.4, "초코렛, 우유의 조합이 어울리는 음료"));
                menuMap.put(3, new MenuItem("OrangeJuice", 3.2, "오렌지 주스"));
            }
            case DESSERTS -> {
                menuMap.put(0, new MenuItem("ChocolateCake", 4.5, "초콜릿 케이크"));
                menuMap.put(1, new MenuItem("StrawberryCake", 4.5, "딸기 케이크"));
                menuMap.put(2, new MenuItem("ApplePie", 3.7, "애플파이"));
                menuMap.put(3, new MenuItem("IceCream", 2.8, "아이스크림"));
            }
        }
    }

    // 3. 기능
    public String getName() {
        return name;
    }

    public Map<Integer, MenuItem> getMenuMap() {
        return menuMap;
    }

    // 메뉴 바 출력
    public String getMenuBar() {
        if (name.equals("Burgers")) {
            return "BURGERS MENU";
        } else if (name.equals("Drinks")) {
            return "DRINK MENU";
        } else if (name.equals("Desserts")) {
            return "DESSERT MENU";
        } else {
            return name;
        }
    }
}
