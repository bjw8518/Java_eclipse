package defaultt;


import java.util.Random;

public class RandomEx {

    public static void main(String[] args) {
        //2로 나눴을때 0이 나오면 짝수
        //1이 나오면 홀수
        Random r = new Random();
        int randomValue = r.nextInt(100);
        System.out.println(randomValue);
        if(randomValue % 2 == 1) {
            System.out.println("홀");
        }else {
            System.out.println("짝");
        }

    }

}
