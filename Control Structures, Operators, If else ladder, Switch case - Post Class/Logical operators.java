import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
            int a,b;
        Scanner abhi= new Scanner(System.in);
        a= abhi.nextInt();
        b=abhi.nextInt();
        if(a<=10 && b>=10){
            System.out.print("true ");
        }else{
            System.out.print("false ");
        }
        if(a%2==0 || b%2==0){
            System.out.print("true ");
        }else{
            System.out.print("false ");
        }
        if(a==b){
            System.out.print("false ");
        }else{
            System.out.print("true ");
    }
    }
}
