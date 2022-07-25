package LinkedList;

public class cyclequestion {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public boolean hasCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

//    que - to find the length of cycle
public int cyclelength(ListNode head) {

    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        if (fast == slow) {
            ListNode temp = slow;
            int length = 0;
            do {
                temp = temp.next;
                length++;
            } while (temp != fast);
            return length;
        }
    }
    return 0;
}

    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = cyclelength(slow);
                break;
            }
        }
        if (length==0)
            return null;
        // finding start
        ListNode f = head;
        ListNode s = head;
        while (length > 0){
            s = s.next;
            length--;
        }
        // keep moving both forward and they will meet at start
        while (f!=s){
            f= f.next;
            s = s.next;
        }
        return s;
    }

    public static void main(String[] args) {

    }
}
