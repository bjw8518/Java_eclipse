import java.util.Scanner;

public class Order {
    String productName;
    int billingPrice;
    String billingName;
    String billingPhone;
    String billingAddress;

    public void doOrder(Product[] product) {
        for(int i = 0; i < product.length; i++) {
            String printString = "" + i + " : ";
            printString = printString + product[i].name;
            if (product[i].quantity > 0) {
                int discountPrice = product[i].price * product[i].discount / 100;
                int sellPrice = product[i].price - discountPrice;
                double sp2 = sellPrice / (double)10;
                sp2 = Math.ceil(sp2);
                sellPrice = (int)sp2 * 10;
                printString = printString + " " + sellPrice + "원";
                printString = printString + " 재고 " + product[i].quantity + "개";
            } else {
                printString = printString + " 품절";
            }
            System.out.println(printString);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("구매를 원하는 상품 번호 입력");
        String inputString = scanner.nextLine();
        int inputNumber = Integer.parseInt(inputString);
        if (product[inputNumber].quantity < 1) {
            System.out.println("품절된 상품입니다.");
            return;
        }
        this.productName = product[inputNumber].name;
        int discountPrice = product[inputNumber].price * product[inputNumber].discount / 100;
        int sellPrice = product[inputNumber].price - discountPrice;
        this.billingPrice = sellPrice;
        product[inputNumber].quantity--;

        System.out.println("주문자 이름 : ");
        this.billingName = scanner.nextLine();
        System.out.println("주문자 연락처 : ");
        this.billingPhone = scanner.nextLine();
        System.out.println("배송지 : ");
        this.billingAddress = scanner.nextLine();
    }

    @Override
    public String toString() {
        return this.productName + ", " + this.billingPrice + ", " + this.billingName + ", " + this.billingPhone + ", " + this.billingAddress;
    }

}
