public class PigSave {
    String name;
    int amount;
   
    public void in(String n , int money){
        name = n;
        amount = amount + money;
    } // 입금
   
    public void out(String n , int money){
    	name = n;
    	amount = amount-money;
    } // 출금
   
    public void info(){
        System.out.println("==================================");
        System.out.println(name+"의잔액은"+amount+"입니다!!");
        System.out.println("==================================");
    }
   
    public static void main(String[] args) {
        // 새로운 개체를 만들기
        PigSave aaa = new PigSave();
        PigSave bbb = new PigSave();
       
        // 예금하기
        aaa.in("조상철",1000);
        bbb.in("김선주",1000);
       
        // 출금하기
        aaa.out("조상철",200);
        bbb.out("김선주",400);
       
        // 결과출력하기
        aaa.info();
        bbb.info();
       
    }//end main
}//end class