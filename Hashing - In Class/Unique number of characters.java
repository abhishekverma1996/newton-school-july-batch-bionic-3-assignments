import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     static int cntDistinct(String str)
{
     
    // Set to store unique characters
    // in the given string
    HashSet<Character> s = new HashSet<Character>();
 
    // Loop to traverse the string
    for(int i = 0; i < str.length(); i++)
    {
         
        // Insert current character
        // into the set
        s.add(str.charAt(i));
    }
 
    // Return Answer
    return s.size();
}

    public static void main (String[] args) {
                      // Your code here
    Scanner sc= new Scanner(System.in);
    String str = sc.nextLine();
    System.out.print(cntDistinct(str));
    }
}
