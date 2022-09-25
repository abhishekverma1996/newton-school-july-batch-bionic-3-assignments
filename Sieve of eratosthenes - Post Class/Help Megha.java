import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
   public static boolean[] result = new boolean[100000+1];
   public static int[] counter = new int[100000+1];
  
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int c=sc.nextInt();
       result[0]=true;
       result[1]=true;
       work();
       calculat();
 
       while(c>0){
           int input = sc.nextInt();
           System.out.println(counter[input]);   
           c--;
       }
 
   }
 
   private static void work() {
       for (int i = 2; i * i <= 100000+ 1; i++) {
 
           if (!result[i]) {
 
               for (int j = i * 2; j <100000+ 1; j += i) {
 
                   if (j % i == 0)
 
                       result[j] = true;
 
               }
           }
       }
   }
 
   private static void calculat() {
       int count = 0;
       for(int i = 0; i<=100000; i++){
           if(result[i] == false)
               count++;
          
           counter[i] = count;
       }
      
   }
}
