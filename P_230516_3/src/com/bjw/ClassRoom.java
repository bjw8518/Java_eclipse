package com.bjw;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;

public class ClassRoom {
    public String name;
    public MessageHeader students;
    ArrayList<Student> Students = new ArrayList<Student>();

    ClassRoom(){

    }
    ClassRoom(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return name+" (" + this.students.size() + "명)";
    }
}
