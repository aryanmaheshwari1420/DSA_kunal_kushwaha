package LinkedList;

import java.util.List;

public class cyclequestion  {
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
        if (length == 0)
            return null;
        // finding start
        ListNode f = head;
        ListNode s = head;
        while (length > 0) {
            s = s.next;
            length--;
        }
        // keep moving both forward and they will meet at start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    // Google question
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do {
            slow = findsquare(slow);
            fast = findsquare(findsquare(fast));
        }
        while (slow != fast);
        if (slow == 1) {
            return true;
        }
        return false;
    }

    private int findsquare(int number) {
        int ans = 0;
        while (number != 0) {
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;

    }

    public ListNode middleNode(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = current;
        return head;

    }

    public ListNode reverseList(ListNode head) {

        if (head == null)
            return head;
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev; // at the end my head is at prev so return prev
    }


    // que- palindrome linked list
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode tempReverse = headSecond;

        // compare both the halves
        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(tempReverse);
        if (head == null || headSecond == null) {
            return true;
        }
        return false;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode mid = middleNode(head);
        ListNode hs = reverseList(mid);
        ListNode hf = head;

        // re-arrange
        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        // next of tail to null
        if (hf != null) {
            hf.next = null;
        }
    }
    // que - rotate list
    public ListNode rotateRight(ListNode head, int k) {

        if( k <=0 || head == null || head.next == null){
            return head;
        }
        ListNode last = head;
        int length = 1;
        while (last.next!=null){
            last = last.next;
            length++;
        }
        last.next = head;
        int rotation = k % length;
        int skip = length - rotation;
        ListNode newlast = head;
        for (int i = 0; i < skip-1; i++) {
            newlast = newlast.next;
        }
        head = newlast.next;
        newlast.next = null;
        return head;
    }

    public static void main(String[] args) {

    }
}
