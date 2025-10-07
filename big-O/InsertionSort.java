// Insertion Sort

import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 7, 3, 9, 1};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    static int[] insertionSort(int[] arr){
        for(int i = 1; i<arr.length; i++){
            for(int j= i-1; j>=0; j--){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr [j] = temp;
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }

}
