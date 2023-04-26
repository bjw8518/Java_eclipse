package defaultt;


public class Switch_Case {

    public static void main(String[] args) {
        int a = 2;

        switch(a) {
            case 0:
                System.out.println("1");
                break;
            case 1:
                System.out.println("2");
                break;
            default:
                System.out.println("----");
        }


        if(a == 1) {
            System.out.println("1");
        }else if(a == 2) {
            System.out.println("2");
        }else if(a == 3) {
            System.out.println("3");
        }

    }

}
