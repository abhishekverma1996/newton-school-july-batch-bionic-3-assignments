import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long mod=1000000007L;
    static long modpow(long a,long n){
       if (n == 0) return 1;
       if (n == 1) return a % mod;
       if (n%2==1) return (a*modpow(a,n-1))%mod;
       long t = modpow(a,n/2);
       return (t*t)%mod;
    }
    static long modcmb(long l, long r) {
        long x=1,y=1;
        for(int i = 0; i < (int)(r); i++){
            x=(x*(l-i))%mod;
            y=(y*(i+1))%mod;
        }
        return (x*modpow(y,mod-2))%mod;
    }
    
	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long ans=modpow(2,n)-1;
        long c=modcmb(n,a);
        long d=modcmb(n,b);
        ans=(ans-c+mod)%mod;
        ans=(ans-d+mod)%mod;
        System.out.println(ans);
	}
}
