package com.bjw;

import java.util.HashMap;
import java.util.HashSet;

public class MainClass {
    public static void main(String[] args) {
//        HashSet<String> t = new HashSet<String>();
//        t.add("1");
//        t.add("1");
//        t.add("1");
//        t.add("1");
//        t.add("1");
//        t.add("1");
//        t.add("10");
//        System.out.println(t);
        HashMap<String, String> t = new HashMap<String,String>();
        t.put("ABC","==========ABC============");
        t.put("tt","===========DEF===========");

        System.out.println(t.get("ABC" ));

    }
}

