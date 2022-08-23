import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

     static void sortBinaryArray(int a[], int n)
    {
        int j = -1;
        for (int i = 0; i < n; i++) {
 
            // if number is smaller than 1
            // then swap it with j-th number
            if (a[i] < 1) {
                j++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
    }
    public static void main (String[] args) {
                      // Your code here
                   Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
 
        int m = arr.length;
 
        sortBinaryArray(arr, n);
 
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
