package kiosk5;

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
        /*

             // 각 메뉴 항목을 생성
                Menu burgerMenu = new Menu("Burgers");
                Menu drinkMenu = new Menu("Drinks");
                Menu dessertMenu = new Menu("Desserts");

                // Kiosk에 메뉴 리스트 전달
                List<Menu> menus = new ArrayList<>();
                menus.add(burgerMenu);  0
                menus.add(drinkMenu);   1
                menus.add(dessertMenu); 2


         */
        while (true) {
            System.out.println("[ MAIN MENU ]");

            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getName());
            }

            System.out.println("0. 종료");

            System.out.print("메뉴 번호를 선택: ");
            int start = scanner.nextInt();

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
    
    // 뒤로가기 기능 추가
    public void back(Menu menu) {

        while (true) {
            System.out.println("[ " + menu.getMenuBar() + " ]");

            for (int i = 0; i < menu.getMenuMap().size(); i++) {
                MenuItem item = menu.getMenuMap().get(i);
                System.out.printf("%d. %-15s | W %-2.1f | %s\n",
                        i + 1, item.getName(), item.getPrice(), item.getExplanation());
            }

            System.out.println("0. 뒤로 가기");

            System.out.print("메뉴 번호 선택: ");
            int back = scanner.nextInt();

            if (back == 1) {
                MenuItem menuItem = menu.getMenuMap().get(0);
                System.out.println("1. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (back == 2) {
                MenuItem menuItem = menu.getMenuMap().get(1);
                System.out.println("2. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (back == 3) {
                MenuItem menuItem = menu.getMenuMap().get(2);
                System.out.println("3. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (back == 4) {
                MenuItem menuItem = menu.getMenuMap().get(3);
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
