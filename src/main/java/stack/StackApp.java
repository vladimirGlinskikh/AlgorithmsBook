package stack;

public class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while (!theStack.isEmpty()) { // Пока стек не станет пустым
            long value = theStack.pop(); // Удалить элемент из стека
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
