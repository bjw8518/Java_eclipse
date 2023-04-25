package Fig;

import java.util.Scanner;

public class Circle extends Base {
    double half;

    Circle(){
        this.name= "원";
    }
//    @Override//생략가능
//    protected void inputNumber(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Half:");
//        String inputString = sc.nextLine();
//        this.half = Double.parseDouble(inputString);

    @Override
    protected void randomNumber(){
        ///////////////
        ///////////////
    }
    @Override//생략가능
    protected void calcSize(){
        this.size=this.half * Math.PI;
    }

//    @Override//생략가능
//    protected void printSize(){
//        super.printSize();
//        System.out.println("나는원이야");
//    }
}
