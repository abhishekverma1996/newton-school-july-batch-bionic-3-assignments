import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                int M,N;
        Scanner abhi=new Scanner(System.in);
        M= abhi.nextInt();
        N=abhi.nextInt();
        for(int i=1;i<=M;i++){
            for(int j=1;j<=N;j++){
                if(i==1 || i==M){
                    System.out.print("*");
                }else if(j==1 || j==N){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
