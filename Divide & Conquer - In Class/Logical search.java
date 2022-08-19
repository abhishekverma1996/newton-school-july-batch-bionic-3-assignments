import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
  static int findMissing(int[] arr, int n)
    {
        int a, l, s, i, sum = 0, missingnumber;
        a = arr[0];
        l = arr[n - 1];
  
        /* Taking the sum of all the elements of the array
           including the missing element using formulae
           S(n) = n/2 (a+l)  where a is the first element
           and l is the last element */
  
        if ((a + l) % 2 == 0) /* ensuring this as n/2(a+l)
                     and (a+l)/2 would give different values
                     programmatically */
        {
            s = (a + l) / 2;
            s = s * (n + 1);
        }
        else {
            s = (n + 1) / 2;
            s = (a + l) * s;
        }
  
        // Taking the sum of all the elements of the
        // array excluding the missing element
  
        for (i = 0; i <= n - 1; i++) {
            sum = sum + arr[i];
        }
  
        missingnumber = s - sum;
  
        return missingnumber;
    }
  
    // Driver Code
    public static void main(String[] args)
    {
         Scanner scr=new Scanner(System.in);
                      int N = scr.nextInt();
                      int[] arr=new int[N];
                     
                      for(int i=0;i<N;i++){
                        
                         arr[i] = scr.nextInt();
                         
                      }
        System.out.println(findMissing(arr,N));
    }
}
