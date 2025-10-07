package Arrays;

public class HighestALtitude {
    public static void main(String[] args) {
        int[] arr = {-5, 1, 5, 0, -7};
        System.out.println(heighest(arr));
    }
    static int heighest(int[] arr){
        int max =0;
        int diff =0;
        for(int i =0; i<arr.length; i++){
            // max=arr[i];
            diff = arr[i] + diff;
            if(diff>max){
                max = diff;
            }
        }
        return max;
    }
}
