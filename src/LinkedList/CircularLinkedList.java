package LinkedList;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public CircularLinkedList(Node head, Node tail) {
        this.head = null;
        this.tail = null;
    }
    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.println(temp.val + "--> ");
                temp = temp.next;
            } while (temp != null);
        }
        System.out.println("END");
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }



    public void delete(int val) {
        Node node = head;
        if(node==null){
            return;
        }
        if(node.val==val){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.val==val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node!=head);


    }
}