import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Main {
   public static long maxOfSubarray(int[] arr,int n, int k) {
     Deque<Integer> dq = new ArrayDeque<>();
     for(int i=0;i<k;i++){
       while(!dq.isEmpty() && arr[dq.getLast()]<=arr[i]){
         dq.removeLast();
       }
       dq.addLast(i);
     }

     long ans = arr[dq.getFirst()];
     for(int i=k;i<n;i++){
       if(dq.getFirst()== i-k){
         dq.removeFirst();
       }
       while(!dq.isEmpty() && arr[dq.getLast()]<=arr[i]){
         dq.removeLast();
       }
       dq.addLast(i);
       ans = (ans*arr[dq.getFirst()])%1000000007;
     }

      return ans%1000000007;
  }
    
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    String str1[] = sc.nextLine().split(" ");
    int N = Integer.parseInt(str1[0]);
    int K = Integer.parseInt(str1[1]);
    String str2[] = sc.nextLine().split(" ");
    int A[] = new int[N];
    for(int i=0;i<N;i++){
        A[i] = Integer.parseInt(str2[i]);
    }
    System.out.println(maxOfSubarray(A,N,K));
    }
}
