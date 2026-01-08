
public class TernarySearch {
    public static void Search(int key, int[] arr) {
        int left=0;
        int right = arr.length-1;
        int mid1;
        int mid2;
        while (left <= right) {
        mid1 = left + (right - left ) / 3;
        mid2 = right - (right - left) / 3;

         if (arr[mid1] == key) {
                System.out.println("Element found at index: " + mid1);
            }
            if (arr[mid2] == key) {
                System.out.println("Element found at index: " + mid2);
            }

            if (key < arr[mid1]) {
                right = mid1 - 1; 
            } else if (key > arr[mid2]) {
                left = mid2 + 1;
            } else {
                left = mid1 + 1; 
                right = mid2 - 1;
            }
        }
 
    }
    public static void main(String[] args) {
        int arr[] = {1,5,7,9,10,14,15,18,20};
        int key = 15;
        Search(key,arr);
    }
}