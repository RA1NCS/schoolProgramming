package PastPaperQuestions;

import java.util.Scanner;

class Node {
	int data;
	int nextNode;
	
	public Node(int dataX, int nextNodeX) {
		this.data = dataX;
		this.nextNode = nextNodeX;
	}
	
}

public class May2021P42 {

	public static void main(String[] args) {

		Node[] linkedList = new Node[10];
		linkedList[0] = new Node(1 , 1);
		linkedList[1] = new Node(5 , 4);
		linkedList[2] = new Node(6 , 7);
		linkedList[3] = new Node(7 , -1);
		linkedList[4] = new Node(2 , 2);
		linkedList[5] = new Node(0 , 6);
		linkedList[6] = new Node(0 , 8);
		linkedList[7] = new Node(56 , 3);
		linkedList[8] = new Node(0 , 9);
		linkedList[9] = new Node(0 , -1);
		
		int startPointer = 0;
		int emptyList = 5;
		
		outputNodes(linkedList, startPointer);
		System.out.println("-------------------");
		String added = (addNode(linkedList, startPointer, emptyList)) ? "Node added." : "Node failed to be added.";
		System.out.println(added);
		System.out.println("-------------------");
		outputNodes(linkedList, startPointer);
		
	}
	
	////////////////////////////////////////////////////////////////////////////////
	
	public static void outputNodes(Node[] linkedList, int startPointer) {
		while (startPointer != -1) {
			if (linkedList[startPointer].data == 0) {
				return;
			} else {
				System.out.println(linkedList[startPointer].data);
				startPointer = linkedList[startPointer].nextNode;
			}

		}
	}
	
	////////////////////////////////////////////////////////////////////////////////
	
	public static boolean addNode(Node[] linkedList, int startPointer, int emptyList) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the data to be added: ");
		int dataIn = userInput.nextInt();
		
		for (int i = 0; i < 10; i++) {
			if (linkedList[i].nextNode == -1) {
				linkedList[i].nextNode = emptyList;
				linkedList[emptyList].data = dataIn;
				 return true;
			}
		} return false;
		
		
	}

}