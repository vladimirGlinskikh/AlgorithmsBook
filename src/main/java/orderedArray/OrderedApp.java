package orderedArray;

import jeneralMethods.JeneralMethods;

public class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;
        JeneralMethods arr = new JeneralMethods(maxSize);

        arr.insertSorted(55);
        arr.insertSorted(66);
        arr.insertSorted(44);
        arr.insertSorted(77);
        arr.insertSorted(88);
        arr.insertSorted(22);
        arr.insertSorted(11);
        arr.insertSorted(33);
        arr.insertSorted(00);
        arr.insertSorted(99);

        int searchKey = 55;
        if (arr.findBinary(searchKey) != arr.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.display();

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();
    }
}
