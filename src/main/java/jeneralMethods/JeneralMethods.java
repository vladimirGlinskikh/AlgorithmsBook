package jeneralMethods;

public class JeneralMethods {
    protected long[] a;   //ссылка на массив а
    protected int nElems;

    public JeneralMethods(int maxSize) {
        a = new long[maxSize];
        nElems = 0;
    }

    public boolean delete(long value) {  // Удаление элемента
        int j;
        for (j = 0; j < nElems; j++)     // Поиск заданного значения
            if (value == a[j])           // Значение найдено, выходим
                break;
        if (j == nElems)                 // Найти не удалось
            return false;
        else {                           // Если значение найдено
            for (int k = j; k < nElems; k++) // Сдвиг последующих элементов
                a[k] = a[k + 1];
            nElems--;                        // Уменьшение размера
            return true;
        }
    }

    public void insertSorted(long value) {    // Вставка элемента в массив
        int j;
        for (j = 0; j < nElems; j++)    // Определение позиции вставки
            if (a[j] > value)           // (линейный поиск)
                break;
        for (int k = nElems; k > j; k--)// Перемещение последующих элементов
            a[k] = a[k - 1];
        a[j] = value;                   // Вставка
        nElems++;                       // Увеличение размера
    }

    public void insert(long value) {  // Вставка элемента в массив
        a[nElems] = value;            // Собственно вставка
        nElems++;
    }

    public boolean findLinear(long searchKey) {  // Поиск заданного значения
        int j;
        for (j = 0; j < nElems; j++)      // Для каждого элемента
            if (a[j] == searchKey)         // Значение найдено?
            {
                break;                     // Да - выход из цикла
            }
        if (j == nElems)               // Достигнут последний элемент?
            return false;              // Да
        else
            return true;               // Нет
    }

    public int findBinary(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey)
                return curIn;                       // Элемент найден
            else if (lowerBound > upperBound)
                return nElems;                      // Элемент не найден
            else {                                  // Деление диапазона
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1;         // В верхней половине
                else
                    upperBound = curIn - 1;         // В нижней половине
            }
        }
    }

    public void display() {               // Вывод содержимого массива
        for (int j = 0; j < nElems; j++)  // Для каждого элемента
            System.out.print(a[j] + " "); // Вывод
        System.out.println("");
    }

    public int size() {
        return nElems;
    }
}
