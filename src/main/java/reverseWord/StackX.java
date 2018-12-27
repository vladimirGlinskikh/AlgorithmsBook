package reverseWord;

public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int max) {
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) { // размещение элемента на вершине стека
        stackArray[++top] = j;
    }

    public char pop() { // извлечение элемента с вершины стека
        return stackArray[top--];
    }

    public char peek() { // чтение элемента с вершины стека
        return stackArray[top];
    }

    public boolean isEmpty() { // True, если стек пуст
        return (top == -1);
    }
}
