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
    public Node inserAtBeg(int i){
        Node node=new Node(i);
        node.next=head;
        return head=node;
    }

    // Insert at End
    public Node insertAtEnd(int i){
        Node node=new Node(i);
        
        if(head==null){
            return head=node;
        }
        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp.next=node;
    }

    // Insert at Position
    public Node insertAtPos(int pos,int p){
        Node node=new Node(p);
        
        if(pos==1){
            node.next=head;
            head=node;
            return node;
        }
        
        Node temp=head;
        for(int i=2;i<pos;i++){
            temp=temp.next;
            if(temp.next==null) return null;
        }
        
        node.next=temp.next;
        return temp.next=node;
        
    }

    // Delete At Beginning 
    public Node deleteAtBeg(){
        head=head.next;
        return head;
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
            temp=temp.next;
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