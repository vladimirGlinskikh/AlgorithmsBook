package array;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr = new LowArray(100);
        int nElems = 0; // колличество элементов
        int j; // счетчик цикла

        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        nElems = 10;

        for (j = 0; j < nElems; j++)  // вывод элементов
            System.out.print(arr.getElem(j) + " ");
        System.out.println("");


        int searchKey = 26; // поиск элемента с ключом 66
        for (j = 0; j < nElems; j++) // для каждого элемента
            if (arr.getElem(j) == searchKey) // значение найдено?
                break;               // да. Выход из цикла
        if (j == nElems)         // Достигнут последний элемент?
            System.out.println("Can't find " + searchKey); // Да
        else
            System.out.println("Found " + searchKey); // Нет.


        searchKey = 55; // Удаление элемента с ключом 55
        for (j = 0; j < nElems; j++)  // поиск удаляемого элемента
            if (arr.getElem(j) == searchKey)
                break;
        for (int k = j; k < nElems - 1; k++) // Сдвиг последующих элементов
            arr.setElem(k, arr.getElem(k + 1));
        nElems--;                           // Уменьшение размера

        for (j = 0; j < nElems; j++) // Вывод элементов
            System.out.print(arr.getElem(j) + " ");
        System.out.println("");
    }
}
