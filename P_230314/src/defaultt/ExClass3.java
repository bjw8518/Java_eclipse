package defaultt;


public class ExClass3 {

    public static void main(String[] args) {
        int a = 10 + 3;
        int b = 10 - 3;
        int c = 10 * 3;
        //double d = 10 / 3; //정수와 실수의 연산은 소수로 나옴

        double d = (double)10 / 3; //*******무조건 쓰기(소수점이하 살리기*******
        //정확한 연산이 필요할땐 다른방법이 필요(구글링)



        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int e = 10 % 3; //나머지연산 //1
        System.out.println(e);

        String f = "Hello"+ " " + "World";

        System.out.println(f);

        int g = 10 + (2 * 3) - (6 / 2); //연산자 우선순위 "( )"
        System.out.println(g);



    }

}
