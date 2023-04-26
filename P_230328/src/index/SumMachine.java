package index;


public class SumMachine {
    public int makeSum(int start, int end) {
        int total = 0;
        for (int i = start; i < end + 1; i++) {
            total = total + i;
        }

//		System.out.println("" + start + "부터 " + end
//				+ "까지의 합은 " + total);

        return total;
    }
}
