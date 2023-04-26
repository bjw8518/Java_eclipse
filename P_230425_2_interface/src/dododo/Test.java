package dododo;

public class Test implements I1, I2{ // Extends java.lang.object


    public void doAction(){
        System.out.println("Hello");
    }
    public void doAction(int number){
        System.out.println("hello"+number);
    }
    public void doAction(String name){
        System.out.println("hello"+name);
    }
    public void doAction(int num1, int num2){
        System.out.println("hello"+num1+num2);
    }
    public String toString(){
        System.out.println("92929");
        return "asffsa";
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}
