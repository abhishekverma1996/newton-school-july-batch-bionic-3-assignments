import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static long subArray (long [] arr)
    {
        long maxValue = arr[0], maxEnd = arr[0];
        long minValue = arr[0], minEnd = arr[0];
        long sum = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            maxEnd = Math.max(arr[i], maxEnd + arr[i]);
            maxValue = Math.max(maxEnd, maxValue);
            minEnd = Math.min(arr[i], minEnd + arr[i]);
            minValue = Math.min(minEnd, minValue);
            sum += arr[i]; 
        }
        return Math.abs(maxValue - minValue);
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextLong();
        }
        System.out.println(subArray(arr));
    }
}
