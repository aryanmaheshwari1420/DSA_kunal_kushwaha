package LinkedList;

import LinearSearch.VarArgs;

public class practice_doubly {
    public static void main(String[] args) {

    }

    public class DLL{
        Node head;
        Node tail;
        private class Node{
            int val;
            Node next;
            Node prev;

            public Node(int val, Node next, Node prev) {
                this.val = val;
                this.next = next;
                this.prev = prev;
            }

            public Node(int val) {
                this.val = val;
            }
        }

        public void insert(int val){
            Node node = new Node(val);
            node.next = head;
            node.prev = null;
            if(head!=null){
                head.prev = node;
            }
            head = node;
        }

        public void insertAtLast(int val){
            Node node = new Node(val);
            node.next = null;
            Node last = head;
            if(head==null){
                head = node;
                node.prev =null;
                return;
            }
            while (last.next!=null){
                last = last.next;
            }
            last.next = node;
            node.prev = last;


        }

        public void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.val +" -> ");
            }
            System.out.println("END") ;
        }

    }
}
