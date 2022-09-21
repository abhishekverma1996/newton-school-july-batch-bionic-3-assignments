import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long maxSubArraySum(int arr[] , int n){
        long maxSum = 0;
        long curSum = 0;
        for(int i=0;i<n; i++){
            curSum = curSum + arr[i];
            if(curSum>maxSum){
                maxSum = curSum;
            }
            if(curSum<0){
                curSum = 0;
            }
        }
        return maxSum;
    }
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i= 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArraySum(arr,n));
        }
    }
}
