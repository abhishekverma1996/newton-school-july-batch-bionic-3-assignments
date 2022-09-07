import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static void main (String[] args) {
                      // Your code here
        Scanner input  = new Scanner(System.in);
        long T= input.nextLong();
        for(long i=0;i<T;i++){
            long N = input.nextLong();

            long low =0;
            long high =100000000;
            long mid = 0;
            int count =0;

            while(low<=high){
                mid = (low+high)/2;
                if((mid*mid) == N){
                    System.out.println("YES");
                    count++;
                    break;
                }
                else if((mid*mid)>N){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
                
            }
            if(count==0) System.out.println("NO");
        }  
    }
}
