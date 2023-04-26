package pig;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Base[] b = new Base[10];

        for (int i = 0; i < b.length; i++) {
            System.out.println(i+"번째 도형을 선택해주세요");
            System.out.println("1. 삼각형, 2. 사각형 3. 원, q누르면 종료");
            Scanner sc = new Scanner(System.in);
            String inputString = sc.nextLine();
            if(inputString.equals("q")) {
                break;
            }else if(inputString.equals("1")){
                b[i] = new Triangle();
            } else if (inputString.equals("2")) {
                b[i] = new Square();
            } else if (inputString.equals("3")) {
                b[i] = new Circle();
            }else {
                System.out.println("입력이 잘못됬습니다");
            }
        }
        for (int i =0;i<b.length;i++){
            if(b[i]==null){
                continue;
            }
            System.out.println(""+i+"번쨰 도형");
            b[i].doAction();
        }
////		Base s1 = new Triangle();
////		s1.doAction();
//        b[0] = new Triangle();
//        b[0].doAction();
//
////		Base s2 = new Square();
////		s2.doAction();
//        b[1] = new Square();
//        b[1].doAction();
//
////		Base s3 = new Circle();
////		s3.doAction();
//        b[2] = new Circle();
//        b[2].doAction();
    }
}