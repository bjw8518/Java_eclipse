package java_tutorials;

public class SSUM {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<100; i++) {
			if(i % 2 == 0) {
				sum = sum +(i+1);
			}
		}
		System.out.println(sum);

	}

}
