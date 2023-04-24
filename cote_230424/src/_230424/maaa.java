package _230424;

import java.util.Scanner;

public class maaa {
    public static void main(String[] args) {
        int[] arrMoney = {1000, 500, 100, 50, 10, 1};
String[] str = {"오백원", "백원", "오십원", "십원", "일원"};
        int[] result = new int[9];
System.out.println("금액을 입력하세요 ");
        Scanner in = new Scanner(System.in);
        int Money = in.nextInt();
        for(int i=0; i<arrMoney.length; i++) {
            int num = Money/arrMoney[i];
            int remainer = Money % arrMoney[i];
            Money = remainer ;
            if(num > 0 && i <4) {
                System.out.println(str[i] + " " + num + "매");
            }else if(num > 0 && i >=4) {
                System.out.println(str[i] + " " + num + "개");
            }
        }
    }
}
