import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 9, 11, 22, 1};
        
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length)));
    }

    static int[] mergeSort(int[] arr, int s, int e ){

        if(s == e-1){
            return new int[]{arr[s]};
        }
        int mid = s + (e-s) / 2;

        int[] left = mergeSort(arr, s, mid);
        int[] right = mergeSort(arr, mid, e);
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        System.out.println();
        return merge(left, right);
        
    }

    static int[] merge(int[] left, int[] right){
        int[] mix = new int[left.length+right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }
            else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        
        return mix;
    }
}
