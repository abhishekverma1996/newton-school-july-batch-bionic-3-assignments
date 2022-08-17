import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
 

static int findGCD(int A[], int N)
    {
        int result = A[0];
        for (int element: A){
            result = gcd(result, element);
 
            if(result == 1)
            {
               return 1;
            }
        }
 
        return result;
    }
    public static void main (String[] args) {
                      // Your code here
                      Scanner scr=new Scanner(System.in);
                      int N = scr.nextInt();
                      int[] A=new int[N];
                     
                      for(int i=0;i<N;i++){
                        
                         A[i] = scr.nextInt();
                         
                      }
                       
    
                      System.out.println(findGCD(A,N));
    
    }
}
