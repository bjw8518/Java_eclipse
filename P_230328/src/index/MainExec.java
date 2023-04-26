package index;


public class MainExec {

    public static void main(String[] args) {
        SumMachine sumMachine = new SumMachine();

        sumMachine.makeSum(20, 100);
        int result=sumMachine.makeSum(1, 100);
        System.out.println(result);
    }

}
