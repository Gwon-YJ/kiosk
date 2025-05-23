package kiosk1;

import java.util.Scanner;

public class Main {
    // 1. 속성
    
    // 2. 생성자
    
    // 3. 기능
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menu;
        
        // 메뉴 리스트
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료");
            
            // 입력
            System.out.print("메뉴를 입력하세요: ");
            menu = scanner.nextInt();
            
            // 출력
            if (menu == 1) {
                System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            } else if (menu == 2) {
                System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            } else if (menu == 3) {
                System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            } else if (menu == 4) {
                System.out.println("4.  Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            } else if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        scanner.close();
    }
}
