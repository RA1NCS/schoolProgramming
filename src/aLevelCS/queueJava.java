package aLevelCS;

class Queue {

    int queueAlpha[] = new int[] {
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
    };

    int frontPointer = 0, rearPointer = -1, queueLength = 0, item;
    final int queueFull = 10;

    void enQueue(int item) {

        if (queueLength < queueFull) {

            if (rearPointer < queueAlpha.length - 1) {

                rearPointer = rearPointer + 1;

            } else {

                rearPointer = 0;

            }

            queueLength = queueLength + 1;
            queueAlpha[rearPointer] = item;

        } else {

            System.out.println("Queue is full, cannot enqueue");

        }

    };

    void deQueue() {

        if (queueLength == 0)

            System.out.println("Queue is empty,cannot dequeue");

        else {

            item = queueAlpha[frontPointer];

            if (frontPointer == queueAlpha.length - 1) {

                frontPointer = 0;

            } else {

                frontPointer = frontPointer + 1;

            }

            queueLength = queueLength - 1;

        }

    }

}
