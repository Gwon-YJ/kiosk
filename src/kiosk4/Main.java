package kiosk4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // 1. 속성

    // 2. 생성자

    // 3. 기능
    public static void main(String[] args) {
        
        List<MenuItem> burgers = new ArrayList<>();
        burgers.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        
        List<MenuItem> drinks = new ArrayList<>();
        drinks.add(new MenuItem("Coke", 2.5, "콜라"));
        drinks.add(new MenuItem("Lemonade", 3.0, "레모네이드"));
        drinks.add(new MenuItem("ChocolateLatte", 3.4, "초코렛, 우유의 조합이 어울리는 음료"));
        drinks.add(new MenuItem("OrangeJuice", 3.2, "오렌지 주스"));
        
        List<MenuItem> desserts = new ArrayList<>();
        desserts.add(new MenuItem("ChocolateCake", 4.5, "초콜릿 케이크"));
        desserts.add(new MenuItem("StrawberryCake", 4.5, "딸기 케이크"));
        desserts.add(new MenuItem("ApplePie", 3.7, "애플파이"));
        desserts.add(new MenuItem("IceCream", 2.8, "아이스크림"));
        
        List<Menu> menus = new ArrayList<>();
        menus.add(new Menu("Burgers", burgers));
        menus.add(new Menu("Drinks", drinks));
        menus.add(new Menu("Desserts", desserts));
        
        Kiosk kiosk = new Kiosk(menus);
        kiosk.start();
    }
}
