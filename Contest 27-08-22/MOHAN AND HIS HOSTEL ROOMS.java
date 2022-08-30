import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes  needed
class Main {
    public static void main (String[] args) {
                      // Your code here         
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int i =1;i<=t;i++)
        {
            int R =sc.nextInt();
            char S=sc.next().charAt(0);
            if(R%2==0 )
            {
                System.out.print("PAPUM"+" ");
                if(S=='G')
                System.out.println("U");
                else{
                    System.out.println("L"); 
                }
            }
            else
            {
                System.out.print("LOHIT"+" ");
                if(S=='G')
                System.out.println("U");
                else{
                    System.out.println("L"); 
                }
            }  
        }       
    }
}
