package LinkedList;
public class insert_using_recursion {

    public Node head;
    private Node tail;

    private int  size;


    public class Node{
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public insert_using_recursion(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node  = new Node(val);
        node.next = head;
        head  = node;

        if (tail == null){
            tail = head;
        }

        size+=1;
    }


    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail= null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public Node find(int value){
        Node node = head;
        while (node!=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return node;
    }



    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }



    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

        if(tail==null){
            insertFirst(val);
            return;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // insert using recursion
    public void insertRec(int val, int index){
        head = insertRec(val,index,head);
    }
    private Node insertRec(int val , int index , Node node){
        if(index==0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val , index-- , node.next);
        return node;
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

    public static void main(String[] args) {
//        SinglyLinkedList obj = new SinglyLinkedList();
//        obj.insertFirst(5);
//        obj.insertFirst(17);
//        obj.insertFirst(36);
//        obj.insertFirst(24);
//
//        obj.display();
        insert_using_recursion obj = new insert_using_recursion();
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
}
