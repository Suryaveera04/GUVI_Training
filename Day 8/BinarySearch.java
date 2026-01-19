
public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {13};
        int target = 13;
        int i = 0, j = arr.length-1;
        boolean flag = false;
        if (arr[0] == target) {
            System.out.println("First occurence is " + 0);
            flag = true;
        }
        else{
        while(i<=j){
            int mid = (i+j)/2;
            if (arr[mid] == target && arr[mid-1] != target){
                System.out.print("first occurance is " + mid);
                break;
            }
            else if(arr[mid] == target && arr[mid -1] == target) {
                j = mid - 1;

            }
            else if (arr[mid] < target){
                i = mid +1;
            }
            else{
                j = mid - 1;
            }
        }
        }
        if (arr[arr.length-1] == target) {
            System.out.println("second occurence is " + (arr.length-1));
            flag = true;
        }
        else{
        while(i<=j){
            int mid = (i+j)/2;
            if (arr[mid] == target && arr[mid+1] != target){
                System.out.println(" ");
                System.out.println("second occurance is " + mid);
                break;
            }
            else if(arr[mid] == target && arr[mid + 1] == target) {
                i = mid + 1;

            }
            else if (arr[mid] < target){
                i = mid - 1;
            }
            else{
                j = mid + 1;
            }
        }
        }
    }
}