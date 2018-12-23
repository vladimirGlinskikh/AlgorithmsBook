package classDataArray;

public class ClassDataArray {
    private Person[] a; // ссылка на массив
    private int nElems; // Колличество элементов в данных

    public ClassDataArray(int max) { // Конструктор
        a = new Person[max];        // Создание массива
        nElems = 0;                 // Пока нет ни одного элемента
    }

    public Person find(String searchName) { // Поиск заданного значения
        int j;
        for (j = 0; j < nElems; j++)        // Для каждого элемента
            if (a[j].getLastName().equals(searchName))  // Значение найдено?
                break;                                  // Выход из цикла
        if (j == nElems)                                 // Достигнут последний элемент?
            return null;                                 // Да, значение не найдено
        else
            return a[j];                                 // Нет, значение найдено
    }

    // Включение записи в массив
    public void insert(String last, String first, int age) {
        a[nElems] = new Person(last, first, age);
        // Увеличение размера
        nElems++;
    }

    // Удаление из массива
    public boolean delete(String searchName) {
        int j;
        // Поиск удаляемого элемента
        for (j = 0; j < nElems; j++)
            if (a[j].getLastName().equals(searchName))
                // Найти не удалось
                break;
        if (j == nElems)
            // Значение не найдено
            return false;
        else {
            for (int k = j; k < nElems; k++)
                // Сдвиг последующих элементов
                a[k] = a[k + 1];
            // Уменьшение размера
            nElems--;
            return true;
        }
    }

    public void displayA() {
        for (int j = 0; j < nElems; j++)
            a[j].displayPerson();
    }
}
