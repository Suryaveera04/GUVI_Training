
public class BubbleSort {
    public static void Sort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr [j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for( int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
            
        }
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
    }
    public static void main(String[] args) {
        int arr[] = {8,9,7,3,15,2,19,4,7};
        Sort(arr);

    }
}