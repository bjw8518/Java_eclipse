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
            int discountPrice = product[i].price * product[i].discount / 100;
            int sellPrice = product[i].price - discountPrice;
            printString = printString + " " + sellPrice + "원";
            printString = printString + " 재고 " + product[i].quantity + "개";
            System.out.println(printString);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("구매를 원하는 상품 번호 입력");
        String inputString = scanner.nextLine();
        int inputNumber = Integer.parseInt(inputString);
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
