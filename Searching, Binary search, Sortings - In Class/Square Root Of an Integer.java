import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases >= 1) {
            int x = sc.nextInt();
            double sq = Math.sqrt(x);
            int res = (int) sq;
            System.out.println(res);
            testcases--;
        }
    }
}
