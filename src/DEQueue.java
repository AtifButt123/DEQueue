public class DEQueue {
    private int front;
    private int rear;
    private int size;
    private int [] queue;

    public DEQueue(int size) {
        this.front = -1;
        this.rear = -1;
        this.size = size;
        queue = new int[size];
    }

    private boolean isEmpty(){
        if(front == -1){
            return true;
        }
        return false;
    }
    private boolean isFull(){
        if(front == 0 && rear == size - 1){
            return true;
        }
        return false;
    }
    public int insertRear(int val){
        if(isFull())
            return -1;
        else{
            if(isEmpty())
                front = 0;
            queue[++rear] = val;
        }
        return 0;
    }
    public int insertFront(int val){
        if(front==0) {
            System.out.println("Can't add at front at the moment!");
            return -1;
        }
        else{
            System.out.println("Adding " + val);
            queue[--front] = val;
        }
        return 0;
    }
    public int removeFront(){
        if(isEmpty())
            return -1;
        else{
            System.out.println("Removed " +  queue[front]);
            front++;
            if(front == rear)
            {
                front = -1;
                rear = -1;
            }
        }
        return 0;
    }
    public int removeRear(){
        if(isEmpty())
            return -1;
        else{
            System.out.println("Removed " +  queue[rear]);
            rear--;
        }
        return 0;
    }
    public void printDEQueue(){
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
    }
}
