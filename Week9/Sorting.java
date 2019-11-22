package FinalsReview;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {5, 3, 8, 4, 1};
		printArray(arr1);
		bubbleSort(arr1);
		
	}

	static void printArray(int[] arr) {
		System.out.print("{ ");
		for (int i = 0; i < arr.length; i ++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("}");
	}
	
	static void bubbleSort(int[] arr) { 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1]) { 
					// swap arr[j+1] and arr[i] 
					int temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp; 
				} 
			}
			// Print each pass in the array
			System.out.println("Pass: " + (i + 1));
			printArray(arr);
		}
	} 
	

	static void sort(int[] arr) { 
		int n = arr.length; 
		for (int i = 1; i < n; ++i) { 
			int key = arr[i]; 
			int j = i - 1; 

			/* Move elements of arr[0..i-1], that are 
	           greater than key, to one position ahead 
	           of their current position */
			while (j >= 0 && arr[j] > key) { 
				arr[j + 1] = arr[j]; 
				j = j - 1; 
			} 
			arr[j + 1] = key; 
		} 
	} 
	  
	static void selectionSort(int[] arr) { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
	
}
