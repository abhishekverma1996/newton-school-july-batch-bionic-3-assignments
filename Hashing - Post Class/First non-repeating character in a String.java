import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
  static int nonRepeating(String s){
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                int val = hm.get(s.charAt(i));
                hm.put(s.charAt(i), val+1);
            }
            else{
                hm.put(s.charAt(i), 1);
            }
        }
        for(int i=0; i<s.length(); i++){
            if(hm.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(nonRepeating(s));
    }
}
