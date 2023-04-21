package test;

import java.util.Random;

public class v23_Random {
    public static void main(String[] args) {
        Random rd = new Random();
        int min = 1;
        int max = 5;

        int randomNumber = (int) (Math.random() * (max - min) + min);

        System.out.println(randomNumber);

    }    //main

}    //class
