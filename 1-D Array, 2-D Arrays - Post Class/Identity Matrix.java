import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
          Scanner sc=new Scanner(System.in);
          int x= sc.nextInt();
          int y =x;
          int f=0;
          int arr[][]= new int[x][y];
          for(int i=0;i<x;i++)
          {
              for(int j=0;j<y;j++)
              {
                  arr[i][j]= sc.nextInt();
              }
          }
          for(int i=0;i<x;i++)
          {
              for(int j=0;j<y;j++)
              {
                  if(i==j && arr[i][j]!=1){
                      f+=1;
                      break;
                  }
                  if(i!=j && arr[i][j]!=0){
                      f+=1;
                      break;
                  }
              }
          }
          if(f==0)
              System.out.println("Yes");
          
          else
              System.out.println("No");
          
    }
}
