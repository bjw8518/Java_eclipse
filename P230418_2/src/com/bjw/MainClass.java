package com.bjw;
public class MainClass {
    public static void main(String[] args) {
        Triangle s1 = new Triangle();
        s1.doAction();

        Rectangle s2 = new Rectangle();
        s2.doAction();

        Trapezoid s3 = new Trapezoid();
        s3.doAction_Tr();

        Circle s4 = new Circle();
        s4.doAction_circle();
    }
}