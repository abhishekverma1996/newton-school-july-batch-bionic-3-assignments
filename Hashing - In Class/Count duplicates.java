import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static HashMap<Integer, Integer> findRepeating(int []arr, int size){
     
    // Hash map to store the
    // frequency of elements
    HashMap<Integer,Integer> frequency = new HashMap<Integer,Integer>();
     
    // Loop to store the frequency of
    // elements of array
    for(int i = 0; i < size; i++)
    {
        if(frequency.containsKey(arr[i]))
        {
            frequency.put(arr[i], frequency.get(arr[i]) + 1);
        }
        else
        {
            frequency.put(arr[i], 1);
        }
    }
    return frequency;
}
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    HashMap<Integer,Integer> frequency = findRepeating(arr, arr.length);
    for (Map.Entry<Integer,Integer> entry : frequency.entrySet())
        if (entry.getValue() > 1)
            System.out.println(entry.getKey()+ " "+entry.getValue());
    
    }
}
