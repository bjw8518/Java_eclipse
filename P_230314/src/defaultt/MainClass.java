package defaultt;


public class MainClass {

    public static void main(String[] args) {
        boolean a;

        a = 3 == 3;
        a = 3 != 3;
        a = 3 > 4;
        a = 3 < 4;
        a = 3 >= 4;
        a = 3 <= 4;
        System.out.println(a);

        int x = 0;
        a = x < 10 || x % 2 == 0;
        a = true || !(10 < x);
        //&& //and
        //|| //or


    }

}