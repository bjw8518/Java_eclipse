
public class git_test {

	public static void main(String[] args) {
		HelloWorld(5);
	}
		public static void HelloWorld(int n) {
			//n이 1인경우 리턴
			if(n ==0) {
				return;
			}
			System.out.println("Hello World");
			HelloWorld(n-1);
		}

}
