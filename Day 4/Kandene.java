
public class Kandene {
    public static void maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEnding);
        }
        System.out.println("Maximum subarray sum is: " + maxSoFar);
    }
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArraySum(arr);
    }
}