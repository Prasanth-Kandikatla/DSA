import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {4, 9, 5, 1, 0};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr){

        for(int i = 0; i<arr.length - 1; i++){
            for (int j = 0; j<arr.length - i - 1; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            // return arr;
        }
        return arr;
    }
}
