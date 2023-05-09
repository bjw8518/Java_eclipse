public class MainClass2 {
    public static void main(String[] args) {
        String a="Hello";
        a="Hello1";
        a="Hello11";
        a="Hello111";

        StringBuffer b = new StringBuffer("Hello");
        b.append("1");
        b.append("1");
        b.append("2");

        System.out.println(b);
        b.reverse();
        System.out.println(b);


        String c = b.toString();
        System.out.println(c);
    }
}
