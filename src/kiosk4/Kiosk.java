package kiosk4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 1. 속성
    private List<Menu> menus;
    private Scanner scanner;

    // 2. 생성자
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
        this.scanner = new Scanner(System.in);
    }

    // 3. 기능
    public void start() {

        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getMenuName());
            }
            System.out.println("0. 종료");

            System.out.print("메뉴 번호를 선택: ");
            int menustr = scanner.nextInt();

            if (menustr == 1) {
                back(menus.get(0));
            } else if (menustr == 2) {
                back(menus.get(1));
            } else if (menustr == 3) {
                back(menus.get(2));
            } else if (menustr == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요");
            }
        }

        scanner.close();
    }

    public void back(Menu menu) {

        while (true) {
            System.out.println("[ MAIN MENU ]");

            for (int i = 0; i < menu.getItems().size(); i++) {
                MenuItem item = menu.getItems().get(i);
                System.out.printf("%d. %-15s | W %-2.1f | %s\n",
                        i + 1, item.getName(), item.getPrice(), item.getExplanation());
            }
            System.out.println("0. 뒤로 가기");

            System.out.print("메뉴 번호 선택: ");
            int menu1 = scanner.nextInt();

            if (menu1 == 1) {
                MenuItem menuItem = menu.getItems().get(0);
                System.out.println("1. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (menu1 == 2) {
                MenuItem menuItem = menu.getItems().get(1);
                System.out.println("2. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (menu1 == 3) {
                MenuItem menuItem = menu.getItems().get(2);
                System.out.println("3. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (menu1 == 4) {
                MenuItem menuItem = menu.getItems().get(3);
                System.out.println("4. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (menu1 == 0) {
                System.out.println("프로그램을 종료합니다.");
                return;
            } else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요");
            }
        }
    }
}