
public class situation3 {
    public static int countzeros(int[] arr){
        int left = 0, right = arr.length - 1;
        if (arr[right] == 0){
            return right+1;
        }
        
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == 1) {
                right = mid - 1;
            } else {
                if (mid == arr.length - 1 || arr[mid + 1] == 1) {
                    return mid + 1;
                }
                left = mid + 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(countzeros(arr));
    }
}