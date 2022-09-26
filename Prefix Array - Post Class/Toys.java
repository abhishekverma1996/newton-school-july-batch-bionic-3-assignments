import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
     Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=1;i<=Q;i++){
            int k = sc.nextInt();
            int totalBuy = N/(k+1);
            if(N%(k+1) != 0) totalBuy++;
            int res =0;
            for(int j=0;j<totalBuy;j++){
                res +=arr[j];
            }
            System.out.println(res);
    }
}
}
