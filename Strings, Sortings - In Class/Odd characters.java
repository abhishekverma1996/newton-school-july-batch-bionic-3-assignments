import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
            // Your code here
            Scanner sc = new Scanner(System.in);
            String S= sc.nextLine();
            int len=S.length();
            for(int i=0;i< len;i++)
            {
            char ch=S.charAt(i);
                if((i+1)%2!=0)
                {
                    System.out.print(ch+" ");
                }
            }
    }
}
