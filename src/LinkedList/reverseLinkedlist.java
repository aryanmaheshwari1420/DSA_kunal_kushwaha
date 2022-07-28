package LinkedList;


// recursive
public class reverseLinkedlist extends doubly_practice {
    public void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        // this is when , when coming out of recursion calls
        tail.next = node;
        tail = node;
        tail.next = null;
    }
}
// que - reverse linked list || in cycledetection




        // in place reversal of linked list

//    public void reverse(Node node){
//        if(size <2){
//            return;
//        }
//        Node prev = null;
//        Node present = head;
//        Node next = present.next;
//
//        while (present!=null){
//            present.next = prev;
//            prev = present;
//            present = next;
//            if(next!=null){
//                next = next.next;
//            }
//        }
//        head = prev;
//    }


