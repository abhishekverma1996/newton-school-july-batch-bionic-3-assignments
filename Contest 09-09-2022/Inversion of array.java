import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
static long count =0;
    public static int[] merge2SortedArrays(int[] left, int[] right){
        int i =0;
        int j= 0;
        int k=0;
        int [] merged = new int[left.length + right.length];
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
            merged[k]= left[i];
            i++;
            k++;
        }
        else{
            count+=(left.length-i);
            merged[k]=right[j];
            k++;
            j++;
           }
        }
        while(i<left.length){
            merged[k] = left[i];
            i++;
            k++;
        }
        while (j<right.length){
            merged[k]= right[j];
            k++;
            j++;
        }
        return merged;
    }
     static int[] mergeSort(int[] arr, int low, int high){
        if(low==high){
            int[]base = new int[1];
            base[0] = arr[low];
            return base;
        }
        int mid = (low + high)/2;
        int[]left = mergeSort(arr, low, mid);
        int[]right = mergeSort(arr, mid+1, high);
        
        int[]merged = merge2SortedArrays(left, right);
        return merged;
    }
    public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[] = new int[n];
         for(int i=0; i<n; i++){
             arr[i] = sc.nextInt();
         }
        mergeSort(arr, 0, n-1);
     System.out.println(count);
    }
}
