import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        int[] arr = new int[num];
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
    Map<Integer, Integer> map = new HashMap<>();
    int prefixSum = 0;
    int maxLength = -1;
    // map.put(0,-1);
    
    for(int i =0; i< arr.length; i++){
        prefixSum += arr[i];
        if(prefixSum == 0){
            int len = i + 1;
            maxLength = Math.max(maxLength, len);
        }   
        if(map.containsKey(prefixSum)){
            int len = i - map.get(prefixSum);
            maxLength = Math.max(maxLength, len);
        }else{
            map.put(prefixSum, i);
        }
    }
    System.out.println(maxLength);  
    }
}
