import java.io.*; // for handling input/output
import java.util.*;
import java.util.Scanner; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      int a,square;
        
        Scanner sqr= new Scanner(System.in);
        a= sqr.nextInt();
        square=a*a;
        System.out.print(square);
    }
}
