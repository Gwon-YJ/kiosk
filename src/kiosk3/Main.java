package kiosk3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // 1. 속성

    // 2. 생성자

    // 3. 기능
    public static void main(String[] args) {
        List<MenuItem> menu = new ArrayList<>();

        menu.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치츠버거"));
        menu.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리, 페퍼에 쉑소스가 포팅된 치즈버거"));
        menu.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menu.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본 치즈버거"));

        Kiosk kiosk = new Kiosk(menu);

        kiosk.start();
    }
}