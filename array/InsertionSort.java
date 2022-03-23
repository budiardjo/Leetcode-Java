public class InsertionSort {
    void sortArray(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int current = arr[i];
			int j = i - 1;
            
			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = current;
		}
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String args[])
	{
		int arr[] = { 7, 3, 10, 4, 1, 11 };

		InsertionSort arrayOfNumbers = new InsertionSort();
		arrayOfNumbers.sortArray(arr);

		printArray(arr);
        
        // prints 1 3 4 7 10 11
	}
    
}
