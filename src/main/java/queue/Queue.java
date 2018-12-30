package queue;

public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    //вставка элемента в конец очереди
    public void insert(long j) {
        if (rear == maxSize - 1) // циклический перенос
            rear = -1;
        queArray[++rear] = j;// увеличение rear и вставка
        nItems++;// увеличение количества элементов
    }

    public long remove() {//извлечение элемента в начале очереди
        long temp = queArray[front++];
        // выборка и увеличение front
        if (front == maxSize)
        front = 0;
        nItems--;
        return temp;
    }

    public long peekFront() { //чтение элемента в начале очереди
        return queArray[front];
    }

    public boolean isEmpty() {// true, если очередь пуста
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);// true, если очередь заполнена
    }

    public int size() {// количество элементов в очреди
        return nItems;
    }
}
