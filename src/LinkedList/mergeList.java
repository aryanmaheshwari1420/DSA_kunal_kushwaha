package LinkedList;

public class mergeList extends insert_using_recursion{


    public static mergeList merge(mergeList first , mergeList second){
        Node f = first.head;
        Node s = second.head;
        mergeList ans = new mergeList();
        while(f!=null && s!=null){
            if(f.value<s.value){
                ans.insertLast(f.value);
                f = f.next;
            }
            else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f!=null){
            ans.insertLast(f.value);
            f = f.next;

        }
        while(s!=null){
        ans.insertLast(s.value);
        s = s.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        mergeList first = new mergeList();
        mergeList second = new mergeList();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        mergeList ans = mergeList.merge(first,second);
        ans.display();


    }
}
