import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		Kaufu_jisu resultBmi = new Kaufu_jisu();
		Kaufu_jisu.resultBmi();
		
		Scanner scanner = new Scanner(System.in);
		double weight, height;
		
		System.out.println("체중을 입력하세요.");
		weight = scanner.nextDouble();
		
		System.out.println("신장을 입력하세요.");
		height = scanner.nextDouble();

		
		System.out.println(weight);
		System.out.println(height);
		
		double bmi = resultBmi(weight,height);
		System.out.println("당신의 카우프 지수는" +bmi+"입니다");
		
		
		//Sort sort = new Sort(); //new로 만들고 sort라는변수에 넣음
		//sort.doSort();
		//sort.abc(); //sort에게 doSort하라고 시킴
	}

	

	
}
