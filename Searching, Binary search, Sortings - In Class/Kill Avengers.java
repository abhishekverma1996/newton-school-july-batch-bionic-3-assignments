import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {public static int correctString(String s) {
        int[] count = new int[128];
        int n = s.length(), res = n, i = 0, k = n / 4;
        for (int j = 0; j < n; ++j) {
            ++count[s.charAt(j)];
        }
        for (int j = 0; j < n; ++j) {
            --count[s.charAt(j)];
            while (i < n && count['A'] <= k && count['C'] <= k && count['T'] <= k && count['G'] <= k) {
                res = Math.min(res, j - i + 1);
                ++count[s.charAt(i++)];
            }
        }
        return res;
    }

    public static void main (String[] args) {
                      // Your code here
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
       
System.out.println(correctString(s));

    }
}
