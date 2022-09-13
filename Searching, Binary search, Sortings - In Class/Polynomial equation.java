import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int polynomial(long a,long b,long c,long k){

        for(int i=0;i<100000*100000;i++){
            long x=(a*i*i)+(b*i)+(c);
            if(x>=k){
                return i;
            }
        }
        return -1;
    }
    
    public static void main (String[] args) {
                      // Your code here
        Scanner sc= new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        long k=sc.nextLong();

        long t=polynomial(a,b,c,k);
        if(t>=k){
            System.out.print(k);
        }
        else {
            System.out.print(t);
        }
    }
}
