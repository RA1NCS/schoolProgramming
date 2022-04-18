package aLevelCS;

public class linkedListJava {

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
        outputNodes(linkedList, startPointer);

        System.out.println("-----------");

        addMiddleNode(linkedList, 7, 3, emptyList);
        outputNodes(linkedList, startPointer);

    }

    public static boolean addNode(node[] arr, int data, int emptyList) {

        int lastIndex = 0;
        node added = new node (data, -1);
        int previousPointer;

        if (emptyList < 0 || emptyList > 9) {

            return false;

        } else {

            int currentPointer = 0;

            do {

                previousPointer = currentPointer;
                currentPointer = arr[currentPointer].nextNode;

            } while (currentPointer != -1);

        }

        arr[previousPointer].nextNode = emptyList;
        int temp = emptyList;
        emptyList = arr[emptyList].nextNode;
        arr[temp] = added;

        return true;

    }

    public static void addMiddleNode(node[] arr, int Data, int index, int emptyList) {

        int initialPointer = arr[index - 1].nextNode;
        node toInsert = new node(Data, initialPointer);
        int tempPointer = arr[emptyList].nextNode;
        arr[emptyList] = toInsert;
        arr[index - 1].nextNode = emptyList;
        emptyList = tempPointer;

    }

    public static void deleteMiddleNode(node[] arr, int item) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].data == item) {

                index = i;

            }

        }

        int changePointer = arr[index].nextNode;
        int currentpointer = 0;
        int previousPointer;

        do {

            previousPointer = currentpointer;
            currentpointer = arr[currentpointer].nextNode;

        } while (currentpointer != index);

        arr[previousPointer].nextNode = changePointer;

    }

    public static void outputNodes(node[] arr, int currentPointer) {

        while (currentPointer != -1) {

            System.out.println(arr[currentPointer].data);
            currentPointer = arr[currentPointer].nextNode;

        }

    }

}

class node {

    public int data;
    public int nextNode;

    public node (int data, int nextNode) {

        this.data = data;
        this.nextNode = nextNode;

    }

}