package Stack;

public class custom_stack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public custom_stack() {
        this(DEFAULT_SIZE);
    }

    public custom_stack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){

        if (isfull()){
            System.out.println("STACK IS FULL");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackExcetpion{
        if (isempty()){
            throw new StackExcetpion("cannot pop from an empty stack!!");
        }
        int removed = data[ptr];
        ptr--;
        return removed; // or return data [ptr -1];
    }

    public int peek() throws StackExcetpion {
        if (isempty()) {
            throw new StackExcetpion("cannot peek from an empty stack!!");
        }
        return data[ptr];
    }

    public boolean isfull(){
        return ptr == data.length -1; // ptr is at last index
    }

    public boolean isempty(){
        return ptr == -1;
    }
    public static void main(String[] args) throws StackExcetpion {
        custom_stack stack = new custom_stack(5);

        stack.push(23);
        stack.push(24);
        stack.push(3);
        stack.push(20);
        stack.push(2);
        stack.push(26);

//        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
