/*
interface ISort{
    public int[] sort(int[] arr);
}
*/

// implement classes here

class BubbleSort implements ISort {
    public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

    public int[] sort(int[] arr){
        for(int pass = 1; pass < arr.length; pass++) {
			for(int i = 1; i <= arr.length - pass; i++) {
				if(arr[i-1] > arr[i]) {
					swap(arr, i, i-1);
				}
			}
		}
        return arr;
    }

}

class InsertionSort implements ISort
    public int[] sort(int[] arr){

        for(int unsortedStartIdx = 1; unsortedStartIdx < arr.length; unsortedStartIdx++) {
			
			int key = arr[unsortedStartIdx];
			int j = unsortedStartIdx - 1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}

        return arr;
    }

}

class MergeSort implements ISort {
    public int[] sort(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

}

class SelectionSort implements ISort{
    public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
    public int[] sort(int[] arr){
        for(int pass = 1; pass < arr.length; pass++) {
			int pos = pass - 1;
			int minIdx = pos;
			for(int i = pos + 1; i < arr.length; i++) {
				if(arr[i] < arr[minIdx]) {
					minIdx = i;
				}
			}
			swap(arr, minIdx, pos);
		}
        return arr;
    }

}
