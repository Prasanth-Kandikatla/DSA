import java.util.*; 
public class Minimumnumber{
    // function to return minimum element using recursion 
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, -50, 10, 2};
        int n = arr.length;
        System.out.println(minimum(arr, n));
    }
    public static int minimum(int A[], int n) 
    { 
      // if size = 0 means whole array 
      // has been traversed 
      if(n == 1) 
        return A[0]; 
          
        return Math.min(A[n-1], minimum(A, n-1)); 
    } 
      
} 
