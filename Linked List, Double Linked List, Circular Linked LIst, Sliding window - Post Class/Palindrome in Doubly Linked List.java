/*
class Node
{
   char data;
   Node next, prev;
};
*/
 static boolean isPalin( Node left)
    {
        // Write your code here
   if(left==null){
         return true;
      }
      Node right =left;
      while(right.next!=null){
         right=right.next;
      }

      while(left!=right){
         if(left.data!=right.data){
            return false;
         }
         left=left.next;
         right= right.prev;
      }

      return true;
    }
