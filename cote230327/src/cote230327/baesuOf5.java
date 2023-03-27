package cote230327;

public class baesuOf5 {

	public static void main(String[] args) {
		int i = 1;
		int result = 0;
		while(i<=100) {
			if(i % 3 == 0) {
				result += i;
			}
			i += 1;
		}
        System.out.println(result);  // 166833 출력


	}

}
