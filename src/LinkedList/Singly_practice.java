package LinkedList;

public class Singly_practice {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
        }
    }
    void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void insertAtLast(int data){
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        if(tail==null){
            insertAtFirst(data);
        }
    }
    void display(){
        Node  currentnode = head;
        while(currentnode!=null){
            System.out.println(" "+currentnode.data);
            currentnode = currentnode.next;
        }
    }
    void deleteFromIndex(int index){
        if(index==0){
            head = head.next;
        }
        int c = 1;
        int flag = 0;
        Node currentNode = head.next;
        Node prev = head;
        while(currentNode!=null){
            if(c==index){
                flag=1;
                break;
            }
            currentNode = currentNode.next;
            prev = prev.next;
        }
        if(flag==1){
            if(currentNode.next==null){
                tail = prev;
            }
            prev.next = currentNode.next;
        }
    }
    public static void main(String[] args) {
        Singly_practice obj = new Singly_practice();
        obj.insertAtFirst(5);
        obj.insertAtFirst(6);
        obj.insertAtFirst(7);
        obj.insertAtFirst(8);
        obj.insertAtFirst(10);
        obj.deleteFromIndex(3);
        obj.display();

    }
}
