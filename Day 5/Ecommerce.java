
public class Ecommerce {
    public static int partition(int[] arr, int low , int high) {
        int pivot = arr[low];
        int i = low +1;
        int j = high;

        while( i <= j) {
            while( i <= high && arr[i] < pivot) {
                i++;
            }
            while ( arr[j] > pivot) {
                j--;
            }
            if(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
    public static void Sort(int[] arr, int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);
            Sort(arr, low, pi - 1);
            Sort(arr, pi + 1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,9,2,8,6,14,1};
        Sort(arr, 0, arr.length-1);

    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i]);
        System.out.print(" ");
    }  
    }
}