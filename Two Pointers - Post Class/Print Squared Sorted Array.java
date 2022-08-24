import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static void printSortedSquares(int arr[])
    {
        Arrays.sort(arr);
          for (int i = 0; i < arr.length; i++)
             {
              System.out.print(arr[i] + " ");
             }
    }
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc= new Scanner(System.in);
         int T=sc.nextInt();
         for(int numberOfTest=0;numberOfTest<T;numberOfTest++ ){
            int numberOfCharacters=sc.nextInt();
            int UnsortedArray[]= new int[numberOfCharacters];
            int index=0;
             while(numberOfCharacters>0){
                 int num=sc.nextInt();
                 int sqrtOfNum=num*num;
                 UnsortedArray[index]=sqrtOfNum;
                 index++;
                 numberOfCharacters--;
             }
             printSortedSquares(UnsortedArray);
             System.out.print("\n");
         }
        
    }

}
