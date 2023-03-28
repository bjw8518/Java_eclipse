import java.util.Arrays;
import java.util.Random;

public class ExecClass {

	public static void main(String[] args) {
		int[] numbers = {0,0,0,0,0,0,0,0,0,0};
		Random random = new Random();
		for(int i =0;i<numbers.length;i++) {
			//numbers[i] = random.nextInt(100)+1;
			numbers[i] = (int)Math.floor(Math.random()* 100)+1;
		}
		System.out.println(Arrays.toString(numbers));
		
	}
}
