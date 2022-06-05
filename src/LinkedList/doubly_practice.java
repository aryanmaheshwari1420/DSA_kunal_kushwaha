package LinkedList;

public class doubly_practice {

    Node head;
    Node tail;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    void addBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }
    }
    void delete(int index){
        if(index == 0){
            head = head.next;
            head.prev = null;
        }
        else{
            int c = 1;
            int flag = 0;
            Node currentNode = head.next;
            while (currentNode.next!=null){
                if(c==index){
                    flag = 1;
                    break;
                }
                c++;
                currentNode = currentNode.next;
            }
            if(flag ==1){
                if(currentNode.next!=null){
                    currentNode.prev.next = currentNode.next;// pnn
                    currentNode.next.prev = currentNode.prev; //npp
                }
                else{
                    tail = currentNode.prev;
                    tail.next = null;
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
