import java.util.Scanner;

public class OrderList {
    public void modOrder(Order[] order) {
        for (int j = 0; j < order.length; j++) {
            if (order[j] == null) {
                break;
            }
            System.out.println("" + j + " : " + order[j]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("수정을 원하는 주문 번호");
        String inputString = scanner.nextLine();
        int inputNumber = Integer.parseInt(inputString);
        System.out.println("수정할 주문자 연락처 : ");
        order[inputNumber].billingPhone = scanner.nextLine();
        System.out.println("수정할 주문자 배송지 : ");
        order[inputNumber].billingAddress = scanner.nextLine();
    }

    public void showList(Order[] order) {
        for (int j = 0; j < order.length; j++) {
            if (order[j] == null) {
                break;
            }
            System.out.println(order[j]);
        }
    }
}
