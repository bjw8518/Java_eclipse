
public class OrderList {

    public void showList(Order[] order) {
        for (int j = 0; j < order.length; j++) {
            if (order[j] == null) {
                break;
            }
            System.out.println(order[j]);
        }
    }
}
