import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    private static int lenOfLongSubarr(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = i + 1;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            if (map.containsKey(sum - k)) {
                if (maxLen < (i - map.get(sum - k))) {
                    maxLen = i - map.get(sum - k);
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args) throws IOException{
  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
        while (t-->0) {
            String srr[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(srr[0]);
            int k = Integer.parseInt(srr[1]);
             String ksrr[] = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] =Integer.parseInt(ksrr[i]);
            }
            System.out.println(lenOfLongSubarr(arr, n, k));
        }
    }
}
