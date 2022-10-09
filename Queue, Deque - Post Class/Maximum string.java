import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static String largestString(String num, int k)
{
    StringBuffer ans = new StringBuffer();
 
    for(char i : num.toCharArray())
    {
        while (ans.length() > 0 &&
               ans.charAt(ans.length() - 1) < i && k > 0)
        {
            ans = new StringBuffer(ans.substring(0, ans.length() - 1));
            k--;
        }
        ans.append(i);
    }
    while (ans.length() > 0 && k-- > 0)
    {
        ans = new StringBuffer(ans.substring(0, ans.length() - 1));
    }
    return ans.toString();
}
    public static void main (String[] args) throws java.lang.Exception{
                      // Your code here
    Scanner sc = new Scanner(System.in);
    String S =sc.next();
     int K = sc.nextInt();
     if(S.length() >K){
     System.out.print(largestString(S, K)); 
     }else{
         System.out.print(S);
     }
     
    }
}
