package aLevelCS;

public class stackJava {
    public static int[] stack = new int[5];
    public static int basePointer = 0;
    public static int topPointer = -1;

    public static void main(String[] args) {
        push(6);
        push(69);
        pop();
        printStack();
        System.out.println(stack[1]);
    }

    public static void push(int toAdd) {
        if (topPointer == stack.length - 1) System.out.println("Stack is full");
        else {
            topPointer++;
            stack[topPointer] = toAdd;
        }
    }

    public static void pop() {
        if (topPointer == -1) System.out.println("Stack is empty");
        else {
            stack[topPointer] = 0;
            topPointer--;
        }
    }

    public static void printStack() {
        for (int i = basePointer; i <= topPointer; i++) System.out.println(stack[i]);
    }
}