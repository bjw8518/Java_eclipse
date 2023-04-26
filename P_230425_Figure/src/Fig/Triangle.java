package Fig;

import java.util.Scanner;

public class Triangle extends Base {
    int width;
    int height;

    Triangle(){
        this.name= "삼각형";
    }
//    @Override//생략가능
//    protected void inputNumber(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("width:");
//        String inputString = sc.nextLine();
//        this.width = Integer.parseInt(inputString);
//        System.out.println("height:");
//        inputString = sc.nextLine();
//        this.height = Integer.parseInt(inputString);
//    }
        @Override
        protected void randomNumber(){
         this.width = (int) (Math.random()*100+1);
         this.height = (int) (Math.random()*100+1);

        }
    protected void calcSize(){
        this.size=this.height * this.width/2;
    }

}
