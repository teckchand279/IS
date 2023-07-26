import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int[] arr, int size) {
		int passes = 0;
		
		for(int i = 1 ; i < size ; i++) {
			passes++;
		
			int temp = arr[i];
			int j;
		
			for(j = i - 1 ; j >= 0 && arr[j] > temp ; j--) {
				
				arr[j + 1] = arr[j];
			}
			
			arr[j + 1] = temp;
		}
		System.out.println("No of passes = " + passes);
	}

	public static void main(String[] args) {
	
		int arr[] = {11, 22, 33, 44, 55, 66};
		
		System.out.println("Before sort : " + Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("After sort : " + Arrays.toString(arr));
	}

}


