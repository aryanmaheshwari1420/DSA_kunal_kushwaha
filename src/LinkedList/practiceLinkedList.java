package LinkedList;

import java.awt.print.PrinterAbortException;

public class practiceLinkedList {
    private Node head;
    private Node tail;
   private class Node{
       private int data;
       private Node next;

       public Node(int data) {
           this.data = data;
       }
       public Node(int data, Node next) {
           this.data = data;
           this.next = next;
       }
   }

    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
    }

    public void display(){
       Node temp = head;
       while(temp!=null){
           System.out.print(temp.data + "--> ");
           temp = temp.next;
       }
        System.out.println("End");
    }

    public void insetLast(int data){
       Node node = new Node(data);
       tail.next = node;
       tail = node;
       if(tail==null){
           insertFirst(data);
           return;
       }
    }


    public static void main(String[] args) {
        practiceLinkedList list = new practiceLinkedList();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(11);
        list.display();

    }
}
