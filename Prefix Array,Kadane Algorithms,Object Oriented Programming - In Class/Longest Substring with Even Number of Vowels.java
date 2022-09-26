import java.io.*;
import java.util.*;
class Main
{
    
    public static void main (String args[]) throws IOException
    {   
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String s = br.readLine();
	    int n = s.length();
	    int[] pre=new int[n];
	    char c=s.charAt(0);
	   pre[0] = ( c== 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')?1:0;
    	for (int i = 1; i < n; i++) {
    	    c=s.charAt(i);
    		if ( c== 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
    			pre[i] = pre[i - 1] + 1;
    			pre[i] %= 2;
                

    		}
    		else {
    			pre[i] = pre[i - 1];
    		}
    	}
    	int ans = 0;
    	for (int i = 0; i < n; i++) {
    		if (pre[i] == 0)ans = i + 1;
    	}
    	int l = 0;
    	int r = 0;
    	for (int i = 0; i < n; i++) {
    		if (pre[i] == 1) {
    			l = i;
    			break;
    		}
    	}
    	for (int i = n - 1; i >= 0; i--) {
    		if (pre[i] == 1) {
    			r = i;
    			break;
    		}
    	}

    	ans = Math.max(ans, r - l);

	    System.out.print(ans);
        
    }
}
