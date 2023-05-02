import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Product[] product = {
                new Product("양말", 1000, 2, 5),
                new Product("티셔츠", 10000, 10, 0),
                new Product("치마", 50000, 5, 10),
                new Product("넥타이", 20000, 8, 20),
                new Product("와이셔츠", 30000, 7, 15),
                new Product("운동화", 100000, 2, 8),
                new Product("구두", 200000, 2, 7),
                new Product("단화", 80000, 1, 25),
                new Product("선글래스", 150000, 2, 85),
                new Product("밀집모자", 8000, 20, 95),
                new Product("야구모자", 5000, 12, 5),
                new Product("중절모", 10000, 9, 65),
                new Product("비니", 9000, 8, 6),
        };
        Order[] order = new Order[99999];
        int orderIndex = 0;

        Scanner scanner = new Scanner(System.in);
        ProductList productList = new ProductList();
        OrderList orderList = new OrderList();
        for (int i = 0; i < 999999; i++) {
            System.out.println("----- 원하시는 기능 선택 ------");
            System.out.println("1. 상품 목록");
            System.out.println("2. 상품 목록 (가격 높은 순)");
            System.out.println("3. 상품 목록 (가격 낮은 순)");
            System.out.println("4. 상품 목록 (할인율 높은 순)");
            System.out.println("5. 통계");
            System.out.println("6. 주문");
            System.out.println("7. 주문 목록 출력");
            System.out.println("8. 상품 수정 (재고 수정)");
            System.out.println("9. 주문 수정 (배송정보 수정)");
            System.out.println("q. 종료");
            String selectMenu = scanner.nextLine();
            if (selectMenu.equals("q")) {
                break;
            } else if (selectMenu.equals("1")) {
                productList.showList(product);
            } else if (selectMenu.equals("2")) {
                productList.showPriceHigh(product);
            } else if (selectMenu.equals("3")) {
                productList.showPriceLow(product);
            } else if (selectMenu.equals("4")) {
                productList.showDiscountHigh(product);
            } else if (selectMenu.equals("5")) {
                productList.statistics(product);
            } else if (selectMenu.equals("6")) {
                order[orderIndex] = new Order();
                order[orderIndex].doOrder(product);
                orderIndex++;
            } else if (selectMenu.equals("7")) {
                orderList.showList(order);
            } else if (selectMenu.equals("8")) {
                productList.modProduct(product);
            } else if (selectMenu.equals("9")) {
                orderList.modOrder(order);
            }
        }
    }
}
