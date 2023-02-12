package LinkedList;

/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/

public class online_gdb_singly_linked_List{
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst(3);
        list.insertAtFirst(5);
        list.insertAtFirst(7);
        list.insertAtFirst(8);
        list.insertAtFirst(10);
//        list.insertAtLast(15);
        list.display();
        list.deleteFirst();
        list.display();
    }

    static class LL{

        Node head;
        Node tail;
        int size;

        public LL(){
            this.size = 0;
        }

        private class Node{
            int val;
            Node next;

            public  Node(int val,Node next){
                this.val = val;
                this.next = next;
            }
            public  Node(int val){
                this.val = val;
            }
        }

        public void insertAtFirst(int val){
            Node node = new Node(val);
            node.next = head;
            head = node;

            if(tail==null){
                tail = head;
            }
            size+=1;
        }

        public void insertAtIndex(int val, int index){
            Node temp = head;

            for(int i=1;i<index;i++){
                temp = temp.next;
            }

            Node newNode = new Node(val,temp.next);
            temp.next = newNode;
        }

        public  void  insertAtLast(int val){
            if(tail==null){
                insertAtFirst(val);
                return;
            }
            Node node= new Node(val);
            tail.next = node;
            tail = node;
            size+=1;
        }

        public void display(){

            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" --> ");
                temp = temp.next;
            }
            System.out.println("END");
        }

        public int deleteFirst(){
            int val = head.val;
            head = head.next;
            if(head==null){
                tail = null;
            }
            size--;
            return val;
        }

        public int deleteLast(){
            if(size<=1){
                return deleteFirst();
            }
            Node secondLast =  get(size-2);
            int val = tail.val;
            tail = secondLast;
            tail.next = null;
            return val;
        }

        public int deleteIndex(int index){
            if(index==0){
                return deleteFirst();
            }
            if(index==size-1){
                return deleteLast();
            }

            Node prev = get(index-1);
            int val = prev.next.val;
            prev.next = prev.next.next;
            return val;
        }

        public Node find(int value){
            Node node = head;
            while (node!=null){
                if(node.val==value){
                    return node;
                }
                node = node.next;
            }
            return null;
        }

        public Node get(int index){
            Node node = head; // this is function for the previous step most important
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }

    }
}
