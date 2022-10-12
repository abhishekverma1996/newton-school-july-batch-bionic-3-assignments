import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] prefix=new int[n];
        int curSum=0;
        for(int i=0;i<n;i++){
            curSum+=arr[i];
            prefix[i]=curSum;
        }
        int[] suffix=new int[n];
        int curSum1=0;
        int j=0;
        for(int i=n-1;i>=0;i--){
            curSum1+=arr[i];
            suffix[i]=curSum1;
        }
        int ind=0;
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int diff=Math.abs(prefix[i]-suffix[i]);
            if(diff<minDiff){
                minDiff=diff;
                ind=i+1;
            }
        }
        int ind1=0;
        int minDiff1=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int diff1=Math.abs(prefix[i]-suffix[i+1]);
            if(diff1<minDiff1){
                minDiff1=diff1;
                ind1=i+1;
            }
        }
        System.out.print(Math.max(ind,ind1));
    }
}
