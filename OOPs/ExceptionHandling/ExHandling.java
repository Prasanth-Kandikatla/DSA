package ExceptionHandling;

public class ExHandling {
    // int a = 5;
    // int b = 0;
    // int c = a/b;
    // System.out.println(c);

    public static void main(String[] args) {
        // System.out.println(c);
        int a = 5;
        int b = 0;
        // int c = a/b;

        try {
            divide(a,b);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("e.getMessage()...");
        } finally {
            System.out.println("This will run anyway");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("do not divide by 0");
        }
            return a/b;
    }
}
