package pig;
import java.util.Random;

public class Square extends Base{
    private int width;
    private int height;

    Square() {
        this.name = "사각형";
    }

    @Override
    protected void inputNumber() {
        Random random = new Random();
        this.width = random.nextInt(100);
        this.height = random.nextInt(100);
    }

    @Override
    protected void calcSize() {
        this.size = this.height * this.width;
    }
}
