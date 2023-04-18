package com.bjw;
import java.util.Scanner;

public class Triangle {

    String name;
    int width;
    int height;
    double size;
    public Triangle(){
        this.name = "삼각형";
    }
    public void inputSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Width : ");
        String inputString = scanner.nextLine();
        this.width = Integer.parseInt(inputString);
        System.out.println("Height : ");
        inputString = scanner.nextLine();
        this.height = Integer.parseInt(inputString);
    }
    public void calcSize() {    //같은 부분이 있음
        this.size = this.width * this.height / (double)2;
    }
    public void printSize() {
        System.out.println(this.name + " size : " + this.size);
    }
    public void doAction() {
        this.inputSize();
        this.calcSize();
        this.printSize();
    }
}
