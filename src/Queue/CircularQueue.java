package Queue;

public class CircularQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int rear = 0;
    protected int front = 0;
    private int size = 0;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return size == data.length;
    }

    public boolean insert(int item){
        if(isEmpty()){
            return false;
        }
        data[rear++] = item;
        return true;
    }
    public boolean isEmpty(){
        return rear == 0;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[front];
        front = front% data.length;
        size--;
        return removed;

    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display(){
        for (int i = front; i < rear; i++) {
            System.out.print(data[i]+" <-");
        }
        System.out.println("END");
    }


    public static void main(String[] args) throws Exception {

        CircularQueue queue = new CircularQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);

        queue.display();

        System.out.println(queue.remove());
    }
}
