/* Find the sum of elements between indices l and r*/

import java.util.*;

public class prifixsum {
    public static void prefixSum(int [] arr){
        int n = arr.length;
        int [] prefix = new int[n];
        prefix[0] = arr[0];

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Print prefix sum array
        System.out.println("Prefix Sum Array: " + Arrays.toString(prefix));
    }

    public static int rangeSum(int [] prefix, int l, int r){
        if(l == 0){
            return prefix[r];
        } else {
            return prefix[r] - prefix[l - 1];
        }
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        prefixSum(arr);
        
        int l = 1; // starting index
        int r = 3; // ending index
        int [] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
        
        int sum = rangeSum(prefix, l, r);
        System.out.println("Sum of elements between indices " + l + " and " + r + " is: " + sum);
    }
}