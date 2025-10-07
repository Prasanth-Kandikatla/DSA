package StaticExample;

public class StaticBlock {
    static int a = 5;
    static int b;

    // Control goes only once inside a static block
    // Static block will only run once when the object is created first time
    static{
        System.out.println("Inside static block");
        b = a*2;
    }
    public static void main(String[] args) {
        // StaticBlock StaticBlock = new StaticBlock();
        System.out.println(StaticBlock.a);
        System.out.println(StaticBlock.b);

        a = a+b;
        // StaticBlock StaticBlock = new StaticBlock();
        
        System.out.println(StaticBlock.a);
        System.out.println(StaticBlock.b);

    }
}
