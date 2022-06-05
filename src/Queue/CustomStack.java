package Queue;

public class CustomStack {


    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = - 1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }





    public static void main(String[] args) {

    }
}
