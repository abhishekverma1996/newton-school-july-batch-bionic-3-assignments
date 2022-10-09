import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int maxLength(String S){
        // code here
        int[] dp=new int[S.length()+1];
        int ans=0;
        for(int i=2;i<=S.length();i++)
        {
            if(S.charAt(i-1)==')' && i-dp[i-1]-2>=0 && S.charAt(i-dp[i-1]-2)=='(')
            {
                dp[i]=dp[i-1]+2+dp[i-dp[i-1]-2];
            }
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    System.out.println(maxLength(n));
    }
}
