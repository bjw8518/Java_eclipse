package cote230327;

import java.awt.*;
import java.io.FileInputStream;
import java.util.*;


public class Quiz {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("src/inputDC.txt"));
		Scanner sc = new Scanner(System.in);

		int T;//3
		T = sc.nextInt();
		int N;//10,7,7
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			
			
			for(int i=0; i<N; i++) {
				System.out.println(sc.nextInt());
				
				
				}
			int[] sorrt = {sc.nextInt()};
			 
			
			for (int i = 0; i < sorrt.length; i++) {
				System.out.println(sorrt);
			    
			}
		}
		sc.close();
	}
	
}
