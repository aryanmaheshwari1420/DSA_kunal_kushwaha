package LinkedList;

public class Remove_duplicates_sortedlist extends
insert_using_recursion{
    public static void main(String[] args) {
        Remove_duplicates_sortedlist obj = new Remove_duplicates_sortedlist();
        obj.insertLast(1);
        obj.insertLast(1);
        obj.insertLast(1);
        obj.insertLast(2);
        obj.insertLast(4);
        obj.insertLast(4);
        obj.display();
        obj.duplicates();
        obj.display();

    }

    private Node head;
    private Node tail;
    private int size;

    private class Node{
        private int value;
        private Node next;
        private int size;

        public Node(int value){
            this.value = value;
        }
        public Node(int value , Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void duplicates(){
        Node node = head; // starting checking from head
        while (node.next!=null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

}
