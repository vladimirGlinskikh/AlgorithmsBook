package array;

public class HighArray {
    private long[] a;   //ссылка на массив а
    private int nElems; // Количество элементов в массиве

    public HighArray(int max) { // Конструктор
        a = new long[max];      // Создание массива
        nElems = 0;             // Пока нет ни одного элемента
    }

    public boolean find(long searchKey) {  // Поиск заданного значения
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

    public void insert(long value) {  // Вставка элемента в массив
        a[nElems] = value;            // Собственно вставка
        nElems++;                     // Увеличение размера
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

    public void display() {               // Вывод содержимого массива
        for (int j = 0; j < nElems; j++)  // Для каждого элемента
            System.out.print(a[j] + " "); // Вывод
        System.out.println("");
    }
}
