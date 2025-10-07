//Here we print the sumtriangle for a given array

import java.util.Arrays;

class SumTriangle {
    public static void print(int[] arr) {
        if ( arr.length == 0) return;
        int[] ans = new int[arr.length - 1];
        for (int i = 0; i<arr.length-1; i++) {
            
            ans[i] = arr[i] + arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
        print(ans);
        
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        print(arr);
    }
}