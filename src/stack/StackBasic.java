package stack;

import java.util.Scanner;

public class StackBasic {

    public static int[] myStack = new int[10];
    public static int top = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < myStack.length; i++) {
            int input = scanner.nextInt();
            push(input);
        }
        printStack();
        while (true) {
            String pop = scanner.next();
            if (top < 0)
                break;
            if (pop.equalsIgnoreCase("pop")) {
                pop();
                printStack();
            }
        }
    }

    private static void pop() {
        top--;
    }

    private static void printStack() {
        System.out.print("output: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(myStack[i] + "\t");
        }
    }

    private static void push(int number) {
        if (top >= myStack.length - 1) {
            return;
        }
        myStack[++top] = number;
    }
}
