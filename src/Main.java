public class Main {
    public static void main(String[] args) {
        DEQueue deq = new DEQueue(10);
        deq.insertRear(10);
        deq.insertRear(20);
        deq.insertRear(0);
        deq.insertRear(7);
        deq.insertRear(8);
        deq.insertRear(-1);
        deq.insertRear(100);
        deq.insertRear(4);
        deq.printDEQueue();
        deq.removeFront();
        deq.printDEQueue();
        deq.removeFront();
        deq.printDEQueue();
        deq.removeFront();
        deq.printDEQueue();
//        deq.printDEQueue();
//        deq.removeFront();
        deq.insertFront(60);
        deq.printDEQueue();
        deq.insertFront(2);
        deq.printDEQueue();
        deq.insertFront(3);
        deq.printDEQueue();
        deq.insertFront(5);
        deq.printDEQueue();
        deq.removeRear();
        deq.removeRear();
        deq.printDEQueue();
    }
}