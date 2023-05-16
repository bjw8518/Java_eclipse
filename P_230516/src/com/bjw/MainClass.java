package com.bjw;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Student[] arr = {new Student("홍길동",100)
                ,new Student("둘리",20)};

        Student[] arr2 = new Student[2];
        arr2[0]=new Student("홍길동",100);
        arr2[1]=new Student("둘리",20);
        
        ArrayList<Student>list=new ArrayList<Student>();
        list.add(new Student("홍길동",100));
        list.add(new Student("둘리",50));
        list.add(new Student("또치",80));

//        ArrayList<String> a = new ArrayList<String>();
//        a.add("bb");
//        a.get(0).equals("1111");
//        a.size();
//
//        String[]f=new String[10]; //10개만쓰는얘
//        String[]g={"1","2","3"};
//
//
//        Object o =new String("cc");
//        String s = new String("dd");
//        ((String)o).getBytes();



    }
}
