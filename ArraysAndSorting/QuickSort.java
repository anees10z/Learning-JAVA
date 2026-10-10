package ArraysAndSorting;

public class QuickSort{
    public static int partition(int arr[], int low, int high){
        int i = low;
        int pivot = arr[high];
        
        for(int j =low; j<high; j++){
            if(arr[j]<=pivot){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i++] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        
        return i;
        
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivotIdx = partition(arr, low, high);
            quickSort(arr, low, pivotIdx-1);
            quickSort(arr, pivotIdx+1, high);
        }
        
    }
	public static void main(String[] args) {
	    int[] arr = {2,48,4,9,2,12,3,67,12,89,46,21};
	    quickSort(arr, 0, arr.length-1);
	    for(int num: arr){
	        System.out.print(num+" ");
	    }
        System.out.println();
	}
}