import java.util.*;

public class twopointer {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        ArrayList<Integer> ar = new ArrayList<>();
        int i = 0, j = arr.length-1;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                ar.add(i+1);
                ar.add(j+1);
                return ar;
            }else if(sum < target){
                i++;
            }else{
                j--;
            }
        }
        ar.add(-1);
        ar.add(-1);
        return ar;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,-2,3,7};
        System.out.println(new twopointer().twoSum(arr, 10));
    }
}