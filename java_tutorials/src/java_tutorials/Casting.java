package java_tutorials;

public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; //손실이없으면 *자동*으로 변환할수있음
		double b2 = (double)1; //위에거 *수동*
		
		System.out.println(b);
		
		//int c = 1.1; //double형은 
		double d = 1.1; //손실이일어남
		int e = (int) 1.1; //1이 나옴,손실
		System.out.println(e);
		
		System.out.println(b2);
		
		  // 1 to String 
        String f = Integer.toString(1);
        System.out.println(f.getClass());
        
//        1. 실제 팀단위에서 개발할때는 자료형을 제대로 인지하지 못해서 나는 에러가 허다하므로, 자바에서는 명확하게 형 구분을 하는거 같고요.
//
//        2. 변수 이름은 누가 봐도 알수 있도록 정해야 하고
//
//        3. 형변환은 다음처럼 생각하면 쉬울꺼 같습니다.
//
//        - 문자를 숫자로 변경할 수 있느냐? = 아니오
//        - 숫자를 문자로 변경할 수 있으냐? = 네
//
//        - 더큰 범위의 실수를 정수로 자동변환해주냐? = 아니오
//        - 그럼 어떻게 하나? = 개발자가 명시적으로 형변환을 해준다 (int) x
//
//        - 정수는 실수가 될때 뒤에 .0만 붙히면 되므로 자동변환을 해준다 = 예
//        - 자동변환되어도 명시적으로 형변환도 가능하다 = 예
	}

}
