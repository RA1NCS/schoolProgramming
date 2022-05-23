package PastPaperQuestions;

class node1 {

    int data;
    int nextnode1;

    public node1(int data, int nextnode1) {

        this.data = data;
        this.nextnode1 = nextnode1;

    }

}

public class May21P42 {

    public static void main(String[] args) {

        node1[] linkedList = new node1[10];
        linkedList[0] = new node1(1, 1);
        linkedList[1] = new node1(5, 4);
        linkedList[2] = new node1(6, 7);
        linkedList[3] = new node1(7, -1);
        linkedList[4] = new node1(2, 2);
        linkedList[5] = new node1(0, 6);
        linkedList[6] = new node1(0, 8);
        linkedList[7] = new node1(56, 3);
        linkedList[8] = new node1(0, 9);
        linkedList[9] = new node1(0, -1);

        int startPointer = 0;
        int emptyList = 5;

        System.out.println("Before Adding:");
        outputnode1s(linkedList, startPointer);
        addnode1(linkedList, 5, emptyList);

    }

    public static void outputnode1s(node1[] arr, int currentPointer) {

        while (currentPointer != -1) {

            System.out.println(arr[currentPointer].data);
            currentPointer = arr[currentPointer].nextnode1;

        }

    }

    public static boolean addnode1(node1[] arr, int data, int emptyList) {
    	
        node1 added = new node1(data, -1);
        int previousPointer;

        if (emptyList < 0 || emptyList > 9) {

            return false;

        } else {

            int currentPointer = 0;

            do {

                previousPointer = currentPointer;
                currentPointer = arr[currentPointer].nextnode1;

            } while (currentPointer != -1);

        }

        arr[previousPointer].nextnode1 = emptyList;
        int temp = emptyList;
        emptyList = arr[emptyList].nextnode1;
        arr[temp] = added;

        return true;

    }

}