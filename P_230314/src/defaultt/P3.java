package defaultt;

import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {
        System.out.println("화면에 숫자를 입력해 주세요");
        Scanner s =  new Scanner(System.in); //new를 통해서 생성 System.in
        int n1 = s.nextInt();//s.nextInt로 값 가져오고 int n1에 스캐너로 받은값 담기

        System.out.println("입력받은숫자는 :" + n1 + "입니다");//n1 값 출력

    }

}
