package kiosk3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 1. 속성
    private List<MenuItem> menuItems;
    private Scanner scanner = new Scanner(System.in);

    // 2. 생성자
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    
    // 3. 기능
    public void start() {

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");

            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.printf("%d. %-12s | W %-2.1f | %s\n",
                        i + 1, item.getName(), item.getPrice(), item.getExplanation());
            }
            
            System.out.println("0. 종료");
            
            // 입력
            System.out.println("메뉴 번호를 선택");
            int start = scanner.nextInt();

            // 출력
            if (start == 1) {
                back();
                MenuItem menuItem = menuItems.get(0);
                System.out.println("1. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (start == 2) {
                MenuItem menuItem = menuItems.get(1);
                System.out.println("2. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (start == 3) {
                MenuItem menuItem = menuItems.get(2);
                System.out.println("3. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (start == 4) {
                MenuItem menuItem = menuItems.get(3);
                System.out.println("4. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
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
    public void back() {
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");

            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.printf("%d. %-12s | W %-2.1f | %s\n",
                        i + 1, item.getName(), item.getPrice(), item.getExplanation());
            }
            
            System.out.println("0. 뒤로가기");
            
            System.out.print("메뉴 번호 선택");
            int back = scanner.nextInt();
            
            // 출력
            if (back == 1) {
                MenuItem menuItem = menuItems.get(0);
                System.out.println("1. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (back == 2) {
                MenuItem menuItem = menuItems.get(1);
                System.out.println("2. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (back == 3) {
                MenuItem menuItem = menuItems.get(2);
                System.out.println("3. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (back == 4) {
                MenuItem menuItem = menuItems.get(3);
                System.out.println("4. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (back == 0) {
                System.out.println("처음으로 돌아갑니다.");
                return;
            } else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요");
            }
        }
    }
}
