package kiosk2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // 1. 속성

    // 2. 생성자

    // 3. 기능
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치츠버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리, 페퍼에 쉑소스가 포팅된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본 치즈버거"));
        
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료");

            System.out.println("메뉴 번호를 선택");
            int menu = scanner.nextInt();

            if (menu == 1) {
                MenuItem menuItem = menuItems.get(0);
                System.out.println("1. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (menu == 2) {
                MenuItem menuItem = menuItems.get(1);
                System.out.println("2. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (menu == 3) {
                MenuItem menuItem = menuItems.get(2);
                System.out.println("3. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (menu == 4) {
                MenuItem menuItem = menuItems.get(3);
                System.out.println("4. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else  if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요");
            }
        }
        scanner.close();
    }
}
