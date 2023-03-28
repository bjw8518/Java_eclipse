import java.util.Arrays;
import java.util.Random;

public class Sort {
	public void doSort(){
int[] numbers = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};//여러개의 변수를 만들어준것
		
		Random random = new Random();
		for(int i =0;i<numbers.length;i++) {
			//numbers[i] = random.nextInt(100)+1;
			numbers[i] = (int)Math.floor(Math.random()* 100)+1;
		}
		
		System.out.println("전"+Arrays.toString(numbers));
		
		
		//정렬
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i] >numbers[j]) {
					int temp = numbers[i];
					numbers[i] =numbers[j];
					numbers[j]=temp;
				}
			}
		}
		System.out.println("후"+Arrays.toString(numbers));
	}
	}


