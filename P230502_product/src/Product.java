
public class Product {
    String name;
    int price;
    int quantity;
    int discount;

    Product(String name, int price, int quantity, int discount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return this.name + " " + this.price + "원"
                + " (" + this.quantity + ", " + this.discount + "%)";
    }
}
