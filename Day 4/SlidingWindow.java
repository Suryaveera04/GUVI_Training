
public class SlidingWindow {
    public static void maxsumlistSlidingWindow(int [] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++){
            sum += arr[i];
            System.out.println("Sum of first " + k + " elements: " + sum);
        }
        for (int i = k; i < arr.length; i++){
            sum += arr[i] - arr[i-k];
            System.out.println("Sum of elements from index " + (i - k + 1) + " to " + i + ": " + sum);
        }

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,2};
        int k = 3;
        maxsumlistSlidingWindow(arr, k);
        
    }
}