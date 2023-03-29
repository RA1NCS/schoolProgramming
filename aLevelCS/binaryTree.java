package aLevelCS;

import java.util.Scanner;

public class binaryTree {

    public static void main (String args[]) {

        int[][] ArrayNodes = new int[20][3];
        int RootPointer = -1;
        int FreeNode = 0;

        for (int i = 0; i < 10; i++) {

            AddNode(ArrayNodes, RootPointer, FreeNode);

        }

        PrintAll(ArrayNodes);

    }

    public static void AddNode (int ArrayNodes[][], int RootPointer, int FreeNode) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the data: ");
        int NodeData = userInput.nextInt();

        if (FreeNode <= 19) {

            ArrayNodes[FreeNode][0] = -1;
            ArrayNodes[FreeNode][1] = NodeData;
            ArrayNodes[FreeNode][2] = -1;

            if (RootPointer == -1) {
                RootPointer = 0;
            } else {

                boolean Placed = false;
                int CurrentNode = RootPointer;

                while (Placed == false) {

                    if (NodeData < ArrayNodes[CurrentNode][1]) {

                        if (ArrayNodes[CurrentNode][0] == -1) {

                            ArrayNodes[CurrentNode][0] = FreeNode;
                            Placed = true;

                        } else {

                            CurrentNode = ArrayNodes[CurrentNode][0];

                        }

                    } else {

                        if (ArrayNodes[CurrentNode][2] == -1) {

                            ArrayNodes[CurrentNode][2] = FreeNode;
                            Placed = true;

                        } else {

                            CurrentNode = ArrayNodes[CurrentNode][2];

                        }

                    }

                }

            }

            FreeNode = FreeNode + 1;

        } else {

            System.out.println("Tree is full");

        }

    }

    public static void PrintAll(int ArrayNodes[][]) {

        for (int i = 0; i < 20; i++) {

            System.out.println(ArrayNodes[i][0] + " " + ArrayNodes[i][1] + " " + ArrayNodes[i][2]);

        }

    }

}
