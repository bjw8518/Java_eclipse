package pig;
import java.util.Random;

public class Circle extends Base {
    private double half;

    Circle() {
        super();
        this.name = "원";
    }

    @Override
    protected void inputNumber() {
        Random random = new Random();
        this.half = random.nextInt(100);
    }

    @Override
    protected void calcSize() {
        this.size = this.half * this.half * Math.PI;
        // 312.1211121
        // 31212.11121
        // 31212
        // 312.12
        this.size = Math.round(this.size * 100) / (double)100;
    }

    @Override
    protected void printSize() {
        super.printSize();
        System.out.println("나는 원이야~~~");
    }
}
