import java.util.Arrays;
public class IntegersSum {
    
    public static void main(String[] args) {
        int n=5;
        int[] arr =  new int[5];
        System.out.println(Arrays.toString(sum(arr,n)));
    }
    static int[] sum(int[] arr, int n){

        
        for(int i = 0; i< n/2; i++){
            arr[i] = -(i+1);
        }
        for(int i = n/2; i<n; i++){
            arr[i] = n-i;
        }
        if(n%2 != 0){
            arr[n/2] = 0;
        }
        return arr;
    }
}
