import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int sumDigitSquare(int n){
        int s = 0;
        while(n != 0){
            int digit= n%10;
            s += digit * digit;
            n = n/10;
        }
        return s;
    }
    static boolean isHappy(int n){
        while(true){
            if(n==1)
            return true;

            n= sumDigitSquare(n);
            if(n==4)
            return false;
        }
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(isHappy(n))
        System.out.println("true");
        
        else
        System.out.println("false");
    }
}
