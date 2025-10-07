import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 20, -2, 8, 44,60, 55, 27, 12, 11, 6, 1};
        System.out.println(Arrays.toString(selectionSortMin(arr)));
        System.out.println(Arrays.toString(selectionSortMax(arr)));

    }

    // Selection Sort by selecting minimum value
    static int[] selectionSortMin(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            int min = i;
           
            for(int j = i; j<=arr.length-1; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

// Selection Sort by selecting maximum value
    static int[] selectionSortMax(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            int max = 0;
            int end = arr.length - i - 1;
            for(int j = 0; j<=end; j++){
                if(arr[max]<arr[j]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[end];
            arr[end] = temp;
        }
        return arr;
    }

}
