package PastPaperQuestions;

class node {

    int data;
    int nextnode;

    public node(int data, int nextnode) {

        this.data = data;
        this.nextnode = nextnode;

    }

}

public class May21P42 {

    public static void main(String[] args) {

        node[] linkedList = new node[10];
        linkedList[0] = new node(1, 1);
        linkedList[1] = new node(5, 4);
        linkedList[2] = new node(6, 7);
        linkedList[3] = new node(7, -1);
        linkedList[4] = new node(2, 2);
        linkedList[5] = new node(0, 6);
        linkedList[6] = new node(0, 8);
        linkedList[7] = new node(56, 3);
        linkedList[8] = new node(0, 9);
        linkedList[9] = new node(0, -1);

        int startPointer = 0;
        int emptyList = 5;

        System.out.println("Before Adding:");
        outputnodes(linkedList, startPointer);

    }

    public static void outputnodes(node[] arr, int currentPointer) {

        while (currentPointer != -1) {

            System.out.println(arr[currentPointer].data);
            currentPointer = arr[currentPointer].nextnode;

        }

    }

    public static boolean addnode(node[] arr, int data, int emptyList) {

        int lastIndex = 0;
        node added = new node(data, -1);
        int previousPointer;

        if (emptyList < 0 || emptyList > 9) {

            return false;

        } else {

            int currentPointer = 0;

            do {

                previousPointer = currentPointer;
                currentPointer = arr[currentPointer].nextnode;

            } while (currentPointer != -1);

        }

        arr[previousPointer].nextnode = emptyList;
        int temp = emptyList;
        emptyList = arr[emptyList].nextnode;
        arr[temp] = added;

        return true;

    }

}