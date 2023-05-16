package com.bjw;

class Student {
    public String name;
    public int score;

    public Student(String name, int age){
        this.name = name;
        this.score = 0;
    }

    public String getName(){
        return name;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
