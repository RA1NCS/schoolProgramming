package aLevelCS;

public class linkedList {

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
        System.out.println("-----------");
        outputNodes(linkedList, startPointer);

        addNode(linkedList, 5, emptyList);
    }

    public static void outputNodes(node[] arr, int currentPointer) {
        while (currentPointer != -1) {
            System.out.println(arr[currentPointer].data);
            currentPointer = arr[currentPointer].nextNode;
        }
    }

    public static boolean addNode(node[] arr, int Data, int emptyList) {
        node added = new node(Data, -1);
        if (emptyList < 0 || emptyList > 9) {
            return false;
        } else {

            int currentpointer = 0;
            int previouspointer;
            do {
                previouspointer = currentpointer;
                currentpointer = arr[currentpointer].nextNode;
            }
            while (currentpointer != -1);

            arr[previouspointer].nextNode = emptyList;
            int temp = emptyList;
            emptyList = arr[emptyList].nextNode;
            arr[temp] = added;
            return true;
        }

    }
}

class node {
    int data;
    int nextNode;

    public node(int data, int nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }
}