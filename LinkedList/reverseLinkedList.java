// Leetcode-> https://leetcode.com/problems/reverse-linked-list/description/

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
        Node node=new Node(i);
        node.next=head;
        head=node;
        return node;
    }
    
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
    public Node reverse(){
        
        Node prev=null;
        Node curr=head;
        Node next=null;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return head=prev;
    }
    public static void main(String[] args) {
        Main mn=new Main();
        for(int i=1;i<6;i++){
            mn.insertAtEnd(i);
        }
        mn.print();
        mn.reverse();
        mn.print();
    }
}