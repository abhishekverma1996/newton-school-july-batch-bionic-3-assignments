import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T >= 1) {
            int N = sc.nextInt();
            int check = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] <= check) {
                    count++;
                }
            }
            if (count >= 1) {
                System.out.println(count - 1);
            } else {
                System.out.println("-1");
            }
            T--;
        }
    }
}
