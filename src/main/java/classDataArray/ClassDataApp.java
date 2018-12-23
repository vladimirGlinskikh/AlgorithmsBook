package classDataArray;

public class ClassDataApp {
    public static void main(String[] args) {
        int maxSise = 100;
        ClassDataArray arr = new ClassDataArray(maxSise);

        arr.insert("Vladimir", "Glinskikh", 43);
        arr.insert("Vladimir", "Lenin", 156);
        arr.insert("Andrey", "Shatalov", 50);
        arr.insert("Andrey", "Grishenko", 40);
        arr.insert("Vasiliy", "Tkachuk", 42);
        arr.insert("Nikolay", "Gavrilov", 55);
        arr.insert("Anna", "Poleshuk", 34);
        arr.insert("Nikolay", "Romanov", 48);
        arr.insert("Alexey", "Shepeta", 48);
        arr.insert("Anton", "Arhimed", 44);

        arr.displayA();

        String searchKey = "Anna";
        Person found = arr.find(searchKey);
        if (found != null) {
            System.out.print("Found ");
            found.displayPerson();
        } else
            System.out.println("Can't find " + searchKey);

        System.out.println("Deleting Alexey, Nikolay, and Vladimir");
        arr.delete("Alexey");
        arr.delete("Nikolay");
        arr.delete("Vladimir");

        arr.displayA();
    }
}
