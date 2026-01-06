
public class TwoPointers {
    public static void main(String[] args) {
        // Example usage of two pointers technique
        int[] arr = {1,2,3,4,5,6};
        int target = 7;
        findPairWithSum(arr, target);
    }

    public static void findPairWithSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == target) {
                System.out.println("Pair found: (" + arr[left] + ", " + arr[right] + ")");
                return;
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No pair found with the given sum.");
    }
}