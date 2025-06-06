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

            // 입력
            System.out.print("메뉴 번호를 선택: ");
            int start = scanner.nextInt();
            
            // 출력
            if (start == 1) {
                back(menus.get(0));
            } else if (start == 2) {
                back(menus.get(1));
            } else if (start == 3) {
                back(menus.get(2));
            } else if (start == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요");
            }
        }
        scanner.close();
    }
    
    // 뒤로가기
    public void back(Menu menu) {

        while (true) {
            System.out.println("[ " + menu.getmenuBar() + " ]");

            for (int i = 0; i < menu.getItems().size(); i++) {
                MenuItem item = menu.getItems().get(i);
                System.out.printf("%d. %-15s | W %-2.1f | %s\n",
                        i + 1, item.getName(), item.getPrice(), item.getExplanation());
            }

            System.out.println("0. 뒤로 가기");

            // 입력
            System.out.print("메뉴 번호 선택: ");
            int back = scanner.nextInt();
            
            // 출력
            if (back == 1) {
                MenuItem menuItem = menu.getItems().get(0);
                System.out.println("1. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (back == 2) {
                MenuItem menuItem = menu.getItems().get(1);
                System.out.println("2. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (back == 3) {
                MenuItem menuItem = menu.getItems().get(2);
                System.out.println("3. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (back == 4) {
                MenuItem menuItem = menu.getItems().get(3);
                System.out.println("4. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (back == 0) {
                System.out.println("프로그램을 종료합니다.");
                return;
            } else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요");
            }
        }
    }
}
