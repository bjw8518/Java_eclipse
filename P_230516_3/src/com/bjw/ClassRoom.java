package com.bjw;

import java.util.ArrayList;

public class ClassRoom {
    String name;
    ArrayList<Student> students = new ArrayList<Student>();

    ClassRoom() {

    }

    ClassRoom(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.students.size() + "명)";
    }
}
