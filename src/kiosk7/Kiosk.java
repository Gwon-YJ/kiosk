package kiosk7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 1. 속성
    private List<Menu> menus;
    private Scanner scanner;
    private List<CartItem> items;

    // 2. 생성자
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
        this.items = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    // 3. 기능 
    public void start() {

        while (true) {
            System.out.println("[ MAIN MENU ]");

            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getName());
            }
            
            if (!items.isEmpty()) {
                System.out.println("[ ORDER MENU ]");
                System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
                System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");
                System.out.print("선택: ");
            }

            System.out.println("0. 종료");

            System.out.print("메뉴 번호를 선택: ");
            int start = scanner.nextInt();

            if (start == 1) {
                back(menus.get(0));     // 메뉴 1번을 불러와라
            } else if (start == 2) {
                back(menus.get(1));     // 메뉴 2번을 불러와라
            } else if (start == 3) {
                back(menus.get(2));     // 메뉴 3번을 불러와라
            } else if (start == 4 && !items.isEmpty()) {
                order();    // order
            } else if (start == 5 && !items.isEmpty()) {
                clearCart(); // clear
            } else if (start ==트 
        public Enums.Discount customer() {
            System.out.println("\n[고객 유형 선택]");
            System.out.println("1. 국가유공자 (10% 할인)");
            System.out.println("2. 군인 (5% 할인)");
            System.out.println("3. 학생 (3% 할인)");
            System.out.println("4. 일반");

            System.out.print("번호를 선택하세요: ");
            int sale = scanner.nextInt();

            return switch (sale) {
                case 1 -> Enums.Discount.VETERAN;
                case 2 -> Enums.Discount.SOLDIER;
                case 3 -> Enums.Discount.STUDENT;
                default -> Enums.Discount.GENERAL;
            };
        }

    // order
    public void order() {
        System.out.println("[ Orders ]");
        for (CartItem cartItem : items) {
            System.out.printf("%s | W %.1f | 수량: %d\n", cartItem.getMenuItem().getName(),
                    cartItem.getMenuItem().getPrice(), cartItem.getQuantity());
        }

        // 총액 계산
        double totalPrice = 0;
        for (CartItem cartItem : items) {
            totalPrice += cartItem.getTotalPrice();
        }

        // 총액 출력
        System.out.println("\n[ Total ]");
        System.out.printf("W %.1f\n", totalPrice);

        // 고객 할인 유형 선택
        Enums.Discount discountCutomer = customer();
        // 할인 적용
        double discountRate = discountCutomer.getRate();
        double discountedPrice = totalPrice * (1 - discountRate);

        System.out.println("\n[ Total ]");
        System.out.printf("할인 전: W %.2f\n", totalPrice);
        System.out.printf("%s 할인(%.0f%%) 적용됨: W %.2f\n", discountCutomer, discountRate * 100, discountedPrice);

        // 주문할거냐 선택
        System.out.println("1. 주문      2. 메뉴판");
        System.out.print("선택: ");
        int order = scanner.nextInt();

        if (order == 1) {
            // 1번 선택시
            System.out.println("주문이 완료되었습니다. 금액은 W " +  discountedPrice  + " 입니다.");
            items.clear();
            // 2번 선택시
        } else if (order == 2) {
            System.out.println("메뉴판으로 돌아갑니다.");
            // 다른 번호 선택시
        } else {
            System.out.println("잘못된 숫자를 입력하였습니다.");
        }
    }
    
    // 청소
    public void clearCart() {
        items.clear();
    }
}
