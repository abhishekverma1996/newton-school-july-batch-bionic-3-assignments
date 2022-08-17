import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
		Scanner abhi= new Scanner(System.in);
		int n=abhi.nextInt();
		long sum = 0;
		long [] a = new long[n];
		for(int i=0;i<n;i++)
		{
			a[i]= abhi.nextLong();
			sum ^= a[i];
		}
		long res= 0;
		for(int i=0;i<n;i++)
		{
			res += sum;
			sum ^= a[i];
		}
		System.out.println(res);
	}
}
