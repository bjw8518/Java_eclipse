package java_cote0;

public class CT_array2 {

	public static void main(String[] args) {
		int a1 =1;
		int a2 =2;
		int a3 =3;
		
		double b[] = {1.1,1.2,1.3,1.4};
		
		int a[] = {1,2,3};
		
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//cannot convert form Stirng[] to String//설명 꼭 보기
		String str[] = {"Mon","Tue","Wed"};
		for(int i=0;i<str.length+1;i++) {
			System.out.println(str[i]);
		}
		

	}

}
