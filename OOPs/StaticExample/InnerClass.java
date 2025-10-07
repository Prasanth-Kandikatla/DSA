package StaticExample;

public class InnerClass {
    static class Test{
        Test(){
            System.out.println("Hi");
        }
    }
    public static void main(String[] args) {
        Test a = new Test();
    }
}
