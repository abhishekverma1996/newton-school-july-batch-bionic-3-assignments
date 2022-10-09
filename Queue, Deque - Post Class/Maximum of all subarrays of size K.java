import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void MaxSubarray(int arr[], int N, int K)
    {
        int j, max;
 
        for (int i = 0; i <= N - K; i++) {
 
            max = arr[i];
 
            for (j = 1; j < K; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            System.out.print(max + " ");
        }
    }
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int A[] = new int[N];
    for(int i=0;i<N;i++){
        A[i] = sc.nextInt();
    }
    MaxSubarray(A,N,K);
    }
}
