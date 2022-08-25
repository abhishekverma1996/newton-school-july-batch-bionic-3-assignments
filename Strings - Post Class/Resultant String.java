import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) 
    {
                      // Your code here
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
           String a=sc.next();
           n=a.length();
           String b=sc.next();
           String[] ans = new String[n];

 for (int i = 0; i < n; i++)
        {
            // If the Character matches
            if (a.charAt(i) == b.charAt(i))
                ans[i]= "0";
            else
                ans [i]= "1";
        } 
            for(int i=0;i<n;i++)
            System.out.print(ans[i]);
            }
    }
