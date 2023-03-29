package aLevelCS;

public class queueJava {
    public static int[] queue = new int[5];
    public static int frontPointer = -1;
    public static int rearPointer = 0;

    public static void main(String[] args) {
        enQueue(6);
        enQueue(7);
        enQueue(8);
        deQueue();
        printQueue();
    }

    public static void enQueue(int toAdd) {
        if (frontPointer == queue.length - 1) System.out.println("queue is full");
        else {
            frontPointer++;
            queue[frontPointer] = toAdd;
        }
    }

    public static void deQueue() {
        if (frontPointer == -1) System.out.println("queue is empty");
        else {
            queue[rearPointer] = 0;
            rearPointer++;
        }
    }

    public static void printQueue() {
        for (int i = rearPointer; i <= frontPointer; i++) System.out.println(queue[i]);
    }
}