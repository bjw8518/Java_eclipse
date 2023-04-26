package cote_230327;

public class recursiveFunc {
    public static void main(String[] args) {
        printHello(0);
    }

    public static void printHello(int i){ //
        if(i>100)return; //100을 초과해서 무한루프
        System.out.println("Hello World");

        printHello(++i);
        //i += 1; 첫번째
        //printHello(i); 두번째


        //printHello(i++);
        //printHello(i) 첫번째
        //i += 1; 두번째
    }
}
