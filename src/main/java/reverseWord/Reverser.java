package reverseWord;

public class Reverser {
    private String input; // входная строка
    private String output;// выходная строка

    public Reverser(String in) {
        input = in;
    }

    public String doRev() { // перестановка символов
        int stackSize = input.length(); // определение размера стека
        StackX theStack = new StackX(stackSize); // создание стека
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);// чтение символа из входного потока
            theStack.push(ch); // занесение в стек
        }
        output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop(); // извлечение символа из стека
            output += ch; // присоединение к выходной строке
        }
        return output;
    }
}
