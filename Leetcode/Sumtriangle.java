import java.util.Arrays;
public class Sumtriangle {
    public static void main(String[] args) {
        int[] arr ={7, 8, 9, 10};
        sumtriangle(arr);
    }
    static void sumtriangle(int[] arr) {

        // Print the latest array
        // System.out.println(Arrays.toString(arr));

        // Base case, stop recursion when array has only one element
        if(arr.length==1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        // Create a new array with one less element
        int[] ans = new int[arr.length-1];


        for(int i=0; i<arr.length-1; i++){
            ans[i]= arr[i]+arr[i+1];
        }
        System.out.println(Arrays.toString(arr));

        sumtriangle(ans);
    }
}
