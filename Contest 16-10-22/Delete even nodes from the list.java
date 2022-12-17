/*

 class Node 
{  
    int data;  
    Node next;  
    Node(int x)  
    {  
        data = x;  
        next = null;  
    }  
};
*/
static Node deleteEven(Node head){
//Enter your code here
 Node ptr = head;
 Node next;
 do{
     if(ptr.data%2 ==0)
     deleteNode(head,ptr);
     next = ptr.next;
     ptr = next;
 }
 while(ptr != head);
 return head;
} 

static Node deleteNode(Node head1,Node del){
    Node temp = head1;
    if(head1 == del){
        head1 = del.next;
    }
    while(temp.next != del){
        temp = temp.next;
    }
    temp.next = del.next;
    return head1;
}
