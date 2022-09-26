import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void arrayGenerator(int[] A, int n, int[] B){
        int sum = 0;
        A[0] = 0;
        int i = 0;
        int k = A[0];
        while(i<n){
            sum += B[i];
            A[k+1] = sum;
            k++;
            i++; 
        }
        
    }
    public static void main (String[] args) {
                      // Your code here
    Scanner s =  new Scanner(System.in);
        int n = s.nextInt();
        int[] B = new int[n];
        for(int i=0;i<n;i++){
        B[i] = s.nextInt();
        }
        int[] A = new int[n+1];  
        arrayGenerator(A,n,B);
        for(int i=0;i<n+1;i++){
            System.out.print(A[i] + " ");
        }
    }
}
