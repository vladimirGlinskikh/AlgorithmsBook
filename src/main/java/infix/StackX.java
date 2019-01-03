package infix;

public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    //размещение элемента на вершине стека
    public void push(char j) {
        stackArray[++top] = j;
    }

    //извлечение элемента с вершины стека
    public char pop() {
        return stackArray[top--];
    }

    //чтение элемента с вершины стека
    public char peek() {
        return stackArray[top];
    }

    //true, если стек пуст
    public boolean isEmpty() {
        return (top == -1);
    }

    //текущий размер стека
    public int size() {
        return top + 1;
    }

    // чтение элемента с индексом n
    public char peekN(int n) {
        return stackArray[n];
    }

    public void displayStack(String s) {
        System.out.print(s);
        System.out.print("Stack (bottom-->top): ");
        for (int j = 0; j < size(); j++) {
            System.out.print(peekN(j));
            System.out.print(' ');
        }
        System.out.println("");
    }
}
