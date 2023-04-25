package pig;
public class Base {
    protected String name;
    protected double size;

    Base() {
        this.name = "도형";
    }

    protected void inputNumber() {

    }

    protected void calcSize() {

    }

    protected void printSize() {
        System.out.println(this.name + " size : " + this.size);
    }

    public void doAction() {
        this.inputNumber();
        this.calcSize();
        this.printSize();
    }
}
