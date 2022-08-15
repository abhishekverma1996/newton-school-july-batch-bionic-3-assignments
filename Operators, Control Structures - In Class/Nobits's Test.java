import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                    int D,Q;
        Scanner abhi=new Scanner(System.in);
        D= abhi.nextInt();
        Q=abhi.nextInt();
        if(Q==0){
            System.out.println("-1");
        }else{
        System.out.println(D/Q);
              }
}
}
