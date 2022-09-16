import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc= new Scanner(System.in);
		int T=sc.nextInt();
		long m=1000000007;
		for(int i=1;i<=T;i++){
			long a=sc.nextLong();
			long b=sc.nextLong();
			long c=sc.nextLong();
            long bc=fastPower(b,c,m-1);
            // System.out.println(fastPower(b,c,m));
			System.out.println(fastPower(a,bc,m));
		}
	}
	static long fastPower(long a,long b ,long m)
	{	
		long ans=1;
		while(b>0){
			if(b%2!=0){
				ans=(ans*a)%m;

			}
			a=(a*a*1)%m;
			b>>=1;

		}
		return ans;
    }
}
