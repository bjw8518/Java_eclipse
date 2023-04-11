package P230411;

import java.util.Scanner;

public class People{
    String name;
    String address;
    String sex;

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름");
        this.name=scanner.nextLine();
        System.out.println("주소");
        this.address=scanner.nextLine();
        System.out.println("성별");
        this.sex=scanner.nextLine();

    }

    public void printInfo() {
        System.out.println("이름:"+this.name+",주소:"+this.address+",성별:"+this.sex);

    }

}
