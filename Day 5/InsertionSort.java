
public class InsertionSort {
    public static void Sort(int arr[]) {
        for(int i = 1; i< arr.length - 1; i++){
            int key = arr[i];
            int j = i - 1;
            while( j >=0 && arr[j] > key  ) {
                arr[j + 1] = arr[j];
                j--;     
            }
            arr[j+1] = key;
        }
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,9,7,3,15,2,19,4};
        Sort(arr);
    }
}