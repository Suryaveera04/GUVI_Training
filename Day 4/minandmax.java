

public class minandmax {
    public static void findMaxMin(int [] arr){
        int max = arr[0];
        int min = arr[0];
        
        for( int i = 1; i < arr.length ; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println("Maximum value is: " + max);
        System.out.println("Minimum valie is: " + min);
    }
    public static void main(String[] args) {
        int [] arr = {1,5,7,6,9,14,25};
        findMaxMin(arr);
    }
}