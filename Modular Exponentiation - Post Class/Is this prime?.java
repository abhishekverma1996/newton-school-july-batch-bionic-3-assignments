import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static long mod=1000000007L;
	static long fastPower(long a,long b){
		long ans=1;
		b=b%(mod-1);
		while(b>0){
			if(b%2!=0){
				ans=(ans*a)%mod;
			}
			a=(a*a)%mod;
			b>>=1;	
		}
		return ans;
	}
	static long f(long n,long p){
		long ans=1;
		long cur_value=1;
		while(cur_value<=n/p){
			cur_value=cur_value*p;
			long z=fastPower(p,n/cur_value);
			ans=(ans*z)%mod;

		}
		return ans;
	}
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		long x,n,i;
		long ans=1;
		x=sc.nextLong();
		n=sc.nextLong();
		for(i=2;i*i<=x;i++){
			if(x%i!=0){
				continue;
			}
			ans=(ans*f(n,i))%mod;
			while(x%i==0){
				x=x/i;
			}
		}
		if(x>1){
			ans=(ans*f(n,x))%mod;
		}
        System.out.println(ans);
	}
}
