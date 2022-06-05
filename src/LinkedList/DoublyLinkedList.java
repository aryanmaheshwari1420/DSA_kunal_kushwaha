package LinkedList;

public class DoublyLinkedList {
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int data) {
            this.value = data;
        }

        public Node(int data, Node next, Node prev) {
            this.value = data;
            this.next = next;
            this.prev = prev;
        }
    }

    private  Node head;
    public void insertFirst(int val){
        Node node  = new Node(val);
        node.next  = head;
        node.prev  = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.value+ "-->");
            node = node.next;
        }
        System.out.println("End");
    }



























    public static void main(String[] args) {

    }
}
