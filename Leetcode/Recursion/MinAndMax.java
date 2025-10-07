//Here we find minimum and maximum elements recursively 
//in a given array
class MinAndMax {
    public static int min (int[] arr, int n, int mini) {
        if (n == arr.length) return mini;
        mini = (arr[n] < mini)? arr[n]: mini;
        return min (arr, n+1, mini);
    }

    public static int max (int[] arr, int n, int maxi) {
        if (n == arr.length) return maxi;
        maxi = (arr[n] > maxi)? arr[n]: maxi;
        return max (arr, n+1, maxi);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 77};

        System.out.println("minimum is: "+ min(arr, 0, Integer.MAX_VALUE));
        System.out.println("minimum is: "+ max(arr, 0, Integer.MIN_VALUE));
    }
}
