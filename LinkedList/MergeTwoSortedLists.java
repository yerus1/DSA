// Leetcode-> https://leetcode.com/problems/merge-two-sorted-lists/description/

class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Main {
    Node head;
    
    public Node insertAtEnd(int i){
        Node node = new Node(i);
        
        if(head==null){
            return head=node;            
        }
        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        return temp.next=node;
    }
    
    public void print(Node head){
        Node temp=head;
        
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
       System.out.println("null"); 
    }
    
    public static Node mergeList(Node head1,Node head2){
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        
        Node node=new Node(-1);
        Node dummy=node;
        
        while(head1!=null && head2!=null){
        
            if(head1.data<head2.data){
                dummy.next=head1;
                head1=head1.next;
            }else{
                dummy.next=head2;
                head2=head2.next;
            }
            dummy=dummy.next;
        }
        
            if (head1 != null) dummy.next = head1;
            if (head2 != null) dummy.next = head2;
        
            return node.next;
    
    } 
    public static void main(String[] args) {
        Main mn=new Main();
        for(int i=1;i<6;i+=2){
            mn.insertAtEnd(i);
        }
        mn.print(mn.head);
        Main mn1=new Main();
        for(int i=2;i<=6;i+=2){
            mn1.insertAtEnd(i);
        }
        mn1.print(mn1.head);
        Node test=mergeList(mn.head,mn1.head);
        mn.print(test);
        System.out.println(mn.head.data);
        System.out.println(mn1.head.data);
    }
}