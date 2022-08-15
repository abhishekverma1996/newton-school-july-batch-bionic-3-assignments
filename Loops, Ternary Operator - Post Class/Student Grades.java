import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                       Scanner sc=new Scanner(System.in);  
        int a,b,c,d,e;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        int percentage=(a+b+c+d+e)/5;
        if(percentage>=80){
            System.out.println("A");
        }else if(percentage<80 && percentage>=60){
            System.out.println("B");
        }else if(percentage<60 && percentage>=40){
            System.out.println("C");
        }else {
            System.out.println("D");
        }
    }
}
