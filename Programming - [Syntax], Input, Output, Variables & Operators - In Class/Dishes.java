import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
            Scanner sc= new Scanner(System.in);
            int N,T;
            N= sc.nextInt();
            T=sc.nextInt();
            System.out.println(T-N);
    }
}
