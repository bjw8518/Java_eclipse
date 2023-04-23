package com.bjw;
import java.util.Scanner;

public class Triangle {
    String name;
    int width;
    int height;
    int upper_side;
    int lower_side;
    int pie;
    double radius = 3.14;
    double size;
    Triangle() {
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
    public void calcSize() {
        this.size = this.width * this.height / (double)2;
    }
    public void printSize() {
        System.out.println(this.name + " size : " + this.size);
    }
    //==================================================
    public void inputSize_Tr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("upper_side : ");
        String inputString = sc.nextLine();
        this.upper_side = Integer.parseInt(inputString);

        System.out.println("lower_side : ");
        inputString = sc.nextLine();
        this.lower_side = Integer.parseInt(inputString);

        System.out.println("Height : ");
        inputString = sc.nextLine();
        this.height = Integer.parseInt(inputString);
    }
    public void calcSize_Tr() {
        this.size = (this.upper_side + this.lower_side) * this.height / 2;
    }
    public void printSize_Tr() {
        System.out.println(this.name + " size : " + this.size);
    }
    //===========================================================
    public void inputSize_circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("radius : ");
        String inputString = sc.nextLine();
        this.pie = Integer.parseInt(inputString);
    }
    public void calcSize_circle() {
        this.size = this.pie * this.pie * this.radius;
    }
    public void printSize_circle() {
        System.out.println(this.name + " size : " + this.size);
    }
    //================================================================
    public void doAction() {
        this.inputSize();
        this.calcSize();
        this.printSize();
    }
    public void doAction_Tr() {
        this.inputSize_Tr();
        this.calcSize_Tr();
        this.printSize_Tr();
    }
    public void doAction_circle() {
        this.inputSize_circle();
        this.calcSize_circle();
        this.printSize_circle();
    }
}
