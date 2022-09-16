import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long alphaToNumber(String s){
        long result=0;
        long m=1000000007;
        for(int i=0;i<s.length();i++){
            result=result*26;
            result=result+s.charAt(i)-'A'+1;
            result=result%m;
        }
        return result%m;
    }
    public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        System.out.println(alphaToNumber(s));
                      
    }
}
