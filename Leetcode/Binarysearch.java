public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 7;
        System.out.println(binarysearch(arr, target));
    }
    static int binarysearch(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        int mid = 0;

        while(start<=end){
            mid = start - (start - end)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
        }
        return -1;
    }
}
