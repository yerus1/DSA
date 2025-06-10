package LinkedList.Basics;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CRUD {

    static Node head;

    static Node insert(int i) {
        Node node = new Node(i);
        node.next = head;
        return head = node;
    }

    static void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            insert(i);
        }
        print();
    }
}
