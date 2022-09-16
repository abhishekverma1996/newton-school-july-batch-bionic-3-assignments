import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int modInverse(int A, int M)
    {
 
        for (int X = 1; X < M; X++)
            if (((A % M) * (X % M)) % M == 1)
                return X;
        return 1;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int M = sc.nextInt();
 
        // Function call
        System.out.println(modInverse(A, M));
    }
}
