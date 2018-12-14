package array;

public class ArrayApp {
    public static void main(String[] args) {
        long[] arr = new long[100];
        int nElems = 0; // колличество элементов
        int j; // счетчик цикла
        long searchKey;

        arr[0] = 77; // вставка 10 элементов
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElems = 10;

        for (j = 0; j < nElems; j++)  // вывод элементов
            System.out.print(arr[j] + " ");
            System.out.println("");


        searchKey = 66; // поиск элемента с ключом 66
        for (j = 0; j < nElems; j++) // для каждого элемента
            if (arr[j] == searchKey) // значение найдено?
                break;               // да. Выход из цикла
            if (j == nElems)         // Достигнут последний элемент?
                System.out.println("Can't find " + searchKey); // Да
            else
                System.out.println("Found " + searchKey); // Нет.


        searchKey = 55; // Удаление элемента с ключом 55
        for (j = 0; j < nElems; j++)  // поиск удаляемого элемента
            if (arr[j] == searchKey)
                break;
            for (int k = j; k < nElems - 1; k++) // Сдвиг последующих элементов
                arr[k] = arr[k + 1];
            nElems--;                           // Уменьшение размера

            for (j = 0; j < nElems; j++) // Вывод элементов
                System.out.print(arr[j] + " ");
            System.out.println("");
    }
}
