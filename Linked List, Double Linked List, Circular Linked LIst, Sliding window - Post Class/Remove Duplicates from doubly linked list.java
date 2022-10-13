/*
class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/
static Node deleteNode(Node head, Node del)
{
    // base case
    if (head == null || del == null)
        return head;

    if (head == del)
        head = del.next;
 
    if (del.next != null)
        del.next.prev = del.prev;
 
    if (del.prev != null)
        del.prev.next = del.next;
    return head;
}
  public static Node deleteDuplicates(Node head) {
//complete this function
       if ((head) == null ||(head).next == null)
        return head;
 
    Node ptr1, ptr2;
 
    // pick elements one by one
    for (ptr1 = head;ptr1 != null; ptr1 = ptr1.next)
    {
        ptr2 = ptr1.next;
        while (ptr2 != null)
        {
            if (ptr1.val == ptr2.val)
            {
                Node next = ptr2.next;
                head = deleteNode(head, ptr2);
                ptr2 = next;
            }
            else
                ptr2 = ptr2.next;
        }
    }
    return head;
}
