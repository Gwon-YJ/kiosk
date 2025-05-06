package kiosk6;

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
            } else if (start == 0) {
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
            System.out.println("[ " + menu.getMenuBar() + " ]");

            for (int i = 0; i < menu.getMenuMap().size(); i++) {
                MenuItem item = menu.getMenuMap().get(i);
                System.out.printf("%d. %-15s | W %-2.1f | %s\n",
                        i + 1, item.getName(), item.getPrice(), item.getExplanation());
            }

            System.out.println("0. 뒤로 가기");

            System.out.print("메뉴 번호 선택: ");
            int back1 = scanner.nextInt();
            if (back1 == 1) {
                MenuItem menuItem = menu.getMenuMap().get(0);
                System.out.println("1. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (back1 == 2) {
                MenuItem menuItem = menu.getMenuMap().get(1);
                System.out.println("2. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (back1 == 3) {
                MenuItem menuItem = menu.getMenuMap().get(2);
                System.out.println("3. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (back1 == 4) {
                MenuItem menuItem = menu.getMenuMap().get(3);
                System.out.println("4. " + menuItem.getName() + "  | W " + menuItem.getPrice() + " | " + menuItem.getExplanation());
            } else if (back1 == 0) {
                System.out.println("프로그램을 종료합니다.");
                return;
            } else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요");
            }

            // 장바구니 기능 추가가
            MenuItem cart = menu.getMenuMap().get(back1 - 1);
            System.out.printf("\n\"%s | W %.1f | %s\"\n", cart.getName(), cart.getPrice(), cart.getExplanation());
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인        2. 취소");
            System.out.print("선택: ");
            int back2 = scanner.nextInt();

            // 중복일 때 수량 증가하도록
            if (back2 == 1) {
                boolean isExist = false;

                for (CartItem cartItem : items) {
                    if (cartItem.getMenuItem().getName().equals(cart.getName())) {
                        cartItem.plus();  // 수량만 증가
                        isExist = true;
                        break;
                    }
                }

                if (!isExist) {
                    items.add(new CartItem(cart, 1));  // 처음 추가할 때만 넣기
                }

                System.out.println(cart.getName() + " 이 장바구니에 추가되었습니다.\n");
            } else {
                System.out.println("추가되지 않았습니다.\n");
                return;
            }
        }
    }

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

        // 주문할거냐 선택
        System.out.println("1. 주문      2. 메뉴판");
        System.out.print("선택: ");
        int order = scanner.nextInt();

        if (order == 1) {
            // 1번 선택시
            System.out.println("주문이 완료되었습니다. 금액은 W " + totalPrice + " 입니다.");
            items.clear();
            // 2번 선택시
        } else if (order == 2) {
            System.out.println("메뉴판으로 돌아갑니다.");
            // 다른 번호 선택시
        } else {
            System.out.println("잘못된 숫자를 입력하였습니다.");
        }
    }

    public void clearCart() {
        items.clear();
    }
}
