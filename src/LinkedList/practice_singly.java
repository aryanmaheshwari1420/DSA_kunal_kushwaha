package LinkedList;

import java.nio.file.NotDirectoryException;

public class practice_singly {
    public static void main(String[] args) {

    }

    class LL{
        Node head;
        Node tail;
        int size;

        private class Node{
            int val;
            Node next;

            public Node(int val){
                this.val = val;
            }
            public Node(int val,Node next){
                this.next = next;
                this.val = val;
            }
        }

        void insertionAtFirst(int val){
            Node node = new Node(val);
            node.next = head;
            head = node;

            if(tail==null){
                tail=head;
            }
        }

        void insertAtLast(int val){
            if(tail==null){
                insertionAtFirst(val);
                return;
            }
            Node node = new Node(val);
            tail.next = node;
            tail = node;

        }

        void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.val+" -> ");
                temp = temp.next;
            }
            System.out.println("END");
        }

        public Node getIndex(int index){
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public int deletionFromLast(){
            Node secondLast = getIndex(size-2);
            int val = tail.val;
            tail = secondLast;
            tail.next =null;
            return val;
        }

        public int deleteFromindex(int index){
            if(index==0){
                deleteFromFirst();
            }
            if(index==size-1){
                deletionFromLast();
            }
            Node prev = getIndex(index-1);
            prev.next = prev.next.next;
            int val = prev.next.val;
            return val;
        }

        public int deleteFromFirst(){
            int val = head.val;
            if(head==null){
                tail = null;
            }
            head = head.next;
            return val;
        }

        public Node find(int value){
            Node temp = head;
            while (temp!=null){
                if(temp.val==value){
                    return temp;
                }
                temp =temp.next;
            }
            return null;
        }

    }
}
