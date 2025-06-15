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

    static void insertAtBegin(int i) {
        Node node = new Node(i);
        node.next = head;
        head = node;
    }

    static void insertAtEnd(int i) {
        Node node = new Node(i);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            insertAtEnd(i);
        }
        print();
    }
}

// 5-> 4-> 3-> 2-> 1-> 0-> null InsertAtBegin
// 0-> 1-> 2-> 3-> 4-> 5-> null InsertAtEnd