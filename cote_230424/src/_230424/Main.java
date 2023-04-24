package _230424;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int money = 1000;
        int[] coinMachine = {500,100,10,5,1};

        System.out.println("가격 :"+money);
        for (int i = 0; i < coinMachine.length; i++) {
            System.out.println(coinMachine[i]+"원"+money/coinMachine[i]);
            money%= coinMachine[i];
            
        }

    }
}
