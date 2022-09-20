import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- > 0) {
            int n = s.nextInt();
            HashSet<Integer> set = new HashSet<>();
            boolean flag = false;

            for (int i = 0; i < n; i++) {
                int x = s.nextInt();

                if (!flag && set.contains(x))
                    flag = true;

                set.add(x);
            }

            if (set.size() % 2 != 0) {
                if (flag)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
