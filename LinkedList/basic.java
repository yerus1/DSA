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