import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int sumOfTwoCubes(long n)
{
   int count=0;
   for(long i=0;i<=Math.cbrt(n);i++){
       long cb= i*i*i;
       long diff = n - cb;
       long cbrtDiff= (long)Math.cbrt(diff);
       if(cbrtDiff*cbrtDiff*cbrtDiff==diff)
        count++;
    }
    return count;
}
    public static void main (String[] args) {
                      // Your code here
            Scanner sc= new Scanner(System.in);
            long N= sc.nextLong();
      if (sumOfTwoCubes(N)!=0) {
        System.out.println("YES");
    }
    else {
        System.out.println("NO");
    }
    }
}
