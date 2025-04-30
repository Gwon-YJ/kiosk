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
            System.out.println("[ " + menu.getmenuBar() + " ]");
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

            MenuItem cart = menu.getItems().get(menu1 - 1);
            System.out.printf("\n\"%s | W %.1f | %s\"\n", cart.getName(), cart.getPrice(), cart.getExplanation());
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인        2. 취소");
            System.out.print("선택: ");
            int menu2 = scanner.nextInt();

            if (menu2 == 1) {
                CartItem cartItem = new CartItem(cart, 1);
                items.add(cartItem);
                System.out.println(cart.getName() + " 이 장바구니에 추가되었습니다.\n");
            } else {
                System.out.println("추가되지 않았습니다.\n");
            }

            if (!items.isEmpty()) {
                System.out.println("[ ORDER MENU ]");
                System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
                System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");
                System.out.print("선택: ");
                int orderMenu = scanner.nextInt();


                if (orderMenu == 4) {
                    System.out.println("[ Orders ]");
                    for (CartItem cartItem : items) {
                        System.out.printf("%s | W %.1f | 수량: %d\n", cartItem.getMenuItem().getName(),
                                cartItem.getMenuItem().getPrice(), cartItem.getQuantity());
                    }

                    double totalPrice = 0;
                    for (CartItem cartItem : items) {
                        totalPrice += cartItem.getTotalPrice();
                    }

                    System.out.println("\n[ Total ]");
                    System.out.printf("W %.1f\n", totalPrice);
                    System.out.println("1. 주문      2. 메뉴판");
                    System.out.print("선택: ");
                    int menu3 = scanner.nextInt();


                    if (menu3 == 1) {
                        System.out.println("주문이 완료되었습니다. 금액은 W " + totalPrice + " 입니다.");
                        items.clear();
                    } else if (menu3 == 2) {
                        System.out.println("메뉴판으로 돌아갑니다.");
                    } else {
                        System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
                    }
                } else if (orderMenu == 5) {
                    System.out.println("진행 중인 주문이 취소가 되었습니다.");
                    items.clear();
                } else {
                    System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
                }
            } else {
                System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
            }
        }
    }
}