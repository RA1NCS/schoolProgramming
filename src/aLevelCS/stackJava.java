package aLevelCS;

// THIS FILE CANNOT RUN.

class Stack {

    int stackAlpha[] = new int[] {
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0
    };

    int basePointer = 0, topPointer = -1, item;
    final int stackFull = 10;

    public void push(int item) {

        if (topPointer < stackFull - 1) {

            topPointer++;
            stackAlpha[topPointer] = item;

        }
        System.out.println("Stack is full, please pop an element to push further.");

    }

    public void pop() {

        if (topPointer > basePointer) {

            topPointer--;
            stackAlpha[topPointer - 1] = item;

        }
        System.out.println("Stack is empty, please push an element to pop anything.");

    }

}