import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        long t= sc.nextLong();
        long m = 1000000007;
        while(t-->0){
            int k = sc.nextInt();
            long res = findModulo(k-1,2);
            res = res*10;
            res = res %m;
            System.out.println(res);

        }
    }

    public static long findModulo(long k, long a){
        long m=1000000007;
        if(k==0){
            return 1;
        }
        if(k%2!=0){
            return(a*findModulo((k-1)/2,((a*a)%m)))%m;
        }
        return findModulo(k/2,((a*a)%m));

    }
}
