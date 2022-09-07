import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     static int binarySearch(int arr[], int l, int r, int x){
         if(r>=l){
             int mid = l+(r-l)/2;

             if(arr[mid]==x)
             return mid;

             if(arr[mid]>x)
                 return binarySearch(arr, l,mid -1, x);
    
           return binarySearch(arr,mid +1,r, x);

         }
        return -1;
    }

    public static void main (String[] args) throws IOException {
                      // Your code here
                       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr []= new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int result = binarySearch(arr, 0, n-1, k);

        if ((result == -1))
            System.out.print("0");
        else
            System.out.print("1");
    }
}
