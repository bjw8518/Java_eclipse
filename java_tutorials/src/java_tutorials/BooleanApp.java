package java_tutorials;

public class BooleanApp {

	public static void main(String[] args) {
		String a = "1";
		System.out.println("one");
		System.out.println(1);
		
		System.out.println(true);
		System.out.println(false);
		
		String foo = "Hello world";
		//String true = "Hello World"; //예약어
		
		System.out.println(foo.contains("world"));//String foo에 world가 있으므로 True.
		System.out.println(foo.contains("jinwoo"));//String foo에 jinwoo가 없으므로 False.
		
	}

}
