package LinkedList;

public class doubly_bubly {
    public static void main(String[] args) {

    }

    public class DLL{
        Node head;
        Node tail;

        private class Node{
            int val;
            Node next;
            Node prev;

            public Node(int val){
                this.val = val;
            }

            public Node(int val, Node next, Node prev) {
                this.val = val;
                this.next = next;
                this.prev = prev;
            }
        }

        void insertAtFirst(int val){
            Node node = new Node(val);
            head = node;
            node.next = head;
            node.prev = null;
            if(head!=null){
                head.prev = node;
            }
        }

        void insertAtLast(int val){
            Node node = new Node(val);
            node.next = null;
            Node last = head;
            while (last.next!=null){
                last = last.next;
            }
            last.next = node;
            node.prev  = last;
            last = node;
            if(head==null){
                node.prev = null;
                head = node;
            }
        }
    }

}
