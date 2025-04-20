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

    // Insert at Beginning
    public Node insert(int i){
        Node node=new Node(i);
        node.next=head;
        head=node;
        return node;
    }

    // Insert at End
    public Node insertEnd(int i){
        Node node=new Node(i);
        
        if(head==null){
            head=node;
            return node;
        }
        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        return node;
    }

    // insertAtPos
    public Node insertAt(int pos,int i){
        Node node=new Node(i);
        if(pos==1){
            node.next=head;
            head=node;
            return node;
        }
        
        Node temp=head;
        int cur=1;
        while(temp!=null && pos<cur-1){
            temp=temp.next;
            cur++;
        }
        if(temp==null){
            System.out.println("Invalid");
        }
        
        
        node.next=temp.next;
        temp.next=node;
        return node;
    }

    // reverseNode
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

    // print
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
       }

    public static void main(String[] args) {
        Main mn=new Main();
        for(int i=1;i<6;i++){
            mn.insert(i);
        }
        mn.print();
    }
}