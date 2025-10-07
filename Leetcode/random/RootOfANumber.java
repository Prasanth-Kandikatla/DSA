package random;

public class RootOfANumber {
    public static void main(String[] args) {
        int n = 2147395599;
        System.out.println(root(n));
    }
    static int root(int n){
        int root = 0;
        if (n==0) return 0;
        else if (n==1) return 1;
        
        else {
            for (int i = 0; i <= n/2; i++) {
                if(i*i <= n){
                    root = i;
                }
            }
            return root;
        }
    }
    
}
