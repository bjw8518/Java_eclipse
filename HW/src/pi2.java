
public class pi2 {
	
	public static int  fi(int number) {
		if(number ==1) {
			return 1;
		}else if(number==2){
			return 1;
		}
		else {
			return fi(number-1)+fi(number -2);
		}
	}

	public static void main(String[] args) {
		System.out.println(fi(10));
		
		

	}

}
