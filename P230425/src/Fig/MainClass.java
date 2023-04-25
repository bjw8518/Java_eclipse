//1. 상속이란, 자식 클래스가 부모 클래스의 필드와 메소드를 물려받는 것을 의미한다.
//형식으로 쓸 때는 '자식 클래스 extends 부모 클래스' 의 형식으로 지정된다.
//자식 객체만 생성하고도 부모의 필드와 메소드 사용 가능함
//2. 자기 자신을 나타낼 때 this를 사용했다면, 부모를 나타낼 때는 super을 사용한다.
package Fig;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Base[] b = new Base[10];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<9999;i++) {
            System.out.println("[0] 0번째 도형은 무엇으로 할까요?");
            System.out.println("[Q] Q누를 시 종료");

            String inputMenu = scanner.nextLine();

            if(inputMenu.equals("q")) {
                break;
            }else if(inputMenu.equals("삼각형")){
                b[0] = new Triangle();
                b[0].doAction();
            }else if(inputMenu.equals("1")){
                b[0] = new Square();
                b[0].doAction();
            }else if(inputMenu.equals("2")){
                b[0] = new Triangle();
                b[0].doAction();
            }else if(inputMenu.equals("3")){
                b[0] = new Triangle();
                b[0].doAction();
            }else if(inputMenu.equals("4")){
                b[0] = new Triangle();
                b[0].doAction();
            }else if(inputMenu.equals("5")){
                b[0] = new Triangle();
                b[0].doAction();
            }else if(inputMenu.equals("6")) {
                b[0] = new Triangle();
                b[0].doAction();
            }else if(inputMenu.equals("7")) {
                b[0] = new Triangle();
                b[0].doAction();
            }else if(inputMenu.equals("8")) {
                b[0] = new Triangle();
                b[0].doAction();
            }else if(inputMenu.equals("9")) {
                b[0] = new Triangle();
                b[0].doAction();
            }else {
                System.out.println("입력이 잘못됬습니다");

            }
        }

//        Base s1 = new Triangle();
//        s1.doAction();
        //b[0] = new Triangle();//*****
        //b[0].doAction();//*****

//        Base s2 = new Square();
//        s2.doAction();
        //b[1] = new Square();//*****
        //b[1].doAction();//*****

//        Base s3 = new Circle();
//        s3.doAction();
        //b[2]= new Circle();//*****
        //b[2].doAction();//*****




    }
}

