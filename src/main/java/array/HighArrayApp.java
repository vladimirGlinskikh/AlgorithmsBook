package array;
import jeneralMethods.JeneralMethods;


public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100; // Размер массива
//        HighArray arr = new HighArray(maxSize); // Ссылка и создание массива
        JeneralMethods arr = new JeneralMethods(maxSize);

        arr.insert(77); // Вставка 10 элементов
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display(); // Вывод элементов

        int searchKey = 35; // Поиск элемента
        if (arr.findLinear(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.delete(00); // Удаление трех элементов
        arr.delete(55);
        arr.delete(99);

        arr.display();       // Повторный вывод
    }
}
