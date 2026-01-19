
public class subarray {
    public static void foursum(int[] arr, int target){
        int i = 0;
        int k = 4;
        int sum = 0;
        
        for(int x = 0; x < k; x++){
            sum += arr[x];
        }
        
        boolean flag = false;
        
        if (sum == target) {
            System.out.println("yes");
            flag = true;
        }
        
        while(i < arr.length - k){
            sum = sum + arr[i + k] - arr[i];
            i++;
            if (sum == target) {
                System.out.println("yes");
                flag = true;
                break;
            }
        }
        
        if (!flag){
            System.out.println("no");
        }
    }
    public static void main(String[] args) {
        int[] arr = {11,9,1,2,5,6,-9,10,13,18,12};
        foursum(arr, 20);
    }
}