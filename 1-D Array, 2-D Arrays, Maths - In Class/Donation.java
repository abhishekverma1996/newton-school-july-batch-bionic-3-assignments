import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner sc= new Scanner(System.in);
       int n =sc.nextInt();
       int max=-1;
       long sum=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            sum= sum+x;
            if(max<=x){
                max=x;
                System.out.print(0+" ");
            }else{
             int y=max-x;
             System.out.print(y+" ");
             sum+=y;
            }
       }
       System.out.println();
       System.out.println(sum);
    }
}
