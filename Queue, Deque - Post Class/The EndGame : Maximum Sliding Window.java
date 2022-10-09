import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
     Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int k =sc.nextInt();
		Deque<Integer> dq= new LinkedList<Integer>();
		for(int i=0;i<k;i++){
			while(!dq.isEmpty() && arr[i]>arr[dq.peekLast()]){
				dq.pollLast();
			}
			dq.addLast(i);
		}
		System.out.print(arr[dq.peekFirst()]+" ");
		for(int i=k ; i<n ;i++){
			if(!dq.isEmpty() && dq.peekFirst()==i-k){
				dq.pollFirst();
			}
			while(!dq.isEmpty() && arr[i]>arr[dq.peekLast()]){
				dq.pollLast();
			}
			dq.addLast(i);
			System.out.print(arr[dq.peekFirst()]+" ");

		}
    }
}
