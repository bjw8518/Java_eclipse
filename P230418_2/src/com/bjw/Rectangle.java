package com.bjw;
public class Rectangle extends Triangle {
    Rectangle() {
        this.name = "사각형";
    }
    public void calcSize() {
        this.size = this.width * this.height;
    }
}