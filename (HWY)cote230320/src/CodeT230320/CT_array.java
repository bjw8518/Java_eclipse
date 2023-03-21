package CodeT230320;

public class CT_array {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		num[0] = 2;
		num[1] = 3;
		num[2] = -1;
		num[3] = 5;
		num[4] = 4;
		//초기화를 어떻게 해야하냐
		//최소값을 담을 변수를 초기화 할때는 ...값으로 초기화 해야한다
		//최대값을 담을 변수를 초기화 할때는 ...값으로 초기화 해야한다
		int min =Integer.MAX_VALUE;
		int max =Integer.MIN_VALUE;
		//local variable min have been initialized
		
		for (int i = 0;i<num.length;i++) {	//num의 인덱스만큼 반복
			if(num[i]<min) min = num[i];	//
			if (num[i]>max) max = num[i];
		}

		
		System.out.println("Max Value is "+max);
		System.out.println("Max Value is "+min);
		//Max Value is 5 에러
		//Max Value is 0
		
		
	}

}
