import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력");

        try {
            String inputString = sc.nextLine();
            int a = Integer.parseInt(inputString);
            System.out.println(10 / a);
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("정상실행");
        System.out.println("정상실행");
        System.out.println("정상실행");
        System.out.println("정상실행");

    }
}
