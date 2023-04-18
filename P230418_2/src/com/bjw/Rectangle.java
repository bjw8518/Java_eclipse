package com.bjw;
import java.util.Scanner;

public class Rectangle extends Triangle{    //삼각형 클래스를 상속받음
    Rectangle(){
        this.name="사각형";
    }
    @Override   //재정의했음, 붙여도 되고 안붙여도 됨
    public void calcSize() {
        double size = this.width * this.height;
    }
}
