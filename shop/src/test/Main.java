package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Product> products = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 9999; i++) {
            System.out.println("상품 관리 프로그램");
            System.out.println("1. 상품 등록");
            System.out.println("2. 상품 목록 출력");
            System.out.println("3. 상품 통계");
            System.out.println("q. 종료");
            System.out.print("메뉴를 선택하세요: ");
            String inputString = scanner.nextLine();

            if (inputString.equals("1")) {
                addProduct();
            } else if (inputString.equals("2")) {
                printProducts();
            }  else if (inputString.equals("3")) {
                stats();
            } else if (inputString.equals("q")) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private static void stats() {
    }

    private static void addProduct() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("새 상품 등록");
        System.out.print("상품명: ");
        String name = scanner.nextLine();

        System.out.print("가격: ");
        int price = Integer.parseInt(scanner.nextLine());

        System.out.print("재고: ");
        int stock = Integer.parseInt(scanner.nextLine());

        System.out.print("할인율 (0~1%)((ex)0.25%): ");
        double discountRate = Double.parseDouble(scanner.nextLine());


        Product product = new Product(name, price, stock, discountRate);
        products.add(product);
        System.out.println("상품이 등록되었습니다.");
    }

    private static void printProducts() {


        System.out.println("상품 목록");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println(product.getName() + "-" + product.getPrice() + "원 (할인율: " + product.getDiscountRate() * 100 + "%) - 재고: " + product.getStock());
        }
    }
}