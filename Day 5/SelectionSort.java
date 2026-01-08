
public class SelectionSort {
    public static void Sort(int[] arr) {

        for ( int i = 0; i < arr.length; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j ;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
        for (int i =0; i <arr.length ; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,9,7,3,15,2,19,4};
        Sort(arr);
    }
}