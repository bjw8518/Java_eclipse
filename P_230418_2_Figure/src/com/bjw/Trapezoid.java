package com.bjw;
import java.util.Scanner;

public class Trapezoid extends Triangle{    //삼각형 클래스를 상속받음
    Trapezoid(){
        this.name="사다리꼴";
    }
    @Override   //재정의했음, 붙여도 되고 안붙여도 됨
    public void calcSize() {
        //double size = this.upper_side + this.lower_side * this.radius / 2;

    }
}
