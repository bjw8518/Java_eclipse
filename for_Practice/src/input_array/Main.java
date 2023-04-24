//키보드로부터 숫자를 입력받아서 1부터 입력받은 수만큼의 배열에 담아서 내용을 반복문 for를 사용하여 출력
package input_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1부터입력");
        Scanner sc = new Scanner(System.in);
        int scn = sc.nextInt();
        int []data = new int[scn];

        for (int i = 0; i < data.length; i++) {
            data[i] =(i+1);
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);

        }



    }
}
