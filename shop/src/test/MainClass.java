package test;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    private static ArrayList<Product> products = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("상품 관리 프로그램");
            System.out.println("1. 상품 등록");
            System.out.println("2. 상품 목록 출력");
            System.out.println("3. 총 상품 수");
            System.out.println("4. 평균 가격");
            System.out.println("q. 종료");
            System.out.print("메뉴를 선택하세요: ");
            String inputString = scanner.nextLine();

            if (inputString.equals("1")) {
                addProduct();
            } else if (inputString.equals("2")) {
                printProducts();
            }  else if (inputString.equals("3")) {
                //productCount();
            }  else if (inputString.equals("4")) {
                //avgPrice
            } else if (inputString.equals("q")) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
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

        System.out.print("할인율 (0~1): ");
        double discountRate = Double.parseDouble(scanner.nextLine());


        Product product = new Product(name, price, stock, discountRate);
        products.add(product);
        System.out.println("상품이 등록되었습니다.");
    }

    private static void printProducts() {
        System.out.println("상품 목록");
        for (Product product : products) {
            System.out.println(product.getName() + "-" + product.getPrice() + "원 (할인율: " + product.getDiscountRate() * 100 + "%) - 재고: " + product.getStock());
        }
    }
}