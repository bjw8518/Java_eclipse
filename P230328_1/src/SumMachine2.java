public class SumMachine2 {

		public void makeSum(int startValue, int endValue) {
			int start = startValue;
			int end = endValue;
			int sum = 0;
			
			for(int i = start; i <= end ; i++) {
				sum = sum + i;
			}//end for
			
			System.out.println("시작값: "+start);
			System.out.println("종료값: "+end);
			System.out.println("총합: "+sum);
		}
		
		public static void main(String[] args) {
			SumMachine2 m = new SumMachine2();
			m.makeSum(1,100);
			m.makeSum(1,100);
			m.makeSum(1,100);
		}

}



