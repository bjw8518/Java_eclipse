
public class sosu {

	public static void main(String[] args) {
		for(int number =0;number<101;number++) {
			if(number<2) {
				continue;
			}
		
		
		boolean isPrime =true;
		
		for(int i = 0; i < number;i++) { //for (int i = 0; i<10;i++) 0~9 10번 반복
			if(i < 2) {
				continue;//바로 아래문장실행//특정한 스택을 뛰어넘고 싶을때
			}
			if(number % i == 0) {
				isPrime = false;
				break;//반복문을 빠져나가기위한
			}
		}
		
		if(isPrime) {
			System.out.println(number);
		}
		}
		//if()
	}

}
