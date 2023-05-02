import java.util.Scanner;

public class ProductList {
    public void modProduct(Product[] product) {
        for (int j = 0; j < product.length; j++) {
            System.out.println("" + j + " : " + product[j]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("수정을 원하는 상품 번호");
        String inputString = scanner.nextLine();
        int inputNumber = Integer.parseInt(inputString);
        System.out.println("현재 재고 : " + product[inputNumber].quantity);
        System.out.println("수정할 재고 갯수 : ");
        inputString = scanner.nextLine();
        product[inputNumber].quantity = Integer.parseInt(inputString);
    }

    public void statistics(Product[] product) {
        System.out.println("총 상품 갯수 : " + product.length);
        int priceTotal = 0;
        for (int j = 0; j < product.length; j++) {
            priceTotal = priceTotal + product[j].price;
        }
        double priceAvg = priceTotal / (double)product.length;
        System.out.println("평균 가격 : " + Math.round(priceAvg));
    }

    public void showList(Product[] product) {
        for (int j = 0; j < product.length; j++) {
            System.out.println(product[j]);
        }
    }

    public void showPriceHigh(Product[] product) {
        for (int i = 0; i < product.length - 1; i++) {
            for (int j = i + 1; j < product.length; j++) {
                if (product[i].price < product[j].price) {
                    Product tmp = product[i];
                    product[i] = product[j];
                    product[j] = tmp;
                }
            }
        }
        this.showList(product);
    }

    public void showPriceLow(Product[] product) {
        for (int i = 0; i < product.length - 1; i++) {
            for (int j = i + 1; j < product.length; j++) {
                if (product[i].price > product[j].price) {
                    Product tmp = product[i];
                    product[i] = product[j];
                    product[j] = tmp;
                }
            }
        }
        this.showList(product);
    }

    public void showDiscountHigh(Product[] product) {
        for (int i = 0; i < product.length - 1; i++) {
            for (int j = i + 1; j < product.length; j++) {
                if (product[i].discount < product[j].discount) {
                    Product tmp = product[i];
                    product[i] = product[j];
                    product[j] = tmp;
                }
            }
        }
        this.showList(product);
    }
}
