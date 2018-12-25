package bubbleSort;

public class ArrayBub {
    private long[] a; // Ссылка на массив
    private int nElems; // Количество элементов данных

    public ArrayBub(int max) {
        a = new long[max]; // создание массива
        nElems = 0; // Пока нет ни одного элемента
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
            System.out.print("");
        }
    }

    public void bubleSort() {
        int out, in;
        for (out = nElems - 1; out > 1; out--) // Внешний обратный цикл
            for (in = 0; in < out; in++) // Внутренний прямой цикл
                if (a[in] > a[in + 1]) // порядок нарушен?
                    swap(in, in + 1); // поменять местами
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
