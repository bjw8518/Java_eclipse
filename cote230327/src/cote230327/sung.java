package cote230327;

public class sung {

	public static void main(String[] args) {
		String name [] = {"A", "B", "C", "D", "E"};
        int[] kor = {50, 60, 70, 80, 90};
        int[] eng = {10, 70, 80, 90, 100};
        int[] math = {95, 80, 90, 85, 80};
        
        int total[] = new int[name.length];
        int rank[] = new int[name.length];
        
        for(int i=0; i<name.length; i++) {
            total[i] = kor[i] + eng[i] + math[i];
        }
        for(int i=0; i<name.length; i++) {
            int max = total[i];
            int maxIdx = i;
            for(int j=i+1; j<name.length; j++) {
                if(total [j] > max) {
                    max = total[j];
                    maxIdx = j;
                }
            }
            int temp = total[i];
            total[i] = total[maxIdx];
            total[maxIdx] = temp;
            
            rank[maxIdx] = i+1;
        }
        System.out.println("성적표");
        for(int i=0; i<name.length; i++) {
            System.out.println(rank[i] + "등: " + name[i] + " (총점: " + total[i] + ")");
        }
    }
}