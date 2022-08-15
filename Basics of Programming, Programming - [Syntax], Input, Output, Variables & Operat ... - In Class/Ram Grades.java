import java.io.*;
import java.util.*;

// don't change the name of this class
// you can add inner classes if needed
class Main {
    
    public static void main (String[] args) {     

  Scanner sc=new Scanner(System.in);  
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        int percentage=(a+b+c+d)/4;
        System.out.print(percentage);
    }
}
